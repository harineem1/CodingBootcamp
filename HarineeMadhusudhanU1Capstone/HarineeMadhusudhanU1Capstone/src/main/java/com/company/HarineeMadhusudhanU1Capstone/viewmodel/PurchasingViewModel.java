package com.company.HarineeMadhusudhanU1Capstone.viewmodel;

import javax.validation.constraints.NotEmpty;

import java.util.Objects;

public class PurchasingViewModel {

        @NotEmpty(message = "Please supply a value for name")
        private String name;
        @NotEmpty(message = "Please supply a value for street")
        private String street;
        @NotEmpty(message = "Please supply a value for city")
        private String city;
        @NotEmpty(message = "Please supply a value for state")
        private String state;
        @NotEmpty(message = "Please supply a value for zipcode")
        private String zipCode;
        @NotEmpty(message = "Please supply a value for item Type")
        private String itemType;
        @NotEmpty(message = "Please supply a value for item Id")
        private int itemId;
        @NotEmpty(message = "Please supply a value for quantity")
        private int quantity;


    public PurchasingViewModel(@NotEmpty(message = "Please supply a value for name") String name,
                               @NotEmpty(message = "Please supply a value for street") String street,
                               @NotEmpty(message = "Please supply a value for city") String city,
                               @NotEmpty(message = "Please supply a value for state") String state,
                               @NotEmpty(message = "Please supply a value for zipcode") String zipCode,
                               @NotEmpty(message = "Please supply a value for item Type") String itemType,
                               @NotEmpty(message = "Please supply a value for item Id") int itemId,
                               @NotEmpty(message = "Please supply a value for quantity") int quantity) {
        this.name = name;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.itemType = itemType;
        this.itemId = itemId;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
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
        PurchasingViewModel that = (PurchasingViewModel) o;
        return itemId == that.itemId &&
                quantity == that.quantity &&
                name.equals(that.name) &&
                street.equals(that.street) &&
                city.equals(that.city) &&
                state.equals(that.state) &&
                zipCode.equals(that.zipCode) &&
                itemType.equals(that.itemType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, street, city, state, zipCode, itemType, itemId, quantity);
    }
}
