package com.company.HarineeMadhusudhanU1Capstone.dao;

import com.company.HarineeMadhusudhanU1Capstone.dto.TShirt;

import java.util.List;

public interface TShirtDao {

    TShirt addTShirt(TShirt tShirt);

    TShirt getTShirt(int tShirtId);

    List<TShirt> getAllTShirts();

    void updateTShirt(TShirt tShirt);

    void deleteTShirt(int tShirtId);

    List<TShirt> getTShirtByColor(String color);

    List<TShirt> getTShirtBySize(String size);


}
