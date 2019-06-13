package com.company;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) throws FileNotFoundException {

        try {
            int petIndex = Pets.choosePet();

            String chosenPet = Pets.retrievePet(petIndex);
            Pets.readPetsFromFile();
            Pets.writePetToFile(chosenPet);

            Scanner myScanner = new Scanner(System.in);
             int a = Integer.parseInt(myScanner.nextLine());
//            if (a != a){
//            System.out.println("Please enter a valid number.");}
        }
        catch (ArrayIndexOutOfBoundsException e){

            System.out.println("Please choose an available pet.");
        }
        catch (NumberFormatException e)
        {
            System.out.println("Please enter a valid number.");
        }
        catch ( FileNotFoundException e) {
            System.out.println("File Not Found.");

        }
        catch(IOException e) {
            System.out.println("Have a nice day!!.");
        }

        finally {
                System.out.println("Finishing up  finally .....");
            }

        }
}
