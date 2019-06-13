package com.company;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.company.Television;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class TelevisionReader {

    public static void main(String[] args) {

        PrintWriter writer = null;

        List<Television> televisionList;

        try {

            ObjectMapper mapper = new ObjectMapper();
            televisionList = mapper.readValue(new File("televisions.json"), new TypeReference<List<Television>>(){});

            String jsontelevisions = mapper.writeValueAsString(televisionList);

            for (Television tv : televisionList) {
                System.out.println("================");
                System.out.println(tv.getBrand());
                System.out.println(tv.getModel());
                System.out.println(tv.getScreenSize());
                System.out.println(tv.getPrice());
            }

            writer = new PrintWriter(new FileWriter("televisionslist.json"));

            writer.println(jsontelevisions);


        } catch (JsonProcessingException e) {
            e.printStackTrace();

            System.out.println("Error");

        } catch (IOException e) {
            e.printStackTrace();

            System.out.println("Error");
        } finally {
            if (writer != null) {
                writer.flush();
                writer.close();
            }
        }
    }

}









