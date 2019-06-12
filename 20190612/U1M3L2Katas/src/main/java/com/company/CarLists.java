package com.company;

import java.util.ArrayList;
import java.util.List;

public class CarLists {

    public static void main(String[] args) {

        Car camry = new Car("Toyota", "Camry");
        Car corolla = new Car("Toyota", "Corolla");
        Car highlander = new Car("Toyota", "Highlander");

        Car mustang = new Car("Ford", "Mustang");
        Car fusion = new Car("Ford", "Fusion");
        Car taurus = new Car("Ford", "Taurus");

        Car accord = new Car("Honda", "Accord");
        Car civic = new Car("Honda", "Civic");
        Car fit = new Car("Honda", "Fit");

        List<String>  toyotaList = new ArrayList<String>();
            toyotaList.add("Toyota Camry");
            toyotaList.add ("Toyota Supra");

        List<String>  fordList = new ArrayList<String>();
        fordList.add ("Pontia GTO");
        fordList.add ("Ford Explorer");

        List<String>  hondaList = new ArrayList<String>();
        hondaList.add(" Honda Civic");








    }
}
