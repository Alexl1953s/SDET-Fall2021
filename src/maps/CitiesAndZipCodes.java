package maps;

import java.util.HashMap;
import java.util.Map;

public class CitiesAndZipCodes {

    public static void main(String[] args) {

        Map<Integer, String> citiesAndZipCodes = new HashMap<>();
        citiesAndZipCodes.put(60490, "Bolingbrook");
        citiesAndZipCodes.put(96051, "Los Angeles");
        citiesAndZipCodes.put(97862, "Los Angeles");
        citiesAndZipCodes.put(67843, "Chicago");

        System.out.println(citiesAndZipCodes);

        String laString = citiesAndZipCodes.get(97862);
        System.out.println("The city this zip 97862 belongs to is: " + laString);

        String bbString = citiesAndZipCodes.get(60490);
        System.out.println("The city this zip 60490 belongs to is: " + bbString);

        // remove(Object key) -> returns the value of the removed key and if the
        // entry or the key does not exist in the map then it returns null
        System.out.println("The removed value is: " + citiesAndZipCodes.remove(96051));

        System.out.println(citiesAndZipCodes);

        // replace(Object key) -> returns the replaced value associated with this key previously
        System.out.println("The previous value of 97862 zip code was: " + citiesAndZipCodes.replace(97862, "San Francisco")); // return the old value
        System.out.println(citiesAndZipCodes);

        System.out.println("The previous value of 97862 zip code was: " + citiesAndZipCodes.replace(97862, "San Francisco", "Bay Area"));
        // return true if replacement was successful

        System.out.println("The  85231 : " + citiesAndZipCodes.replace(85231, "Fae City", "Random City"));

        System.out.println(citiesAndZipCodes);
    }
}
