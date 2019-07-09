package com.company.HarineeMCU1M5Summative.dto;

import java.util.Objects;

public class Author {

    private int authorId;
    private String firstName;
    private String lastName;
    private String Street;
    private String city;
    private String state;
    private String postalCode;
    private String phone;
    private String email;

    public int getAuthorId() {
        System.out.println("Asking for author Id " + authorId);
        return authorId;
    }

    //public void setAuthorId(int authorId) {
        //this.authorId = authorId;
    //}

    public Author( String firstName, String lastName, String street, String city, String state, String postalCode, String phone, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.Street = street;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
        this.phone = phone;
        this.email = email;
    }

    public Author() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStreet() {
        return Street;
    }

    public void setStreet(String street) {
        Street = street;
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




    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return authorId == author.authorId &&
                firstName.equals(author.firstName) &&
                lastName.equals(author.lastName) &&
                Street.equals(author.Street) &&
                city.equals(author.city) &&
                state.equals(author.state) &&
                postalCode.equals(author.postalCode) &&
                phone.equals(author.phone) &&
                email.equals(author.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorId, firstName, lastName, Street, city, state, postalCode, phone, email);
    }
}
