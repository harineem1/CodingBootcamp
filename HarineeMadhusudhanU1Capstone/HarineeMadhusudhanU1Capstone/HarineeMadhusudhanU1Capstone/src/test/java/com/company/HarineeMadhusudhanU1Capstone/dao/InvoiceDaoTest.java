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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.*;
import  org.springframework.test.context.support.AbstractContextLoader;
import  org.springframework.test.context.support.AbstractGenericContextLoader;
import   org.springframework.test.context.support.AnnotationConfigContextLoader;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class InvoiceDaoTest {

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
    public void addInvoice() {

        Invoice invoice = new Invoice();
        invoice.setName(" Prince of Persia");
        invoice.setStreet("T");
        invoice.setCity("Travel of the Prince");
        invoice.setState("aaa");
        invoice.setZipCode("aaa");
        invoice.setItemType("tt");
        invoice.setItemId(8);
        invoice.setUnitPrice(BigDecimal.valueOf(45.78));
        invoice.setQuantity(30);
        invoice.setSubTotal(BigDecimal.valueOf(21.45));
        invoice.setTax(BigDecimal.valueOf(14.56));
        invoice.setProcessingFee(BigDecimal.valueOf(5.78));
        invoice.setTotal(BigDecimal.valueOf(5.78));

        invoice = invoiceDao.addInvoice(invoice);

        Invoice invoice1 = invoiceDao.getInvoice(invoice.getInvoiceId());

        assertEquals(invoice1, invoice);

    }

    @Test
    public void getInvoice() {


    }

    @Test
    public void getAllInvoices() {

        Invoice invoice = new Invoice();
        invoice.setName(" Prince of Persia");
        invoice.setStreet("T");
        invoice.setCity("Travel of the Prince");
        invoice.setState("aaa");
        invoice.setZipCode("aaa");
        invoice.setItemType("tt");
        invoice.setItemId(8);
        invoice.setUnitPrice(BigDecimal.valueOf(45.78));
        invoice.setQuantity(30);
        invoice.setSubTotal(BigDecimal.valueOf(21.45));
        invoice.setTax(BigDecimal.valueOf(14.56));
        invoice.setProcessingFee(BigDecimal.valueOf(4.78));
        invoice.setTotal(BigDecimal.valueOf(4.78));

        invoice = invoiceDao.addInvoice(invoice);

        invoice.setName(" Prince of Persia");
        invoice.setStreet("T");
        invoice.setCity("Travel of the Prince");
        invoice.setState("aaa");
        invoice.setZipCode("aaa");
        invoice.setItemType("tt");
        invoice.setItemId(8);
        invoice.setUnitPrice(BigDecimal.valueOf(45.78));
        invoice.setQuantity(30);
        invoice.setSubTotal(BigDecimal.valueOf(21.45));
        invoice.setTax(BigDecimal.valueOf(14.56));

        invoice = invoiceDao.addInvoice(invoice);


        List<Invoice> invoiceList = invoiceDao.getAllInvoices();
        assertEquals(invoiceList.size(), 2);

    }
}

