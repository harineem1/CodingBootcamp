package com.company.HarineeMadhusudhanU1Capstone.servicelayer;

import com.company.HarineeMadhusudhanU1Capstone.dao.*;
import com.company.HarineeMadhusudhanU1Capstone.dto.*;
import com.company.HarineeMadhusudhanU1Capstone.viewmodel.*;

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
        setUpInvoiceDaoMock();
        setUpProcessingFeeDaoMock();
        setUpSalesTaxRateDaoMock();
        setUpConsoleDaoMock();
        setUpTShirtDaoMock();

        serviceLayer = new ServiceLayer(gameDao, consoleDao,tShirtDao,invoiceDao,processingFeeDao,salesTaxRateDao);


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
        GameViewModel fromService = serviceLayer.findGameByGameId(gameViewModel.getGameId());
        assertEquals(gameViewModel, fromService);
    }
    @Test
    public void findAllGames() {

        GameViewModel gameViewModel = new GameViewModel();

        gameViewModel.setTitle("Prince of Persia");
        gameViewModel.setErsbRating("T");
        gameViewModel.setDescription("Travel of the prince");
        gameViewModel.setPrice(BigDecimal.valueOf(10));
        gameViewModel.setStudio("aaa");
        gameViewModel.setQuantity(15);

        List<GameViewModel> gameViewModels = serviceLayer.findAllGames();
        assertEquals(gameViewModels.size(),1);
    }
    @Test
    public void findGameByStudio() {

        GameViewModel gameViewModel = new GameViewModel();

        gameViewModel.setTitle("Prince of Persia");
        gameViewModel.setErsbRating("T");
        gameViewModel.setDescription("Travel of the prince");
        gameViewModel.setPrice(BigDecimal.valueOf(10));
        gameViewModel.setStudio("aaa");
        gameViewModel.setQuantity(15);

        gameViewModel = serviceLayer.saveGame(gameViewModel);
        List<GameViewModel> gameViewModels = serviceLayer.findGamesByStudio("aaa");
        assertEquals(gameViewModels.size(),1);
        assertEquals(gameViewModels.get(0), gameViewModel);
    }
    @Test
    public void findGameByErsb() {

        GameViewModel gameViewModel = new GameViewModel();

        gameViewModel.setTitle("Prince of Persia");
        gameViewModel.setErsbRating("T");
        gameViewModel.setDescription("Travel of the prince");
        gameViewModel.setPrice(BigDecimal.valueOf(10));
        gameViewModel.setStudio("aaa");
        gameViewModel.setQuantity(15);

        gameViewModel = serviceLayer.saveGame(gameViewModel);
        List<GameViewModel> gameViewModels = serviceLayer.findGamesByErsb("T");
        assertEquals(gameViewModels.size(),1);
        assertEquals(gameViewModels.get(0), gameViewModel);
    }
    @Test
    public void findGameByTitle() {

        GameViewModel gameViewModel = new GameViewModel();

        gameViewModel.setTitle("Prince of Persia");
        gameViewModel.setErsbRating("T");
        gameViewModel.setDescription("Travel of the prince");
        gameViewModel.setPrice(BigDecimal.valueOf(10));
        gameViewModel.setStudio("aaa");
        gameViewModel.setQuantity(15);

        gameViewModel = serviceLayer.saveGame(gameViewModel);
        List<GameViewModel> gameViewModels = serviceLayer.findGamesByTitle("Prince of Persia");
        assertEquals(gameViewModels.size(),1);
        assertEquals(gameViewModels.get(0), gameViewModel);
    }
    @Test
    public void findAllTShirts() {

        TShirtViewModel tShirtViewModel =new TShirtViewModel();

        tShirtViewModel.settShirtId(3);
        tShirtViewModel.setSize("small");
        tShirtViewModel.setColor("red");
        tShirtViewModel.setDescription("full sleeve");
        tShirtViewModel.setPrice(new BigDecimal(2.00));
        tShirtViewModel.setQuantity(20);

        List<TShirtViewModel> tShirtViewModels = serviceLayer.findAllTShirts();
        assertEquals(tShirtViewModels.size(),1);

    }

    @Test
    public void saveFindTShirt() {

        TShirtViewModel tShirtViewModel =new TShirtViewModel();

        tShirtViewModel.setSize("small");
        tShirtViewModel.setColor("red");
        tShirtViewModel.setDescription("full sleeve");
        tShirtViewModel.setPrice(new BigDecimal(2.00));
        tShirtViewModel.setQuantity(20);

        tShirtViewModel = serviceLayer.saveTShirt(tShirtViewModel);
        TShirtViewModel fromService = serviceLayer.findTShirtBytShirtId(tShirtViewModel.gettShirtId());
        assertEquals(tShirtViewModel, fromService);

    }
    @Test
    public void findTShirtsByColor() {

        TShirtViewModel tShirtViewModel =new TShirtViewModel();

        tShirtViewModel.setSize("small");
        tShirtViewModel.setColor("red");
        tShirtViewModel.setDescription("full sleeve");
        tShirtViewModel.setPrice(new BigDecimal(2.00));
        tShirtViewModel.setQuantity(20);

        tShirtViewModel = serviceLayer.saveTShirt(tShirtViewModel);
        List<TShirtViewModel> tShirtViewModels = serviceLayer.findTShirtByColor("red");
        assertEquals(tShirtViewModels.size(),1);
        assertEquals(tShirtViewModels.get(0), tShirtViewModel);
    }
    @Test
    public void findTShirtsBySize() {

        TShirtViewModel tShirtViewModel =new TShirtViewModel();

        tShirtViewModel.setSize("small");
        tShirtViewModel.setColor("red");
        tShirtViewModel.setDescription("full sleeve");
        tShirtViewModel.setPrice(new BigDecimal(2.00));
        tShirtViewModel.setQuantity(20);

        tShirtViewModel = serviceLayer.saveTShirt(tShirtViewModel);
        List<TShirtViewModel> tShirtViewModels = serviceLayer.findTShirtBySize("small");
        assertEquals(tShirtViewModels.size(),1);
        assertEquals(tShirtViewModels.get(0), tShirtViewModel);
    }

    @Test
    public void findAllConsoles() {

        ConsoleViewModel consoleViewModel =new ConsoleViewModel();

        consoleViewModel.setModel("aaa");
        consoleViewModel.setManufacturer("dell");
        consoleViewModel.setMemoryAmount("64");
        consoleViewModel.setProcessor("bbb");
        consoleViewModel.setPrice(new BigDecimal(50.00));
        consoleViewModel.setQuantity(20);

        List<ConsoleViewModel> consoleViewModels = serviceLayer.findAllConsoles();
        assertEquals(consoleViewModels.size(),1);
    }
    @Test
    public void saveFindConsoles(){

        ConsoleViewModel consoleViewModel = new ConsoleViewModel();

        consoleViewModel.setModel("aaa");
        consoleViewModel.setManufacturer("dell");
        consoleViewModel.setMemoryAmount("64");
        consoleViewModel.setProcessor("bbb");
        consoleViewModel.setPrice(new BigDecimal(50.00));
        consoleViewModel.setQuantity(20);

        consoleViewModel = serviceLayer.saveConsole(consoleViewModel);
        ConsoleViewModel fromService = serviceLayer.findConsoleByConsoleId(consoleViewModel.getConsoleId());
        assertEquals(consoleViewModel, fromService);
    }
    @Test
    public void findConsolesByManufacturer() {

        ConsoleViewModel consoleViewModel = new ConsoleViewModel();

        consoleViewModel.setModel("aaa");
        consoleViewModel.setManufacturer("dell");
        consoleViewModel.setMemoryAmount("64");
        consoleViewModel.setProcessor("bbb");
        consoleViewModel.setPrice(new BigDecimal(50.00));
        consoleViewModel.setQuantity(20);

        consoleViewModel = serviceLayer.saveConsole(consoleViewModel);
        List<ConsoleViewModel> consoleViewModels = serviceLayer.findConsoleByManufacturer("dell");
        assertEquals(consoleViewModels.size(),1);
        assertEquals(consoleViewModels.get(0), consoleViewModel);
    }

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

    private void setUpConsoleDaoMock() {

        consoleDao = mock(ConsoleDaoJdbcTemplateImpl.class);

        Console console = new Console();

        console.setConsoleId(5);
        console.setModel("aaa");
        console.setManufacturer("dell");
        console.setMemoryAmount("64");
        console.setProcessor("bbb");
        console.setPrice(new BigDecimal(50.00));
        console.setQuantity(20);

        Console console1 = new Console();

        console1.setModel("aaa");
        console1.setManufacturer("dell");
        console1.setMemoryAmount("64");
        console1.setProcessor("bbb");
        console1.setPrice(new BigDecimal(50.00));
        console1.setQuantity(20);

        List<Console> consolesList = new ArrayList<>();
        consolesList.add(console);

        doReturn(console).when(consoleDao).addConsole(console1);
        doReturn(console).when(consoleDao).getConsole(5);
        doReturn(consolesList).when(consoleDao).getAllConsoles();
        doReturn(consolesList).when(consoleDao).getConsoleByManufacturer(console.getManufacturer());
    }

    private void setUpInvoiceDaoMock() {

        invoiceDao = mock(InvoiceDaoJdbcTemplateImpl.class);

        Invoice invoice = new Invoice();

        invoice.setInvoiceId(1);
        invoice.setName("jill");
        invoice.setStreet("york");
        invoice.setCity("drive");
        invoice.setState("nj");
        invoice.setZipCode("08540");
        invoice.setItemType("Game");
        invoice.setItemId(2);
        invoice.setUnitPrice(new BigDecimal(10.00));
        invoice.setQuantity(1);
        invoice.setSubTotal(new BigDecimal(10.00));
        invoice.setTax(new BigDecimal(0.50));
        invoice.setProcessingFee(new BigDecimal(2.49));
        invoice.setTotal(new BigDecimal(12.99));

        Invoice invoice1 = new Invoice();

        invoice.setInvoiceId(1);
        invoice.setName("jill");
        invoice.setStreet("york");
        invoice.setCity("drive");
        invoice.setState("nj");
        invoice.setZipCode("08540");
        invoice.setItemType("Game");
        invoice.setItemId(2);
        invoice.setUnitPrice(new BigDecimal(10.00));
        invoice.setQuantity(1);
        invoice.setSubTotal(new BigDecimal(10.00));
        invoice.setTax(new BigDecimal(0.50));
        invoice.setProcessingFee(new BigDecimal(2.49));
        invoice.setTotal(new BigDecimal(12.99));

        doReturn(invoice).when(invoiceDao).addInvoice(invoice1);

    }

    private void setUpTShirtDaoMock() {

        tShirtDao = mock(TShirtDaoJdbcTemplateImpl.class);

        TShirt tShirt = new TShirt();

        tShirt.settShirtId(3);
        tShirt.setSize("small");
        tShirt.setColor("red");
        tShirt.setDescription("full sleeve");
        tShirt.setPrice(new BigDecimal(2.00));
        tShirt.setQuantity(20);

        TShirt tShirt1 = new TShirt();

        tShirt1.setSize("small");
        tShirt1.setColor("red");
        tShirt1.setDescription("full sleeve");
        tShirt1.setPrice(new BigDecimal(2.00));
        tShirt1.setQuantity(20);

        List<TShirt> tShirtsList = new ArrayList<>();
        tShirtsList.add(tShirt);

        doReturn(tShirt).when(tShirtDao).addTShirt(tShirt1);
        doReturn(tShirt).when(tShirtDao).getTShirt(3);
        doReturn(tShirtsList).when(tShirtDao).getAllTShirts();
        doReturn(tShirtsList).when(tShirtDao).getTShirtByColor(tShirt.getColor());
        doReturn(tShirtsList).when(tShirtDao).getTShirtBySize(tShirt.getSize());
    }



    private void setUpProcessingFeeDaoMock() {

        processingFeeDao = mock(ProcessingFeeDaoJdbcTemplateImpl.class);

        ProcessingFee processingFee = new ProcessingFee();

        processingFee.setProductType("Game");
        processingFee.setFee(new BigDecimal(1.49));

        doReturn(processingFee).when(processingFeeDao).getProcessingFeeByProductType("Game");

    }

    private void setUpSalesTaxRateDaoMock() {

        salesTaxRateDao = mock(SalesTaxRateDaoJdbcTemplateImpl.class);

        SalesTaxRate salesTaxRate = new SalesTaxRate();

        salesTaxRate.setState("nj");
        salesTaxRate.setRate(new BigDecimal(0.02));

        doReturn(salesTaxRate).when(salesTaxRateDao).getSalesTaxByState("nj");

    }



}
