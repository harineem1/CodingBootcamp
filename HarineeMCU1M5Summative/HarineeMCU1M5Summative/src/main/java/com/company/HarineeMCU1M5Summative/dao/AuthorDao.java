package com.company.HarineeMCU1M5Summative.dao;

import com.company.HarineeMCU1M5Summative.dto.Author;

import java.util.List;

public interface AuthorDao {

      Author getAuthor(int id);

      Author addAuthor(Author author);

      List<Author> getAllAuthors();

      void updateAuthor(Author author);

      void deleteAuthor(int id);
}
