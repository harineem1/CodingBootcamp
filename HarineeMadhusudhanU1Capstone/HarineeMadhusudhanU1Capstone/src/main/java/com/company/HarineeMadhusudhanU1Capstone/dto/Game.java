package com.company.HarineeMadhusudhanU1Capstone.dto;


import java.math.BigDecimal;
import java.util.Objects;

public class Game {

    private int gameId;
    private String title;
    private String ersbRating;
    private String description;
    private BigDecimal price;
    private String studio;
    private int quantity;

    public Game() {
    }

    public Game(int gameId, String title, String ersbRating, String description,
                BigDecimal price, String studio, int quantity) {
        this.gameId = gameId;
        this.title = title;
        this.ersbRating = ersbRating;
        this.description = description;
        this.price = price;
        this.studio = studio;
        this.quantity = quantity;
    }

    public int getGameId() {
        return gameId;
    }

    public void setGameId(int gameId) {
        this.gameId = gameId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getErsbRating() {
        return ersbRating;
    }

    public void setErsbRating(String ersbRating) {
        this.ersbRating = ersbRating;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Game game = (Game) o;
        return gameId == game.gameId &&
                quantity == game.quantity &&
                title.equals(game.title) &&
                ersbRating.equals(game.ersbRating) &&
                description.equals(game.description) &&
                price.equals(game.price) &&
                studio.equals(game.studio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gameId, title, ersbRating, description, price, studio, quantity);
    }
}
