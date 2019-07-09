package com.company.HarineeMCU1M5Summative.dto;

import java.util.Objects;

public class Publisher {

    private int publisherId;
    private String name;
    private String street;
    private String city;
    private String state;
    private String postalCode;
    private String phone;
    private String email;

    public int getPublisherId() {
        return publisherId;
    }



    public Publisher( String name, String street, String city, String state, String postalCode, String phone, String email) {
        this.name = name;
        this.street = street;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
        this.phone = phone;
        this.email = email;
    }

    public Publisher() {
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

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPublisherId(int publisherId) {
        this.publisherId = publisherId;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Publisher publisher = (Publisher) o;
        return publisherId == publisher.publisherId &&
                name.equals(publisher.name) &&
                street.equals(publisher.street) &&
                city.equals(publisher.city) &&
                state.equals(publisher.state) &&
                postalCode.equals(publisher.postalCode) &&
                phone.equals(publisher.phone) &&
                email.equals(publisher.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(publisherId, name, street, city, state, postalCode, phone, email);
    }




}
