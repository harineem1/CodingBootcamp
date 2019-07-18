package com.company.HarineeMadhusudhanU1Capstone.controller;


import com.company.HarineeMadhusudhanU1Capstone.servicelayer.ServiceLayer;
import com.company.HarineeMadhusudhanU1Capstone.viewmodel.GameViewModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


import javax.validation.Valid;

@RestController
@RequestMapping("/game")//This mapping at class level allows to set the base path for the Customer API

public class GameController {

    @Autowired
    ServiceLayer gameStoreService;


    @PostMapping//Another way to set the Rest API Post mapping
    @ResponseStatus(HttpStatus.CREATED)
    public GameViewModel createGame(@RequestBody @Valid GameViewModel game) {
        return gameStoreService.saveGame(game);
    }

    @GetMapping("/{id}")//Another way to set the Rest API Get mapping
    @ResponseStatus(HttpStatus.OK)
    public GameViewModel getGame(@PathVariable("id") int gameId) {
        GameViewModel gameViewModel = gameStoreService.findGamesbyGameId(gameId);

        return gameStoreService.findGamesbyGameId(gameId);
    }

    @DeleteMapping("/{id}")//Another way to set the Rest API Delete mapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteGame(@PathVariable("id") int gameId) {
        gameStoreService.removeGame(gameId);
    }

    @PutMapping("/{id}")//Another way to set the Rest API Put mapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateCustomer(@PathVariable("id") int gameId, @RequestBody @Valid GameViewModel gameViewModel) {
        if (gameViewModel.getGameId() == 0)
            gameViewModel.setGameId(gameId);
        if (gameId != gameViewModel.getGameId()) {
            throw new IllegalArgumentException("Customer ID on path must match the ID in the Customer object");
        }
        gameStoreService.updateCustomer(gameViewModel);
    }

}
