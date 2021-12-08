package collections.set;

import java.util.*;

public class RemoveAndAddElementToSet {

    public static void main(String[] args) {

        ArrayList<String> listOfCities = new
                ArrayList<>(Arrays.asList("Chicago", "LA", "SF", "NY", "Boston", "Dallas"));

        System.out.println("Cities in list: " + listOfCities);


        // LinkedHashSet implementation of Set interface
        // stores the elements in insertion order [the order they were inserted]
        Set<String> linkedSetOfCities = new LinkedHashSet<>(listOfCities);
        System.out.println("Cities in LinkedHashSet: " + listOfCities);

        // HashSet implementation of Set interface stores
        // elements without any order
        Set<String> hasSetOfCities = new HashSet<>(listOfCities);
        System.out.println("Cities in HashSet: " + hasSetOfCities);

        // TreeSet implementation of set interface stores
        // elements in natural order
        Set<String> treeSetOfCities = new TreeSet<>(listOfCities);
        System.out.println("Cities in TreeSet: " + treeSetOfCities);

        List<Integer> numbers = List.of(10, 99, 67, 44, 55, 78, 78, 44);
        System.out.println("Given numbers unordered: " + numbers);
        Set<Integer> setNumbers = new TreeSet<>(numbers);
        System.out.println("Numbers in Tree Set: " + setNumbers);


    }
}
