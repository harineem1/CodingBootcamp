package com.company.HarineeMadhusudhanU1Capstone.dao;

import com.company.HarineeMadhusudhanU1Capstone.dto.Console;
import com.company.HarineeMadhusudhanU1Capstone.dto.Game;
import com.company.HarineeMadhusudhanU1Capstone.dto.Invoice;
import com.company.HarineeMadhusudhanU1Capstone.dto.TShirt;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;

import  org.springframework.test.context.support.AbstractContextLoader;
import  org.springframework.test.context.support.AbstractGenericContextLoader;
import   org.springframework.test.context.support.AnnotationConfigContextLoader;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class ConsoleDaoTest {

    @Autowired
    GameDao gameDao;
    @Autowired
    InvoiceDao invoiceDao;
    @Autowired
    ConsoleDao consoleDao;
    @Autowired
      TShirtDao tShirtDao;
//    @Autowired
//    SalesTaxRateDao salesTaxRateDao;
//    @Autowired
//    ProcessingFeeDao processingFeeDao;

    @Before
    public void setUp() throws Exception {

        List<Console> cList = consoleDao.getAllConsoles();
        for (Console c : cList) {
            consoleDao.deleteConsole(c.getConsoleId());
        }
        List<Game> gList = gameDao.getAllGames();
        for (Game g : gList) {
            gameDao.deleteGame(g.getGameId());
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
    public void addgetdeleteConsole() {

        Console console = new Console();
        console.setModel(" Prince of Persia");
        console.setManufacturer("T");
        console.setMemoryAmount("Travel of the Prince");
        console.setProcessor("aaa");
        console.setPrice(BigDecimal.valueOf(35.67));
        console.setQuantity(30);

        console = consoleDao.addConsole(console);

        Console console1 = consoleDao.getConsole(console.getConsoleId());

        assertEquals(console1, console);

        consoleDao.deleteConsole(console.getConsoleId());

        console1 = consoleDao.getConsole(console.getConsoleId());

        assertNull(console1);


    }

    @Test
    public void getAllConsoles() {
        Console console = new Console();
        console.setModel(" Prince of Persia");
        console.setManufacturer("T");
        console.setMemoryAmount("Travel of the Prince");
        console.setProcessor("aaa");
        console.setPrice(BigDecimal.valueOf(35.67));
        console.setQuantity(30);

        console = consoleDao.addConsole(console);

        console.setModel(" Prince of Persia");
        console.setManufacturer("T");
        console.setMemoryAmount("Travel of the Prince");
        console.setProcessor("aaa");
        console.setPrice(BigDecimal.valueOf(35.67));
        console.setQuantity(30);

        console = consoleDao.addConsole(console);

        List<Console> consoleList = consoleDao.getAllConsoles();
        assertEquals(consoleList.size(), 2);
    }

    @Test
    public void updateConsole() {
        Console console = new Console();
        console.setModel(" Prince of Persia");
        console.setManufacturer("T");
        console.setMemoryAmount("Travel of the Prince");
        console.setProcessor("aaa");
        console.setPrice(BigDecimal.valueOf(35.67));
        console.setQuantity(30);

        console = consoleDao.addConsole(console);

        console.setModel(" Prince of Persia");
        console.setManufacturer("T");
        console.setMemoryAmount("Travel of the Prince");
        console.setProcessor("aaa");
        console.setPrice(BigDecimal.valueOf(35.67));
        console.setQuantity(30);

         consoleDao.updateConsole(console);
         Console console1 = consoleDao.getConsole(console.getConsoleId());

         assertEquals(console, console1);
       List<Console> consoleList = consoleDao.getAllConsoles();
       assertEquals(consoleList.size(), 1);
    }

    @Test
    public void getConsoleByManufacturer() {

        Console console = new Console();
        console.setModel(" Prince of Persia");
        console.setManufacturer("T");
        console.setMemoryAmount("Travel of the Prince");
        console.setProcessor("aaa");
        console.setPrice(BigDecimal.valueOf(35.67));
        console.setQuantity(30);

        console = consoleDao.addConsole(console);

        Console console1 = new Console();
        console1.setModel(" Prince of Persia");
        console1.setManufacturer("T");
        console1.setMemoryAmount("Travel of the Prince");
        console1.setProcessor("aaa");
        console1.setPrice(BigDecimal.valueOf(35.67));
        console1.setQuantity(30);

        console1 = consoleDao.addConsole(console1);

        List<Console> consoleList = consoleDao.getConsoleByManufacturer("T");
        assertEquals(consoleList.size(), 2);

    }
}