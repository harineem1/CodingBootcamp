package com.company;


import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CSVWriteAndRead {
    public static void main(String[] args) throws FileNotFoundException {

        List<Car> carList = new ArrayList<>();

        carList.add(new Car(2012, "Toyota", "Camry", "Blue"));
        carList.add(new Car(2001, "Honda", "Civic", "Silver"));
        carList.add(new Car(2009, "Jeep", "Wrangler", "Rust"));
        carList.add(new Car(2018, "Tesla", "Roadster", "Black"));
        carList.add(new Car(1964, "Ford", "Mustang", "Red"));



        try {

            Writer writer = new FileWriter("carlistfile.csv");
            StatefulBeanToCsv beanToCsv = new StatefulBeanToCsvBuilder(writer).build();
            beanToCsv.write(carList);
            writer.close();

            List<Car> cars =
                    new CsvToBeanBuilder<Car>(new FileReader("carlistfile.csv")).withType(Car.class).build().parse();

            for (Car c: cars) {
                System.out.println("=================================");
                System.out.println(c.getColor());
                System.out.println(c.getMake());
                System.out.println(c.getModel());
                System.out.println(c.getYear());
            }


        } catch (IOException | CsvDataTypeMismatchException | CsvRequiredFieldEmptyException e) {
            {
                e.printStackTrace();
            }

    }

    }
}
