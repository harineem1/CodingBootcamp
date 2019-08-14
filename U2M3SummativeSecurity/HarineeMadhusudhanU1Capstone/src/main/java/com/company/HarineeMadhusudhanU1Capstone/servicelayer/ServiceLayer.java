package com.company.HarineeMadhusudhanU1Capstone.servicelayer;

import com.company.HarineeMadhusudhanU1Capstone.dao.*;
import com.company.HarineeMadhusudhanU1Capstone.dto.Game;
import com.company.HarineeMadhusudhanU1Capstone.dto.TShirt;
import com.company.HarineeMadhusudhanU1Capstone.dto.Console;
import com.company.HarineeMadhusudhanU1Capstone.dto.Invoice;

import com.company.HarineeMadhusudhanU1Capstone.viewmodel.ConsoleViewModel;
import com.company.HarineeMadhusudhanU1Capstone.viewmodel.GameViewModel;
import com.company.HarineeMadhusudhanU1Capstone.viewmodel.TShirtViewModel;
import com.company.HarineeMadhusudhanU1Capstone.viewmodel.InvoiceViewModel;
import com.company.HarineeMadhusudhanU1Capstone.viewmodel.PurchasingViewModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

@Component //creates a list of components (DAOs)
public class ServiceLayer {

       GameDao gameDao;
       ConsoleDao consoleDao;
       TShirtDao tShirtDao;
       InvoiceDao invoiceDao;
       ProcessingFeeDao processingFeeDao;
       SalesTaxRateDao salesTaxRateDao;

    public ServiceLayer() {
    }

    public ServiceLayer(GameDao gameDao) {
        this.gameDao = gameDao;
    }

    public ServiceLayer(GameDao gameDao, TShirtDao tShirtDao) {
        this.gameDao = gameDao;
        this.invoiceDao = invoiceDao;
    }
      @Autowired
       public ServiceLayer(GameDao gameDao, ConsoleDao consoleDao, TShirtDao
               tShirtDao, InvoiceDao invoiceDao, ProcessingFeeDao processingFeeDao,
                           SalesTaxRateDao salesTaxRateDao) {
              this.gameDao = gameDao;
              this.consoleDao = consoleDao;
              this.tShirtDao = tShirtDao;
              this.invoiceDao = invoiceDao;
              this.processingFeeDao = processingFeeDao;
              this.salesTaxRateDao = salesTaxRateDao;
       }

    public List<TShirtViewModel> findAllTShirts(){

        List<TShirt> tShirtsList = tShirtDao.getAllTShirts();
        List<TShirtViewModel> tShirtViewModelList = new ArrayList<>();

        tShirtsList.stream()
                .forEach(tShirts -> {
                    TShirtViewModel tvm = buildTShirtViewModel(tShirts);
                    tShirtViewModelList.add(tvm);
                });
        return tShirtViewModelList;
    }

    public TShirtViewModel saveTShirt(TShirtViewModel tShirtViewModel) {

        TShirt tShirt = new TShirt();

        tShirt.setSize(tShirtViewModel.getSize());
        tShirt.setColor(tShirtViewModel.getColor());
        tShirt.setDescription(tShirtViewModel.getDescription());
        tShirt.setPrice(tShirtViewModel.getPrice());
        tShirt.setQuantity(tShirtViewModel.getQuantity());

        tShirt =  tShirtDao.addTShirt(tShirt);

        tShirtViewModel.settShirtId(tShirt.gettShirtId());
        return tShirtViewModel;
    }
    public TShirtViewModel findTShirtBytShirtId(int tShirtId) {

        TShirt tShirt =  tShirtDao.getTShirt(tShirtId);
        if(tShirt == null)
            return null;
        else
            return buildTShirtViewModel(tShirt);
    }

    public void removeTShirt(int tShirtId){

        tShirtDao.deleteTShirt(tShirtId);
    }

    public void updateTShirt(TShirtViewModel tShirtViewModel){

        TShirt tShirt = new TShirt();

        tShirt.settShirtId(tShirtViewModel.gettShirtId());
        tShirt.setSize(tShirtViewModel.getSize());
        tShirt.setColor(tShirtViewModel.getColor());
        tShirt.setDescription(tShirtViewModel.getDescription());
        tShirt.setPrice(tShirtViewModel.getPrice());
        tShirt.setQuantity(tShirtViewModel.getQuantity());

        tShirtDao.updateTShirt(tShirt);
    }

    public List<TShirtViewModel> findTShirtByColor(String color){

        List<TShirt> tShirtsList = tShirtDao.getTShirtByColor(color);
        List<TShirtViewModel> tShirtViewModelList = new ArrayList<>();

        tShirtsList.stream()
                .forEach(tShirts -> {
                    TShirtViewModel tvm = buildTShirtViewModel(tShirts);
                    tShirtViewModelList.add(tvm);
                });
        return tShirtViewModelList;
    }

    public List<TShirtViewModel> findTShirtBySize(String size){

        List<TShirt> tShirtsList = tShirtDao.getTShirtBySize(size);
        List<TShirtViewModel> tShirtViewModelList = new ArrayList<>();

        tShirtsList.stream()
                .forEach(tShirts -> {
                    TShirtViewModel tvm = buildTShirtViewModel(tShirts);
                    tShirtViewModelList.add(tvm);
                });
        return tShirtViewModelList;
    }

    public GameViewModel saveGame(GameViewModel gameViewModel) {
              Game game = new Game();
              game.setTitle(gameViewModel.getTitle());
              game.setErsbRating(gameViewModel.getErsbRating());
              game.setDescription(gameViewModel.getDescription());
              game.setPrice(gameViewModel.getPrice());
              game.setStudio(gameViewModel.getStudio());
              game.setQuantity(gameViewModel.getQuantity());
              game =  gameDao.addGame(game);
           gameViewModel.setGameId(game.getGameId());
              return gameViewModel;
    }

    public List<GameViewModel> findAllGames(){

        List<Game> gamesList = gameDao.getAllGames();
        List<GameViewModel> gameViewModelList = new ArrayList<>();

        gamesList.stream()
                .forEach(games -> {
                    GameViewModel tvm = buildGameViewModel(games);
                    gameViewModelList.add(tvm);
                });
        return gameViewModelList;
    }

    public GameViewModel findGameByGameId(int gameId) {

        Game game =  gameDao.getGame(gameId);
        if(game == null)
            return null;
        else
            return buildGameViewModel(game);

    }

    public void updateGame(GameViewModel gameViewModel) {

              Game game = new Game();
              game.setTitle(gameViewModel.getTitle());
              game.setErsbRating(gameViewModel.getErsbRating());
              game.setDescription(gameViewModel.getDescription());
              game.setPrice(gameViewModel.getPrice());
              game.setStudio(gameViewModel.getStudio());
              game.setQuantity(gameViewModel.getQuantity());

              gameDao.updateGame(game);
    }

    public void removeGame(int gameId) {

              gameDao.deleteGame(gameId);
    }

    public List<GameViewModel> findGamesByStudio(String studio){

        List<Game> gamesList = gameDao.getGamesByStudio(studio);
        List<GameViewModel> gameViewModelList = new ArrayList<>();

        gamesList.stream()
                .forEach(games -> {
                    GameViewModel gvm = buildGameViewModel(games);
                    gameViewModelList.add(gvm);
                });
        return gameViewModelList;
    }

    public List<GameViewModel> findGamesByErsb(String ersb){

        List<Game> gamesList = gameDao.getGamesByErsb(ersb);
        List<GameViewModel> gameViewModelList = new ArrayList<>();

        gamesList.stream()
                .forEach(games -> {
                    GameViewModel gvm = buildGameViewModel(games);
                    gameViewModelList.add(gvm);
                });
        return gameViewModelList;
    }

    public List<GameViewModel> findGamesByTitle(String title){

        List<Game> gamesList = gameDao.getGamesByTitle(title);
        List<GameViewModel> gameViewModelList = new ArrayList<>();

        gamesList.stream()
                .forEach(games -> {
                    GameViewModel gvm = buildGameViewModel(games);
                    gameViewModelList.add(gvm);
                });
        return gameViewModelList;
    }
    public List<ConsoleViewModel> findAllConsoles(){

        List<Console> consolesList = consoleDao.getAllConsoles();
        List<ConsoleViewModel> consoleViewModelList = new ArrayList<>();

        consolesList.stream()
                .forEach(consoles -> {
                    ConsoleViewModel cvm = buildConsoleViewModel(consoles);
                    consoleViewModelList.add(cvm);
                });
        return consoleViewModelList;
    }


    public ConsoleViewModel saveConsole(ConsoleViewModel consoleViewModel) {

        Console console = new Console();
        console.setModel(consoleViewModel.getModel());
        console.setManufacturer(consoleViewModel.getManufacturer());
        console.setMemoryAmount(consoleViewModel.getMemoryAmount());
        console.setProcessor(consoleViewModel.getProcessor());
        console.setPrice(consoleViewModel.getPrice());
        console.setQuantity(consoleViewModel.getQuantity());
        console = consoleDao.addConsole(console);

        consoleViewModel.setConsoleId(console.getConsoleId());
        return consoleViewModel;
    }


    public ConsoleViewModel findConsoleByConsoleId(int consoleId) {

        Console console =  consoleDao.getConsole(consoleId);
        if(console == null)
            return null;
        else
            return buildConsoleViewModel(console);
    }
    public void removeConsole(int consoleId) {

        consoleDao.deleteConsole(consoleId);
    }
    public void updateConsole(ConsoleViewModel consoleViewModel){

        Console console = new Console();
        console.setConsoleId(consoleViewModel.getConsoleId());
        console.setModel(consoleViewModel.getModel());
        console.setManufacturer(consoleViewModel.getManufacturer());
        console.setMemoryAmount(consoleViewModel.getMemoryAmount());
        console.setProcessor(consoleViewModel.getProcessor());
        console.setPrice(consoleViewModel.getPrice());
        console.setQuantity(consoleViewModel.getQuantity());


        consoleDao.updateConsole(console);
    }
    public List<ConsoleViewModel> findConsoleByManufacturer(String manufacturer){

        List<Console> consolesList = consoleDao.getConsoleByManufacturer(manufacturer);
        List<ConsoleViewModel> consoleViewModelList = new ArrayList<>();

        consolesList.stream()
                .forEach(consoles -> {
                    ConsoleViewModel cvm = buildConsoleViewModel(consoles);
                    consoleViewModelList.add(cvm);
                });
        return consoleViewModelList;
    }

    public InvoiceViewModel saveInvoice(PurchasingViewModel purchasingViewModel) {

        Invoice invoice = new Invoice();

        invoice.setName(purchasingViewModel.getName());
        invoice.setStreet(purchasingViewModel.getStreet());
        invoice.setCity(purchasingViewModel.getCity());
        invoice.setState(purchasingViewModel.getState());
        invoice.setZipCode(purchasingViewModel.getZipCode());
        invoice.setItemId(purchasingViewModel.getItemId());
        invoice.setItemType(purchasingViewModel.getItemType());
        invoice.setQuantity(purchasingViewModel.getQuantity());


        // Calculations
        BigDecimal unitPrice;
        BigDecimal subtotal;
        BigDecimal tax;
        BigDecimal fees;
        BigDecimal total;


        if(invoice.getItemType().equals("Console")){

            Console c = consoleDao.getConsole(invoice.getItemId());
            unitPrice = c.getPrice();

            if (invoice.getQuantity() > c.getQuantity()){
                throw new IllegalArgumentException("Not enough items in stock");
            }else {
                c.setQuantity(c.getQuantity()-invoice.getQuantity());
                consoleDao.updateConsole(c);
            }
        }else if (invoice.getItemType().equals("Game")){

            Game g = gameDao.getGame(invoice.getItemId());
            unitPrice = g.getPrice();

            if (invoice.getQuantity() > g.getQuantity()){
                throw new IllegalArgumentException("Not enough items in stock");
            }else {
                g.setQuantity(g.getQuantity()-invoice.getQuantity());
                gameDao.updateGame(g);
            }


        }else if (invoice.getItemType().equals("T-Shirt")){

            TShirt t = tShirtDao.getTShirt(invoice.getItemId());
            unitPrice = t.getPrice();

            if (invoice.getQuantity() > t.getQuantity()){
                throw new IllegalArgumentException("Not enough items in stock");
            }else {
                t.setQuantity(t.getQuantity()-invoice.getQuantity());
                tShirtDao.updateTShirt(t);
            }

        }
        else{
            throw new IllegalArgumentException("Product type is not correct");
        }

        //
        subtotal = unitPrice.multiply(BigDecimal.valueOf(invoice.getQuantity()));

        //
        tax = salesTaxRateDao.getSalesTaxByState(invoice.getState()).getRate().multiply(subtotal);
        //
        fees = processingFeeDao.getProcessingFeeByProductType(invoice.getItemType()).getFee();

        if (invoice.getQuantity() > 10){
            fees = fees.add(new BigDecimal(15.49));
        }
        //
        total = subtotal.add(tax).add(fees);
        //
        invoice.setUnitPrice(unitPrice);
        invoice.setSubTotal(subtotal);
        invoice.setTax(tax);
        invoice.setProcessingFee(fees);
        invoice.setTotal(total);

        invoice =  invoiceDao.addInvoice(invoice);

        return buildInvoiceViewModel(invoice);
    }

    private ConsoleViewModel buildConsoleViewModel(Console console) {

        ConsoleViewModel consoleViewModel = new ConsoleViewModel();

        consoleViewModel.setConsoleId(console.getConsoleId());
        consoleViewModel.setModel(console.getModel());
        consoleViewModel.setManufacturer(console.getManufacturer());
        consoleViewModel.setMemoryAmount(console.getMemoryAmount());
        consoleViewModel.setProcessor(console.getProcessor());
        consoleViewModel.setPrice(console.getPrice());
        consoleViewModel.setQuantity(console.getQuantity());

        return consoleViewModel;
     }

    private GameViewModel buildGameViewModel(Game game) {

        GameViewModel gameViewModel = new GameViewModel();

        gameViewModel.setGameId(game.getGameId());
        gameViewModel.setTitle(game.getTitle());
        gameViewModel.setErsbRating(game.getErsbRating());
        gameViewModel.setDescription(game.getDescription());
        gameViewModel.setPrice(game.getPrice());
        gameViewModel.setStudio(game.getStudio());
        gameViewModel.setQuantity(game.getQuantity());

        return gameViewModel;
    }
    private TShirtViewModel buildTShirtViewModel(TShirt tShirt) {

        TShirtViewModel tshirtViewModel = new TShirtViewModel();

        tshirtViewModel.settShirtId(tShirt.gettShirtId());
        tshirtViewModel.setSize(tShirt.getSize());
        tshirtViewModel.setColor(tShirt.getColor());
        tshirtViewModel.setDescription(tShirt.getDescription());
        tshirtViewModel.setPrice(tShirt.getPrice());
        tshirtViewModel.setQuantity(tShirt.getQuantity());

        return tshirtViewModel;
    }

    private InvoiceViewModel buildInvoiceViewModel(Invoice invoice) {

        InvoiceViewModel invoiceViewModel = new InvoiceViewModel();

        invoiceViewModel.setInvoiceId(invoice.getInvoiceId());
        invoiceViewModel.setName(invoice.getName());
        invoiceViewModel.setStreet(invoice.getStreet());
        invoiceViewModel.setCity(invoice.getCity());
        invoiceViewModel.setState(invoice.getState());
        invoiceViewModel.setZipCode(invoice.getZipCode());
        invoiceViewModel.setItemType(invoice.getItemType());
        invoiceViewModel.setItemId(invoice.getItemId());
        invoiceViewModel.setUnitPrice(invoice.getUnitPrice());
        invoiceViewModel.setQuantity(invoice.getQuantity());
        invoiceViewModel.setSubTotal(invoice.getSubTotal());
        invoiceViewModel.setTax(invoice.getTax());
        invoiceViewModel.setProcessingFee(invoice.getProcessingFee());
        invoiceViewModel.setTotal(invoice.getTotal());

        return invoiceViewModel;
    }
}
