package com.company.HarineeMadhusudhanU1Capstone.servicelayer;

import com.company.HarineeMadhusudhanU1Capstone.dao.*;
import com.company.HarineeMadhusudhanU1Capstone.dto.Game;
import com.company.HarineeMadhusudhanU1Capstone.viewmodel.GameViewModel;
import com.company.HarineeMadhusudhanU1Capstone.viewmodel.TShirtViewModel;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;


public class ServiceLayerTest {

    GameDao gameDao;
    ConsoleDao consoleDao;
    TShirtDao tShirtDao;
    InvoiceDao invoiceDao;
    ProcessingFeeDao processingFeeDao;
    SalesTaxRateDao salesTaxRateDao;
    ServiceLayer serviceLayer;
    @Before
    public void setUp() throws Exception {


        setUpGameDaoMock();
//        setUpInvoiceDaoMock();
//        setUpProcessingFeeDaoMock();
//        setUpSalesTaxDaoMock();
//        setUpConsolesDaoMock();
//      setUpTShirtsDaoMock();

        //serviceLayer = new ServiceLayer(gameDao, consoleDao,tShirtDao,invoiceDao,processingFeeDao,salesTaxRateDao);
        serviceLayer = new ServiceLayer(gameDao);

    }
    @Test
    public void saveFindGame() {

        GameViewModel gameViewModel = new GameViewModel();


        gameViewModel.setTitle("Prince of Persia");
        gameViewModel.setErsbRating("T");
        gameViewModel.setDescription("Travel of the prince");
        gameViewModel.setPrice(BigDecimal.valueOf(10));
        gameViewModel.setStudio("aaa");
        gameViewModel.setQuantity(15);

        gameViewModel = serviceLayer.saveGame(gameViewModel);
        GameViewModel fromService = serviceLayer.findGamesbyGameId(gameViewModel.getGameId());
        assertEquals(gameViewModel, fromService);
    }
//    @Test
//    public void saveFindTShirt() {
//
//        TShirtViewModel tShirtViewModel = new TShirtViewModel();
//
//        tshirtsViewModel.setSize("aaa");
//        tshirtsViewModel.setColor("red");
//        tshirtsViewModel.setDescription("short sleeve");
//        tshirtsViewModel.setPrice(new BigDecimal(11.00));
//        tshirtsViewModel.setQuantity(25);
//
//        tshirtsViewModel = serviceLayer.saveTShirt(tshirtsViewModel);
//        TshirtsViewModel fromService = serviceLayer.findTShirtsbyId(tshirtsViewModel.getId());
//        assertEquals(tshirtsViewModel, fromService);
//
//    }

    private void setUpGameDaoMock() {

        gameDao = mock(GameDaoJdbcTemplateImpl.class);

        Game game = new Game();

        game.setGameId(1);
        game.setTitle("Prince of Persia");
        game.setErsbRating("T");
        game.setDescription("Travel of the prince");
        game.setPrice(BigDecimal.valueOf(10));
        game.setStudio("aaa");
        game.setQuantity(15);

        Game game1 = new Game();

        game1.setTitle("Prince of Persia");
        game1.setErsbRating("T");
        game1.setDescription("Travel of the prince");
        game1.setPrice(BigDecimal.valueOf(10));
        game1.setStudio("aaa");
        game1.setQuantity(15);

        List<Game> gameList = new ArrayList<>();
        gameList.add(game);

        doReturn(game).when(gameDao).addGame(game1);
        doReturn(game).when(gameDao).getGame(1);
        doReturn(gameList).when(gameDao).getAllGames();
        doReturn(gameList).when(gameDao).getGamesByErsb(game.getErsbRating());
        doReturn(gameList).when(gameDao).getGamesByStudio(game.getStudio());
        doReturn(gameList).when(gameDao).getGamesByTitle(game.getTitle());
    }



}
