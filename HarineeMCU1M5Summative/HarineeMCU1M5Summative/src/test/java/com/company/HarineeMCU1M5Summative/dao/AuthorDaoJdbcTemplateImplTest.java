package com.company.HarineeMCU1M5Summative.dao;

import com.company.HarineeMCU1M5Summative.dto.Book;
import com.company.HarineeMCU1M5Summative.dto.Author;
import com.company.HarineeMCU1M5Summative.dto.Publisher;

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


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class AuthorDaoJdbcTemplateImplTest {

    @Autowired
    protected  AuthorDao authorDao;
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
    public void addGetDeleteAuthor() {

        Author author = new Author();
        author.setFirstName("JoJo");
        author.setLastName("South");
        author.setStreet("24 Woodsedge Drive");
        author.setCity("Wareen");
        author.setState("NJ");
        author.setPostalCode("07039");
        author.setPhone("9084357329");
        author.setEmail("jojos@gmail.com");

        author = authorDao.addAuthor(author);

        Author author1 = authorDao.getAuthor(author.getAuthorId());
        System.out.println(author.getFirstName());
        System.out.println( author.getLastName());
        System.out.println(author.getAuthorId());
        System.out.println(author.getCity());
        System.out.println(author.getState());

        System.out.println(author1.getFirstName());
        System.out.println( author1.getLastName());
        System.out.println(author1.getAuthorId());
        System.out.println(author1.getCity());
        System.out.println(author1.getState());
        assertEquals(author1, author);

        authorDao.deleteAuthor(author.getAuthorId());

        author1 = authorDao.getAuthor(author.getAuthorId());

        assertNull(author1);


    }

    @Test
    public void getAllAuthors() {

        Author author = new Author();
        author.setFirstName("Bill1");
        author.setLastName("Smith");
        author.setStreet("Broad St");
        author.setCity("Savannah");
        author.setState("GA");
        author.setPostalCode("31401");
        author.setPhone("912-555-5555");
        author.setEmail("totallyrealemail@perc.com");


        authorDao.addAuthor(author);

        author = new Author();
        author.setFirstName("Bill2 ");
        author.setLastName("Desert");
        author.setStreet("Liberty St");
        author.setCity("Savannah");
        author.setState("GA");
        author.setPostalCode("31401");
        author.setPhone("912-555-0001");
        author.setEmail("alsolegitemail@scr.com");

        authorDao.addAuthor(author);

        List<Author> authorList = authorDao.getAllAuthors();

        assertEquals(authorList.size(), 2);
    }


    @Test
    public void updateAuthor() {

         Author author = new Author();
        author.setFirstName("Savannah ");
        author.setLastName("Desert");
        author.setStreet("Liberty St");
        author.setCity("Savannah");
        author.setState("GA");
        author.setPostalCode("31401");
        author.setPhone("912-555-0001");
        author.setEmail("alsolegitemail@scr.com");


        author = authorDao.addAuthor(author);

        author.setFirstName("UPDATED");
        author.setStreet("NEW STREET");
        author.setCity("ST LOUIS");
        author.setState("MO");

        authorDao.updateAuthor(author);
        //System.out.println("XXX1 = " + author.getAuthorId());
        Author author2 = authorDao.getAuthor(author.getAuthorId());

        assertEquals(author2, author);
    }



}
