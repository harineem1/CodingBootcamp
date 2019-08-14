package com.company.HarineeMadhusudhanU1Capstone.dao;

import com.company.HarineeMadhusudhanU1Capstone.dto.Game;
import com.company.HarineeMadhusudhanU1Capstone.dto.Invoice;
import com.company.HarineeMadhusudhanU1Capstone.dto.Console;
import com.company.HarineeMadhusudhanU1Capstone.dto.SalesTaxRate;
import com.company.HarineeMadhusudhanU1Capstone.dto.TShirt;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.math.BigDecimal;




import  org.springframework.test.context.support.AbstractContextLoader;
 import  org.springframework.test.context.support.AbstractGenericContextLoader;
 import   org.springframework.test.context.support.AnnotationConfigContextLoader;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class GameDaoTest {

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

        System.out.println("I am at SetUp");
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
    public void addgetdeleteGame() {

        Game game = new Game();
        game.setTitle(" Prince of Persia");
        game.setErsbRating("T");
        game.setDescription("Travel of the Prince");
        game.setPrice(BigDecimal.valueOf(131.25));
        game.setStudio("aaa");
        game.setQuantity(30);

        game = gameDao.addGame(game);

        Game game1 = gameDao.getGame(game.getGameId());

        assertEquals(game1, game);

        gameDao.deleteGame(game.getGameId());

        game1 = gameDao.getGame(game.getGameId());

        assertNull(game1);

    }
    @Test
    public void getAllGames() {

        Game game = new Game();
        game.setTitle(" Prince of Persia");
        game.setErsbRating("T");
        game.setDescription("Travel of the Prince");
        game.setPrice(BigDecimal.valueOf(131.25));
        game.setStudio("aaa");
        game.setQuantity(30);

        game = gameDao.addGame(game);

        game = new Game();
        game.setTitle(" Legend of Sea");
        game.setErsbRating("E");
        game.setDescription("Travel in sea");
        game.setPrice(BigDecimal.valueOf(45.85));
        game.setStudio("bbb");
        game.setQuantity(20);

        game = gameDao.addGame(game);

        List<Game> gameList = gameDao.getAllGames();
        assertEquals(gameList.size(), 2);
    }

    @Test
    public void updateGame() {

        Game game = new Game();
        game.setTitle(" Prince of Persia");
        game.setErsbRating("T");
        game.setDescription("Travel of the Prince");
        game.setPrice(BigDecimal.valueOf(131.25));
        game.setStudio("aaa");
        game.setQuantity(30);

        game = gameDao.addGame(game);

        game.setTitle(" Legend of Sea");
        game.setErsbRating("E");
        game.setDescription("Travel in sea");
        game.setPrice(BigDecimal.valueOf(45.85));
        game.setStudio("bbb");
        game.setQuantity(20);

        gameDao.updateGame(game);

        Game game1 = gameDao.getGame(game.getGameId());

        assertEquals(game1, game);

    }
    @Test
    public void getGamesByStudio() {
        Game game = new Game();
        game.setTitle(" Prince of Persia");
        game.setErsbRating("T");
        game.setDescription("Travel of the Prince");
        game.setPrice(BigDecimal.valueOf(131.25));
        game.setStudio("aaa");
        game.setQuantity(30);

        game = gameDao.addGame(game);

        game = new Game();
        game.setTitle(" Legend of Sea");
        game.setErsbRating("E");
        game.setDescription("Travel in sea");
        game.setPrice(BigDecimal.valueOf(45.85));
        game.setStudio("aaa");
        game.setQuantity(20);

        game = gameDao.addGame(game);

        List<Game> gameList = gameDao.getGamesByStudio("aaa");
        assertEquals(gameList.size(), 2);


    }

    @Test
    public void getGameByErsb() {

        Game game = new Game();
        game.setTitle(" Prince of Persia");
        game.setErsbRating("T");
        game.setDescription("Travel of the Prince");
        game.setPrice(BigDecimal.valueOf(131.25));
        game.setStudio("aaa");
        game.setQuantity(30);

        game = gameDao.addGame(game);

        game = new Game();
        game.setTitle(" Legend of Sea");
        game.setErsbRating("T");
        game.setDescription("Travel in sea");
        game.setPrice(BigDecimal.valueOf(45.85));
        game.setStudio("bbb");
        game.setQuantity(20);

        game = gameDao.addGame(game);

        List<Game> gameList = gameDao.getGamesByErsb("T");
        assertEquals(gameList.size(), 2);


    }

    @Test
    public void getGameByTitle() {

        Game game = new Game();
        game.setTitle(" Prince of Persia");
        game.setErsbRating("T");
        game.setDescription("Travel of the Prince");
        game.setPrice(BigDecimal.valueOf(131.25));
        game.setStudio("aaa");
        game.setQuantity(30);

        game = gameDao.addGame(game);

        game = new Game();
        game.setTitle(" Prince of Persia");
        game.setErsbRating("T");
        game.setDescription("Travel in sea");
        game.setPrice(BigDecimal.valueOf(45.85));
        game.setStudio("bbb");
        game.setQuantity(20);

        game = gameDao.addGame(game);

        List<Game> gameList = gameDao.getGamesByTitle(" Prince of Persia");
        assertEquals(gameList.size(), 2);

    }
}