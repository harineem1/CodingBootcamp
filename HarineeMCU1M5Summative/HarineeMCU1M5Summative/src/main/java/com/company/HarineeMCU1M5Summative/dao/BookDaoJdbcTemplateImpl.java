package com.company.HarineeMCU1M5Summative.dao;

import com.company.HarineeMCU1M5Summative.dto.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


@Repository
public class BookDaoJdbcTemplateImpl implements BookDao {


    private JdbcTemplate jdbcTemplate;

    private static final String INSERT_BOOK_SQL =
            "insert into book (isbn, publish_date, author_id, title, publisher_id, price) values (?, ?, ?, ?, ?, ?)";

    private static final String SELECT_BOOK_SQL =
            "select * from book where book_id = ?";

    private static final String SELECT_ALL_BOOKS_SQL =
            "select * from book";

    private static final String SELECT_BOOKS_BY_AUTHOR_SQL =
            "select * from book where author_id = ?";

    private static final String UPDATE_BOOK_SQL =
            "update book set isbn = ?, publish_date = ?, author_id = ?, title = ?, publisher_id = ?, price = ?";

    private static final String DELETE_BOOK =
            "delete from book where book_id = ?";
    @Autowired
    public BookDaoJdbcTemplateImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
     }

    @Override
    @Transactional
    public Book addBook(Book book) {

        jdbcTemplate.update(
                INSERT_BOOK_SQL,
                book.getIsbn(),
                book.getPublishDate(),
                book.getAuthorId(),
                book.getTitle(),
                book.getPublisherId(),
                book.getPrice());

        int id = jdbcTemplate.queryForObject("select LAST_INSERT_ID()", Integer.class);

        book.setBookId((id));

        return book;
    }

    @Override
    public Book getBook(int id) {

        try {
            return jdbcTemplate.queryForObject(SELECT_BOOK_SQL, this::mapRowToBook, id);
        } catch (EmptyResultDataAccessException e) {
            // if there is no match for this book id, return null
            return null;
        }
    }

    @Override
    public List<Book> getAllBooks() {

        return jdbcTemplate.query(SELECT_ALL_BOOKS_SQL, this::mapRowToBook);
    }

    //@Override
    public List<Book> getBooksByAuthor(int authorId) {

        return jdbcTemplate.query(SELECT_BOOKS_BY_AUTHOR_SQL, this::mapRowToBook, authorId);
    }

    @Override
    public void updateBook(Book book) {

        jdbcTemplate.update(
                UPDATE_BOOK_SQL,
                book.getIsbn(),
                book.getPublishDate(),
                book.getAuthorId(),
                book.getTitle(),
                book.getPublisherId(),
                book.getPrice());



    }

    @Override
    public void deleteBook(int id) {

        jdbcTemplate.update(DELETE_BOOK, id);

    }

    @Override
    public void deleteAuthor(int authorId) {

    }


    private Book mapRowToBook(ResultSet rs, int rowNum) throws SQLException {
        Book book = new Book();
        book.setBookId(rs.getInt("book_id"));
        book.setIsbn(rs.getString("isbn"));
        book.setPublishDate(rs.getDate("publish_date").toLocalDate());
        book.setAuthorId(rs.getInt("author_id"));
        book.setTitle(rs.getString("title"));
        book.setPublisherId(rs.getInt("publisher_id"));
        book.setPrice(rs.getDouble("price"));

        return book;
    }


}
