package com.company.HarineeMCU1M5Summative.dao;

import com.company.HarineeMCU1M5Summative.dto.Book;

import java.util.List;


public interface BookDao {

    Book addBook(Book book);

    Book getBook(int bookId);

    List<Book> getBooksByAuthor(int authorId);

    List<Book> getAllBooks();

    void updateBook(Book book);

    void deleteBook(int bookId);


    void deleteAuthor(int authorId);
}
