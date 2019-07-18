package com.company.HarineeMadhusudhanU1Capstone.servicelayer;

import com.company.HarineeMadhusudhanU1Capstone.dao.*;
import com.company.HarineeMadhusudhanU1Capstone.dto.Game;
import com.company.HarineeMadhusudhanU1Capstone.dto.TShirt;
import com.company.HarineeMadhusudhanU1Capstone.viewmodel.ConsoleViewModel;
import com.company.HarineeMadhusudhanU1Capstone.viewmodel.GameViewModel;
import com.company.HarineeMadhusudhanU1Capstone.viewmodel.TShirtViewModel;
import org.springframework.stereotype.Component;

import java.io.Console;

@Component //creates a list of components (DAOs)
public class ServiceLayer {

       GameDao gameDao;
       ConsoleDao consoleDao;
       TShirtDao tShirtDao;
       InvoiceDao invoiceDao;
       ProcessingFeeDao processingFeeDao;
       SalesTaxRateDao salesTaxRateDao;

    public ServiceLayer(GameDao gameDao) {
        this.gameDao = gameDao;
    }

    public ServiceLayer(GameDao gameDao, TShirtDao tShirtDao) {
        this.gameDao = gameDao;
        this.invoiceDao = invoiceDao;
    }
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

       public void updateCustomer(GameViewModel gameViewModel) {

              Game game = new Game();
              game.setTitle(gameViewModel.getTitle());
              game.setErsbRating(gameViewModel.getErsbRating());
              game.setDescription(gameViewModel.getDescription());
              game.setPrice(gameViewModel.getPrice());
              game.setStudio(gameViewModel.getStudio());
              game.setQuantity(gameViewModel.getQuantity());

              gameDao.updateGame(game);
       }
    public GameViewModel findGamesbyGameId(int gameId) {

        Game game = gameDao.getGame(gameId);
        if (game == null)
            return null;
        else
            return buildGameViewModel(game);
    }
//
          public void removeGame(int gameId) {

              gameDao.deleteGame(gameId);
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

//    public TShirtViewModel findTShirtsByTShirtId(int tShirtId) {
//
//        TShirt tShirt =  tShirtDao.getTShirt(tShirtId);
//        if(tShirt == null)
//            return null;
//        else
//            return buildTShirtViewModel(tShirt);
//    }
//
//    public void removeTShirt(int tShirtId){
//
//        tShirtDao.deleteTShirt(tShirtId);
//    }
//
//    public void updateTShirt(TShirtViewModel tShirtViewModel){
//
//        TShirt tShirt = new TShirt();
//
//        tShirt.settShirtId(tShirtViewModel.gettShirtId());
//        tShirt.setSize(tShirtViewModel.getSize());
//        tShirt.setColor(tShirtViewModel.getColor());
//        tShirt.setDescription(tShirtViewModel.getDescription());
//        tShirt.setPrice(tShirtViewModel.getPrice());
//        tShirt.setQuantity(tShirtViewModel.getQuantity());
//
//        tShirtDao.updateTShirt(tShirt);
//    }

//    public ConsoleViewModel saveConsole(ConsoleViewModel consoleViewModel) {
//
//        Console console = new Console();
//        console.setModel(consoleViewModel.getModel());
//        console.setManufacturer(consoleViewModel.getManufacturer());
//        consoles.setMemoryAmount(consoleViewModel.getMemoryAmount());
//        consoles.setProcessor(consoleViewModel.getProcessor());
//        consoles.setPrice(consoleViewModel.getPrice());
//        consoles.setQuantity(consoleViewModel.getQuantity());
//        consoles =  consolesDao.addConsoles(consoles);
//
//        consoleViewModel.setId(consoles.getGameId());
//        return consoleViewModel;
//    }
//
//    public ConsoleViewModel findConsoleByConsoleId(int consoleId) {
//
//        Console console =  consoleDao.getConsole(consoleId);
//        if(console == null)
//            return null;
//        else
//            return buildConsoleViewModel(console);
//    }
//    public void removeConsole(int consoleId) {
//
//        consoleDao.deleteConsole(consoleId);
//    }

    private ConsoleViewModel buildConsoleViewModel(Console console) {

        ConsoleViewModel consoleViewModel = new ConsoleViewModel();

//        consoleViewModel.setConsoleId(console.getConsoleId());
//        consoleViewModel.setModel(console.getModel());
//        consoleViewModel.setManufacturer(console.getManufacturer());
//        consoleViewModel.setMemoryAmount(console.getMemoryAmount());
//        consoleViewModel.setProcessor(console.getProcessor());
//        consoleViewModel.setPrice(console.getPrice());
//        consoleViewModel.setQuantity(console.getQuantity());

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
//    private TShirtViewModel buildTShirtViewModel(TShirt tShirt) {
//
//        TShirtViewModel tshirtViewModel = new TShirtViewModel();
//
//        tshirtViewModel.settShirtId(tShirt.gettShirtId());
//        tshirtViewModel.setSize(tShirt.getSize());
//        tshirtViewModel.setColor(tShirt.getColor());
//        tshirtViewModel.setDescription(tShirt.getDescription());
//        tshirtViewModel.setPrice(tShirt.getPrice());
//        tshirtViewModel.setQuantity(tShirt.getQuantity());
//
//        return tshirtViewModel;
//    }
}
