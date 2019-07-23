package com.company.HarineeMadhusudhanU1Capstone.viewmodel;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Positive;
import javax.validation.constraints.PositiveOrZero;
import java.math.BigDecimal;
import java.util.Objects;

public class TShirtViewModel {

    private int tShirtId;
    @NotEmpty(message = "Please supply a value for size")
    private String size;
    @NotEmpty(message = "Please supply a value for color")
    private String color;
    @NotEmpty(message = "Please supply a value for description")
    private String description;
    @PositiveOrZero(message = "Please supply a positive or zero value for price")
    private BigDecimal price;
    @Positive(message = "Please supply a positive value for quantity")
    private int quantity;

    public TShirtViewModel(int tShirtId, @NotEmpty(message = "Please supply a value for size") String size,
                           @NotEmpty(message = "Please supply a value for color") String color,
                           @NotEmpty(message = "Please supply a value for description") String description,
                           @PositiveOrZero(message = "Please supply a positive or zero value for price")BigDecimal price,
                           @Positive(message = "Please supply a positive value for quantity") int quantity) {
        this.tShirtId = tShirtId;
        this.size = size;
        this.color = color;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
    }

    public int gettShirtId() {
        return tShirtId;
    }

    public void settShirtId(int tShirtId) {
        this.tShirtId = tShirtId;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public TShirtViewModel() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TShirtViewModel that = (TShirtViewModel) o;
        return tShirtId == that.tShirtId &&
                quantity == that.quantity &&
                size.equals(that.size) &&
                color.equals(that.color) &&
                description.equals(that.description) &&
                price.equals(that.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tShirtId, size, color, description, price, quantity);
    }
}