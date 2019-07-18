package com.company.HarineeMadhusudhanU1Capstone.dao;

import com.company.HarineeMadhusudhanU1Capstone.dto.Game;



import java.util.List;

public interface GameDao {

    Game addGame(Game game);

    Game getGame(int gameId);

    List<Game> getAllGames();

    void updateGame(Game game);

    void deleteGame(int gameId);

    List <Game> getGamesByStudio(String studio);

    List <Game> getGamesByErsb(String ersb);

    List <Game> getGamesByTitle(String title);


}
