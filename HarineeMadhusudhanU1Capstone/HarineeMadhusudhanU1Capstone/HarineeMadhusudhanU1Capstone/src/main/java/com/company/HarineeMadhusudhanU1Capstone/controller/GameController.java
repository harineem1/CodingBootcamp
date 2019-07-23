package com.company.HarineeMadhusudhanU1Capstone.controller;


import com.company.HarineeMadhusudhanU1Capstone.servicelayer.ServiceLayer;
import com.company.HarineeMadhusudhanU1Capstone.viewmodel.GameViewModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;


import javax.validation.Valid;

@RestController
@RequestMapping("/game")//This mapping at class level allows to set the base path for the Customer API

public class GameController {

    @Autowired
    ServiceLayer serviceLayer;



    @GetMapping//Another way to set the Rest API Get mapping
    @ResponseStatus(HttpStatus.OK)
    public List<GameViewModel> getAllGames() {
        return serviceLayer.findAllGames();
    }

    @PostMapping//Another way to set the Rest API Post mapping
    @ResponseStatus(HttpStatus.CREATED)
    public GameViewModel createGames(@RequestBody @Valid GameViewModel games) {
        return serviceLayer.saveGame(games);
    }

    @GetMapping("/{id}")//Another way to set the Rest API Get mapping
    @ResponseStatus(HttpStatus.OK)
    public GameViewModel getGame(@PathVariable("id") int gameId) {
        GameViewModel gamesViewModel = serviceLayer.findGameByGameId(gameId);
        if (gamesViewModel == null)
            throw new IllegalArgumentException("Games could not be retrieved for id " + gameId);
        return gamesViewModel;
    }

    @DeleteMapping("/{id}")//Another way to set the Rest API Delete mapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteGame(@PathVariable("id") int gameId) {
        serviceLayer.removeGame(gameId);
    }

    @PutMapping("/{id}")//Another way to set the Rest API Put mapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateGame(@PathVariable("id") int gameId, @RequestBody @Valid GameViewModel gamesViewModel) {
        if (gamesViewModel.getGameId() == 0)
            gamesViewModel.setGameId(gameId);
        if (gameId != gamesViewModel.getGameId()) {
            throw new IllegalArgumentException("Customer ID on path must match the ID in the Customer object");
        }
        serviceLayer.updateGame(gamesViewModel);
    }

    @GetMapping("/studio/{studio}")
    @ResponseStatus(HttpStatus.OK)
    public List<GameViewModel> getGamesByStudio(@PathVariable("studio") String studio) {
        List<GameViewModel> game = serviceLayer.findGamesByStudio(studio);
        if (game != null && game.size() == 0)
            throw new IllegalArgumentException("Game could not be retrieved for customer " + studio);
        return game;
    }

    @GetMapping("/ersb/{ersb}")
    @ResponseStatus(HttpStatus.OK)
    public List<GameViewModel> getGameByErsb(@PathVariable("ersb") String ersb) {
        List<GameViewModel> game = serviceLayer.findGamesByErsb(ersb);
        if (game != null && game.size() == 0)
            throw new IllegalArgumentException("Game could not be retrieved for customer " + ersb);
        return game;
    }

    @GetMapping("/title/{title}")
    @ResponseStatus(HttpStatus.OK)
    public List<GameViewModel> getGamesByTitle(@PathVariable("title") String title) {
        List<GameViewModel> game = serviceLayer.findGamesByTitle(title);
        if (game != null && game.size() == 0)
            throw new IllegalArgumentException("Game could not be retrieved for customer " + title);
        return game;
    }



}
