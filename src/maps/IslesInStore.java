package maps;

import java.util.HashMap;
import java.util.Map;

public class IslesInStore {

    public static void main(String[] args) {


        Map<Byte, String> islesMap = new HashMap<>();

        // since Java treats natural numbers as integers by default
        // we need to explicitly type cast the byte and autoboxing will convert it to an Object of it's type
        islesMap.put((byte) 1, "Pharmacy");
        islesMap.put((byte) 2, "Pharmacy");
        islesMap.put((byte) 3, "Fruits");
        islesMap.put((byte) 4, "Vegetables");
        islesMap.put((byte) 5, "Home goods");
        islesMap.put((byte) 6, "Electronics");
        islesMap.put((byte) 7, "Bakery");
        islesMap.put((byte) 8, "Kids Department");

        System.out.println(islesMap);

        System.out.println("This department is: " + islesMap.get((byte) 5));

        // containsKey(Object key) -> returns true if the map contains specified key
        boolean hasKeyFour = islesMap.containsKey((byte) 4);
        System.out.println("Does this map contain key 4? " + hasKeyFour);

        boolean hasKeyEight = islesMap.containsKey((byte) 8);
        System.out.println("Does this map contain key 8? " + hasKeyEight);

        boolean hasKeyTen = islesMap.containsKey((byte) 10);
        System.out.println("Does this map contain key 10? " + hasKeyTen);

    }
}
