package com.company.HarineeMadhusudhanU1Capstone.viewmodel;

import javax.validation.constraints.NotEmpty;
import java.math.BigDecimal;
import java.util.Objects;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.PositiveOrZero;


public class GameViewModel {

    private int gameId;
    @NotEmpty(message = "Please supply a value for title")
    private String title;
    @NotEmpty(message = "Please supply a value for ersbRating")
    private String ersbRating;
    @NotEmpty(message = "Please supply a value for description")
    private String description;
    @PositiveOrZero(message = "Please supply a value for price")
    private BigDecimal price;
    @NotEmpty(message = "Please supply a value for studio")
    private String studio;
    @Positive(message = "Please supply a value for quantity")
    private int quantity;

    public GameViewModel(int gameId, @NotEmpty(message = "Please supply a value for title") String title,
                         @NotEmpty(message = "Please supply a value for ersbRating") String ersbRating,
                         @NotEmpty(message = "Please supply a value for description") String description,
                         @PositiveOrZero(message = "Please supply a value for price") BigDecimal price,
                         @NotEmpty(message = "Please supply a value for studio") String studio,
                         @Positive(message = "Please supply a value for quantity") int quantity) {
        this.gameId = gameId;
        this.title = title;
        this.ersbRating = ersbRating;
        this.description = description;
        this.price = price;
        this.studio = studio;
        this.quantity = quantity;
    }

    public GameViewModel() {
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
        GameViewModel that = (GameViewModel) o;
//        System.out.println(gameId == that.gameId);
//        System.out.println(that.gameId);
//        System.out.println(quantity == that.quantity);
//        System.out.println(that.quantity);
//        System.out.println(title == that.title);
//        System.out.println(that.title);
//        System.out.println(ersbRating == that.ersbRating);
//        System.out.println(that.ersbRating);
//        System.out.println(description == that.description);
//        System.out.println(that.description);
//        System.out.println(price == that.price);
//        System.out.println(that.price);
//        System.out.println(studio == that.studio);
//        System.out.println(that.studio);
        return gameId == that.gameId &&
                quantity == that.quantity &&
                title.equals(that.title) &&
                ersbRating.equals(that.ersbRating) &&
                description.equals(that.description) &&
                price.equals(that.price) &&
                studio.equals(that.studio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gameId, title, ersbRating, description, price, studio, quantity);
    }
}
