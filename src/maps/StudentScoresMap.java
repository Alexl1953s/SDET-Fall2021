package maps;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class StudentScoresMap {

    public static void main(String[] args) {

        Map<String, Double> scoresMap = new HashMap<>();

        scoresMap.put("Elon Musk", 67.5);
        scoresMap.put("John Doe", 78.9);
        scoresMap.put("Bill Gates", 90.0);
        scoresMap.put("Lionel Messi", null);

        scoresMap.put(null, 98.8);
        scoresMap.put(null, 100.0);

        System.out.println("John Doe's score: " + scoresMap.get("John Doe"));
        System.out.println("Lionel Messi's score: " + scoresMap.get("Lionel Messi"));

        Set<String> scoresKeys = scoresMap.keySet(); // Returns a Set view of the keys contained in this map

        System.out.println(scoresKeys);

        for (String key : scoresKeys) {
            System.out.println(key + " scored " + scoresMap.get(key));
        }
    }
}
