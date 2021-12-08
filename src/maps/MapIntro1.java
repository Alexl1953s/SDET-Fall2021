package maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MapIntro1 {

    /**
     * Map is an Interface that's part of Java Collections Framework
     * Map stores Objects in Key, Value pair aka entry
     *
     * Map interface has 3 implementations:
     * - Hashmap<K,V> -> without any orders of the keys allows one null key
     * - LinkedHashMap<K,V> -> orders elements in inserted order of the entries, allows one null key
     * - TreeMap<K,V> -> orders it's elements in natural order of the keys, does not allow null key
     */

    public static void main(String[] args) {

        String ssnElena = "011-10-1011";
        String nameElena = "Elena Sova";

        ArrayList<String> infoElena = new ArrayList<>();
        infoElena.add(ssnElena);
        infoElena.add(nameElena);

        int indexOfSSN = infoElena.indexOf("011-10-1011");
        System.out.println("Here is the name associated with this SSN: " + infoElena.get(indexOfSSN+1));

        // created an object of map with String for key type and String for value type
        Map<String, String> map = new HashMap<String, String>();

        // put() method is used for adding, inserting elements [entries, or key-value pairs] into a map collection
        // it is similar to add() method from collections
        map.put("012-12-1221", "Karishma Chintala");

        // get(Object key) method returns the value associated for the key
        String name = map.get("012-12-1221");
        System.out.println("The name associated with key is: " + name);

        map.put("012-12-1256", "Karishma Chintala");
        map.put("010-00-0934", "Karishma Chintala");

        System.out.println(map);

        // when we use put() method with the existing key
        // then we will just update the value associated that key
        map.put("012-12-1221", "Elmaz Safina");

        System.out.println(map);
    }
}
