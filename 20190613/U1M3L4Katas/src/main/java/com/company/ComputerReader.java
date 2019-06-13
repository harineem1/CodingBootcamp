package com.company;

import com.opencsv.CSVReader;
import com.opencsv.bean.CsvToBeanBuilder;
import com.company.Computer;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ComputerReader {
    public static void main(String[] args) throws FileNotFoundException {
    try {
        List<Computer> computers =
                new CsvToBeanBuilder<Computer>(new FileReader("computers.csv")).withType(Computer.class).build().parse();
        for (Computer c : computers) {
            System.out.println("=================================");
            System.out.println(c.getBrand());
            System.out.println(c.getModel());
            System.out.println(c.getCPU());
            System.out.println(c.getRAM());
            System.out.println(c.getStorage());

        }
    }
    catch (FileNotFoundException e) {
        System.out.println("Error");
    }
    }
}
