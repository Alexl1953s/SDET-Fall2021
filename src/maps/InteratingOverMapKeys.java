package maps;

import java.util.*;

public class InteratingOverMapKeys {

    public static void main(String[] args) {

        /*
        One of the ways to iterate over maps is using keySet() method of Map interface
        which returns the Set view of map's keys [contained in this map]
         */

        Map<Integer, String> cityCodes = new HashMap<>();
        cityCodes.put(312, "Chicago");
        cityCodes.put(213, "LA");
        cityCodes.put(323, "LA");
        cityCodes.put(347, "NY");
        cityCodes.put(333, "Philadelphia");

        Set<Integer> keySetOfCities = cityCodes.keySet(); // Returns a Set view of the keys contained in this map

        System.out.println("The keys in this map are: " + keySetOfCities);

        for (Integer key : keySetOfCities) {

            System.out.println(key + " -> " + cityCodes.get(key));

        }
    }
}
