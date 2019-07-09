package com.company.HarineeMCU1M5Summative.dao;


import com.company.HarineeMCU1M5Summative.dto.Author;
import com.company.HarineeMCU1M5Summative.dto.Book;
import com.company.HarineeMCU1M5Summative.dto.Publisher;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class PublisherDaoJdbcTemplateImplTest {


    @Autowired
    protected  AuthorDao authorDao;
    @Autowired
    protected BookDao bookDao;
    @Autowired
    protected PublisherDao publisherDao;

    @Before
    @Transactional
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
    public void addGetDeletePublisher() {

        Publisher publisher = new Publisher();
        publisher.setName("PERC");
        publisher.setStreet("Broad St");
        publisher.setCity("Savannah");
        publisher.setState("GA");
        publisher.setPostalCode("31401");
        publisher.setPhone("912-555-5555");
        publisher.setEmail("totallyrealemail@perc.com");


        publisher = publisherDao.addPublisher(publisher);

        Publisher publisher2 = publisherDao.getPublisher(publisher.getPublisherId());
        System.out.println(publisher.getName());
        System.out.println(publisher.getCity());

        System.out.println(publisher2.getName());
        System.out.println( publisher2.getCity());

        assertEquals(publisher, publisher2);

        publisherDao.deletePublisher(publisher.getPublisherId());

        publisher2 = publisherDao.getPublisher(publisher.getPublisherId());

        assertNull(publisher2);
    }


    @Test
    public void getAllPublishers() {

        Publisher publisher = new Publisher();
        publisher.setName("PERC");
        publisher.setStreet("Broad St");
        publisher.setCity("Savannah");
        publisher.setState("GA");
        publisher.setPostalCode("31401");
        publisher.setPhone("912-555-5555");
        publisher.setEmail("totallyrealemail@perc.com");

        publisherDao.addPublisher(publisher);

        publisher = new Publisher();
        publisher.setName("Savannah ");
        publisher.setStreet("Liberty St");
        publisher.setCity("Savannah");
        publisher.setState("GA");
        publisher.setPostalCode("31401");
        publisher.setPhone("912-555-0001");
        publisher.setEmail("alsolegitemail@scr.com");

        publisherDao.addPublisher(publisher);

        List<Publisher> publishersList = publisherDao.getAllPublishers();

        assertEquals(publishersList.size(), 2);
    }


   @Test
    public void updatePublisher() {

        Publisher publisher = new Publisher();
        publisher.setName("PERC");
        publisher.setStreet("Broad St");
        publisher.setCity("Savannah");
        publisher.setState("GA");
        publisher.setPostalCode("31401");
        publisher.setPhone("912-555-5555");
        publisher.setEmail("totallyrealemail@perc.com");


        publisher = publisherDao.addPublisher(publisher);

        publisher.setName("UPDATED");
        publisher.setStreet("NEW STREET");
        publisher.setCity("ST LOUIS");
        publisher.setState("MO");

        publisherDao.updatePublisher(publisher);

        Publisher publisher2 = publisherDao.getPublisher(publisher.getPublisherId());

        assertEquals(publisher2, publisher);
    }


}
