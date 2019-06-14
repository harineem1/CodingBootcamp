import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TelevisionReader {

        public static void main(String[] args) {

            PrintWriter writer = null;

            List<Television> televisionList;


            try {

                ObjectMapper mapper = new ObjectMapper();
                televisionList = mapper.readValue(new File("televisions.json"), new TypeReference<List<Television>>(){});

                int  screenSize = 60;
                televisionList

                        .stream()
                        .filter(tv -> tv.getScreenSize() > screenSize)
                        .forEach(tv -> {
                            System.out.println("===============");
                            System.out.println("Brand: " + tv.getBrand());
                            System.out.println("Model: " + tv.getModel());
                            System.out.println("screenSize: " + tv.getScreenSize());
                            System.out.println("Price: " + tv.getPrice());

                        });
                Map<String, List<Television>> groupedtelevisionList =
                        televisionList
                                .stream()
                                .collect(Collectors.groupingBy(b -> b.getBrand()));

                double avgscreenSize =
                        televisionList
                                .stream()
                                .mapToInt(tv -> tv.getScreenSize())
                                .average()
                                .getAsDouble();

                System.out.println("Average ScreenSize is: " + avgscreenSize);

                int maxscreenSize =
                        televisionList
                                .stream()
                                .mapToInt(tv -> tv.getScreenSize())
                                .max()
                                .getAsInt();

                System.out.println("Max ScreenSize: " + maxscreenSize);


           } catch (JsonProcessingException e) {
                e.printStackTrace();

                System.out.println("Error");

            } catch (FileNotFoundException e) {
                System.out.println("File Not Found.");

            }  catch (IOException e) {
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

