package com.company.HarineeMadhusudhanU1Capstone.dao;

import com.company.HarineeMadhusudhanU1Capstone.dto.Console;
import com.company.HarineeMadhusudhanU1Capstone.dto.Game;
import com.company.HarineeMadhusudhanU1Capstone.dto.Invoice;
import com.company.HarineeMadhusudhanU1Capstone.dto.TShirt;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import  org.springframework.test.context.support.AbstractContextLoader;
import  org.springframework.test.context.support.AbstractGenericContextLoader;
import   org.springframework.test.context.support.AnnotationConfigContextLoader;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class TShirtDaoTest {

  @Autowired
    GameDao gameDao;
    @Autowired
    InvoiceDao invoiceDao;
    @Autowired
    ConsoleDao consoleDao;
    @Autowired
    TShirtDao tShirtDao;
    @Autowired
    SalesTaxRateDao salesTaxRateDao;
    @Autowired
    ProcessingFeeDao processingFeeDao;


    @Before
    public void setUp() throws Exception {

        // Clean up the test db
        List<Game> gList = gameDao.getAllGames();
        for (Game g : gList) {
            gameDao.deleteGame(g.getGameId());
        }
        List<Console> cList = consoleDao.getAllConsoles();
        for (Console c : cList) {
            consoleDao.deleteConsole(c.getConsoleId());
        }

        List<TShirt> tList = tShirtDao.getAllTShirts();

        for (TShirt t : tList) {
            tShirtDao.deleteTShirt(t.gettShirtId());
        }

        List<Invoice> iList = invoiceDao.getAllInvoices();

        for (Invoice i : iList) {
            invoiceDao.deleteInvoice(i.getInvoiceId());
        }

    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void addgetdeleteTShirt() {

        TShirt tShirt = new TShirt();
        tShirt.setSize(" Prince of Persia");
        tShirt.setColor("T");
        tShirt.setDescription("Travel of the Prince");
        tShirt.setPrice(BigDecimal.valueOf(131.25));
        tShirt.setQuantity(30);

        tShirt = tShirtDao.addTShirt(tShirt);

        TShirt tShirt1 = tShirtDao.getTShirt(tShirt.gettShirtId());

        assertEquals(tShirt1, tShirt);

        tShirtDao.deleteTShirt(tShirt.gettShirtId());

        tShirt1 = tShirtDao.getTShirt(tShirt.gettShirtId());

        assertNull(tShirt1);

    }

    @Test
    public void getAllTShirts() {

        TShirt tShirt = new TShirt();
        tShirt.setSize(" Prince of Persia");
        tShirt.setColor("T");
        tShirt.setDescription("Travel of the Prince");
        tShirt.setPrice(BigDecimal.valueOf(131.25));
        tShirt.setQuantity(30);

        tShirt = tShirtDao.addTShirt(tShirt);

//        tShirt.setSize(" Prince of Persia");
//        tShirt.setColor("T");
//        tShirt.setDescription("Travel of the Prince");
//        tShirt.setPrice(BigDecimal.valueOf(131.25));
//        tShirt.setQuantity(30);
//
//        tShirt = tShirtDao.addTShirt(tShirt);

        List<TShirt> tShirtList = tShirtDao.getAllTShirts();
        assertEquals(tShirtList.size(),1);

    }

    @Test
    public void updateTShirt() {
        TShirt tShirt = new TShirt();
        tShirt.setSize(" Prince of Persia");
        tShirt.setColor("T");
        tShirt.setDescription("Travel of the Prince");
        tShirt.setPrice(BigDecimal.valueOf(131.25));
        tShirt.setQuantity(30);

        tShirt = tShirtDao.addTShirt(tShirt);

        tShirt.setSize(" Prince of Persia");
        tShirt.setColor("T");
        tShirt.setDescription("Travel of the Prince");
        tShirt.setPrice(BigDecimal.valueOf(131.25));
        tShirt.setQuantity(30);

        tShirtDao.updateTShirt(tShirt);

        TShirt tShirt1 = tShirtDao.getTShirt(tShirt.gettShirtId());

        assertEquals(tShirt1, tShirt);


    }

    @Test
    public void getTShirtByColor() {

        TShirt tShirt = new TShirt();
        tShirt.setSize(" Prince of Persia");
        tShirt.setColor("T");
        tShirt.setDescription("Travel of the Prince");
        tShirt.setPrice(BigDecimal.valueOf(131.25));
        tShirt.setQuantity(30);

        tShirt = tShirtDao.addTShirt(tShirt);

        tShirt.setSize(" Legend of Sea");
        tShirt.setColor("T");
        tShirt.setDescription("Travel of the Prince");
        tShirt.setPrice(BigDecimal.valueOf(131.25));
        tShirt.setQuantity(30);

        tShirt = tShirtDao.addTShirt(tShirt);

        List<TShirt> tShirtList = tShirtDao.getTShirtByColor("T");
        assertEquals(tShirtList.size(),2);

    }

    @Test
    public void getTShirtBySize() {

        TShirt tShirt = new TShirt();
        tShirt.setSize("Prince");
        tShirt.setColor("T");
        tShirt.setDescription("Travel of the Prince");
        tShirt.setPrice(BigDecimal.valueOf(131.25));
        tShirt.setQuantity(30);

        tShirt = tShirtDao.addTShirt(tShirt);

         tShirt = new TShirt();
        tShirt.setSize("Prince");
        tShirt.setColor("T");
        tShirt.setDescription("Travel of the Prince");
        tShirt.setPrice(BigDecimal.valueOf(131.25));
        tShirt.setQuantity(30);

        tShirt = tShirtDao.addTShirt(tShirt);

        List<TShirt> tShirtList = tShirtDao.getTShirtBySize("Prince");
        assertEquals(tShirtList.size(),2);
    }
}