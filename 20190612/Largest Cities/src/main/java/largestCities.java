import java.util.*;

public class largestCities {

    public static void main(String[] args) {
        City newYork = new City("New York", 8654321);
        City losAngeles = new City("Los Angeles", 4563218);
        City chicago = new City( "Chicago", 2716520);
        City denver = new City("Denver", 704621);
        City desMoines = new City("Des Moines", 217521);
        City atlanta = new City("Atlanta", 486213);

        Map<String, City> cities = new HashMap<>();

        cities.put("New York", newYork);
        cities.put("California", losAngeles);
        cities.put("Illinois", chicago);
        cities.put("Colorado", denver);
        cities.put("Iowa", desMoines);
        cities.put("Georgia", atlanta);

        System.out.println("number of entries in the map "+ cities.size());

        Set<String> keys = cities.keySet();
        for (String key : keys) {
            System.out.println(" Map Keys :" + key);
        }
        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter a population (number): ");
        int popValue = Integer.parseInt(scan.nextLine());

        System.out.println("Cities with a population larger than " + popValue);

        //Set<String> keys = cities.keySet();

        for(String key : keys) {
            if (cities.get(key).getPopulation() > popValue) {
                System.out.println(key + " : " + cities.get(key).getName());
            }
        }

    }

}
