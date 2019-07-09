package com.company.HarineeMCU1M5Summative.dao;



import com.company.HarineeMCU1M5Summative.dto.Book;
import com.company.HarineeMCU1M5Summative.dto.Author;
import com.company.HarineeMCU1M5Summative.dto.Publisher;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class BookDaoJdbcTemplateImplTest {


    @Autowired
    protected AuthorDao authorDao;
    @Autowired
    protected BookDao bookDao;
    @Autowired
    protected PublisherDao publisherDao;

    @Before
    public void setUp() throws Exception {
        List<Book> bList = bookDao.getAllBooks();

        bList.stream()
                .forEach(book -> bookDao.deleteBook(book.getBookId()));

        // clean out the test db
        List<Author> aList = authorDao.getAllAuthors();

        aList.stream()
                .forEach(author -> authorDao.deleteAuthor(author.getAuthorId()));

        List<Publisher> pList = publisherDao.getAllPublishers();

        pList.stream()
                .forEach(publisher -> publisherDao.deletePublisher(publisher.getPublisherId()));


    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void addGetDeleteBook() {
        Author author = new Author();
        author.setFirstName("Jojo");
        author.setLastName("South");
        author.setStreet("24 Woodsedge Drive");
        author.setCity("Warren");
        author.setState("NJ");
        author.setPostalCode("07039");
        author.setPhone("9084357329");
        author.setEmail("jojos@gmail.com");

        author = authorDao.addAuthor(author);

        Publisher publisher = new Publisher();
        publisher.setName("Jill North");
        publisher.setStreet("25 York Street");
        publisher.setCity("Atlantic City");
        publisher.setState("NJ");
        publisher.setPostalCode("07139");
        publisher.setPhone("8734127329");
        publisher.setEmail("jilln@gmail.com");


        publisher = publisherDao.addPublisher(publisher);

        Book book = new Book();
        book.setIsbn("21223344556677");
        book.setPublisherId(publisher.getPublisherId());
        book.setAuthorId(author.getAuthorId());
        book.setPublishDate(LocalDate.of(2010, 1, 1));
        book.setPrice(45.66);
        book.setTitle("Java Basic");

        book = bookDao.addBook(book);

        Book book1 = bookDao.getBook(book.getBookId());

        assertEquals(book1, book);

        bookDao.deleteBook(book.getBookId());

        book1 = bookDao.getBook(book.getBookId());

        assertNull(book1);

    }

    @Test
    public void updateBook() {
        Author author = new Author();
        author.setFirstName("Jojo");
        author.setLastName("Smith");
        author.setStreet("42 Country Drive");
        author.setCity("Princeton");
        author.setState("NJ");
        author.setPostalCode("07239");
        author.setPhone("7423427319");
        author.setEmail("jojos@gmail.com");

        authorDao.addAuthor(author);

        Publisher publisher = new Publisher();
        publisher.setName("Jill North");
        publisher.setStreet("65 York Street");
        publisher.setCity("Jersey City");
        publisher.setState("NJ");
        publisher.setPostalCode("07039");
        publisher.setPhone("9734227329");
        publisher.setEmail("jilln@gmail.com");


        publisherDao.addPublisher(publisher);

        Book book = new Book();
        book.setIsbn("21223344556677");
        book.setPublisherId(publisher.getPublisherId());
        book.setAuthorId(author.getAuthorId());
        book.setPublishDate(LocalDate.of(2010, 1, 1));
        book.setPrice(45.66);
        book.setTitle("Java Basic");

        book = bookDao.addBook(book);


        book.setIsbn("22222222222222");
        book.setPrice(12);
        book.setTitle("NEW TITLE");

        bookDao.updateBook(book);

        Book book2 = bookDao.getBook(book.getBookId());

        assertEquals(book2, book);
    }
    @Test
    public void getAllBooks() {
        Author author = new Author();
        author.setFirstName("Jojo");
        author.setLastName("Smith");
        author.setStreet("24 Country Drive");
        author.setCity("Princeton");
        author.setState("NJ");
        author.setPostalCode("07039");
        author.setPhone("9734227329");
        author.setEmail("jojos@gmail.com");

        author = authorDao.addAuthor(author);

        Publisher publisher = new Publisher();
        publisher.setName("Jill North");
        publisher.setStreet("56 York Street");
        publisher.setCity("Atlantic City");
        publisher.setState("NJ");
        publisher.setPostalCode("07039");
        publisher.setPhone("9734227329");
        publisher.setEmail("jilln@gmail.com");


        publisher = publisherDao.addPublisher(publisher);

        Book book = new Book();
        book.setIsbn("21223344556677");
        book.setPublisherId(publisher.getPublisherId());
        book.setAuthorId(author.getAuthorId());
        book.setPublishDate(LocalDate.of(2010, 1, 1));
        book.setPrice(45.66);
        book.setTitle("Java Basic");

        book = bookDao.addBook(book);

        book = new Book();
        book.setIsbn("1234567");
        book.setPublishDate(LocalDate.of(2012, 4, 11));
        book.setAuthorId(author.getAuthorId());
        book.setTitle("NEW");
        book.setPublisherId(publisher.getPublisherId());
        book.setPrice(34);

        bookDao.addBook(book);

        List<Book> bookList = bookDao.getAllBooks();

        assertEquals(bookList.size(), 2);
    }


    @Test
    public void getBooksByAuthor() {
        Author author = new Author();
        author.setFirstName("Jojo");
        author.setLastName("South");
        author.setStreet("24 Country Drive");
        author.setCity("Princeton");
        author.setState("NJ");
        author.setPostalCode("07039");
        author.setPhone("7436517329");
        author.setEmail("jojos@gmail.com");

        author = authorDao.addAuthor(author);

        Author author1 = new Author();
        author1.setFirstName("Jojo");
        author1.setLastName("Smith");
        author1.setStreet("24 Country Drive");
        author1.setCity("Livingston");
        author1.setState("NJ");
        author1.setPostalCode("07039");
        author1.setPhone("7432217329");
        author1.setEmail("jojos@gmail.com");

        author1 = authorDao.addAuthor(author);

        Author author2 = new Author();
        author2.setFirstName("Jojo");
        author2.setLastName("Smith");
        author2.setStreet("24 Country Drive");
        author2.setCity("Wareen");
        author2.setState("NJ");
        author2.setPostalCode("07039");
        author2.setPhone("9561227329");
        author2.setEmail("jojos@gmail.com");

        author2 = authorDao.addAuthor(author);

        Publisher publisher = new Publisher();
        publisher.setName("Jill North");
        publisher.setStreet("65 Sussex Street");
        publisher.setCity("Atlantic City");
        publisher.setState("NJ");
        publisher.setPostalCode("07039");
        publisher.setPhone("7434227329");
        publisher.setEmail("jilln@gmail.com");


        publisher = publisherDao.addPublisher(publisher);

        Book book = new Book();
        book.setIsbn("21223344556677");
        book.setPublisherId(publisher.getPublisherId());
        book.setAuthorId(author.getAuthorId());
        book.setPublishDate(LocalDate.of(2010, 1, 1));
        book.setPrice(45.66);
        book.setTitle("Java Dummies");

        book = bookDao.addBook(book);

        book = new Book();
        book.setIsbn("1234567");
        book.setPublishDate(LocalDate.of(2012, 4, 11));
        book.setAuthorId(author.getAuthorId());
        book.setTitle("NEW");
        book.setPublisherId(publisher.getPublisherId());
        book.setPrice(34);

        bookDao.addBook(book);

        List<Book> bookList = bookDao.getBooksByAuthor(author.getAuthorId());

        assertEquals(bookList.size(), 2);
    }



}



