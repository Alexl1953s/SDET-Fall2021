package maps;

import java.text.NumberFormat;
import java.util.*;

public class MapEntrySetIteration {

    public static void main(String[] args) {

        Map<String, Integer> populationMap = new HashMap<>();

        populationMap.put("Indonesia", 273_523_615);
        populationMap.put("Mexico", 128_932_753);
        populationMap.put("Japan", 126_476_461);
        populationMap.put("Egypt", 102_334_404);
        populationMap.put("Tanzania", 59_734_218);

        System.out.println("Population map: " + populationMap);

        NumberFormat formatPopulation = NumberFormat.getInstance();

        // A map entry (key-value pair).  The Map.entrySet() method returns
        // a collection-view of the map, whose elements are of this class.
        Set<Map.Entry<String, Integer>> entries = populationMap.entrySet(); // entrySet() -> returns a Set view of the mappings
        // [aka entry -> key value pair] contained in this map

        System.out.println("Entries in the set: " + entries);

        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + " has population of: " + formatPopulation.format(entry.getValue()));
        }
    }
}
