package com.company;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class JSONWriteAndRead {
    public static void main(String[] args) {

        PrintWriter writer = null;
        Car c = new Car();
        c.setMake("Toyota");
        c.setModel("Camry");
        c.setYear(2012);
        c.setColor("Blue");


        Car c2 = new Car();
        c2.setMake("Honda");
        c2.setModel("Civic");
        c2.setYear(2001);
        c2.setColor("Silver");

        Car c3 = new Car();
        c3.setMake("Jeep");
        c3.setModel("Wrangler");
        c3.setYear(2009);
        c3.setColor("Rust");

        Car c4 = new Car();
        c4.setMake("Ford");
        c4.setModel("Mustang");
        c4.setYear(1964);
        c4.setColor("Red");

        Car c5 = new Car();
        c5.setMake("Tesla");
        c5.setModel("Roadster");
        c5.setYear(2018);
        c5.setColor("Black");
        List<Car> carList = new ArrayList<>();

        carList.add(c);
        carList.add(c2);
        carList.add(c3);
        carList.add(c4);
        carList.add(c5);


        try {

            ObjectMapper mapper = new ObjectMapper();
            String jsoncarList = mapper.writeValueAsString(carList);

            System.out.println(jsoncarList);

            writer = new PrintWriter(new FileWriter("carlist.json"));

            writer.println(jsoncarList);

        } catch (JsonProcessingException e) {
            System.out.println("ERROR: Problem encountered reading JSON file - " + e.getMessage());
        } catch (IOException e) {
            System.out.println("ERROR: Could not write to file: " + e.getMessage());
        } finally {
            if (writer != null) {
                writer.flush();
                writer.close();
            }
        }
    }

}
