package maps;

import java.util.*;

public class CollectionOfValuesInMap {

    public static void main(String[] args) {

        /*
        values() -> method returns the collection of values from the map
         */

        Map<String, Integer> carYearBuilt = new HashMap<>();

        carYearBuilt.put("Camaro", 1965);
        carYearBuilt.put("Mustang", 2001);
        carYearBuilt.put("Accord", 2019);
        carYearBuilt.put("Impala", 1976);
        carYearBuilt.put("Camry", 2020);
        carYearBuilt.put("Highlander", 2021);

        Collection<Integer> yearsBuilt = carYearBuilt.values(); // values() -> returns a collection view of the values contained in this map
        System.out.println(yearsBuilt);

        Set<String> cars = carYearBuilt.keySet(); // keySet() -> returns a Set view of the keys in this map
        System.out.println(cars);
    }
}
