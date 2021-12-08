package collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetCollectionIntro {

    /*
    - Set is an interface that extends Collection interface
    - Set has 3 implementations: HashSet, LinkedHashSet, TreeSet
    - Collection that stores only unique elements without duplicates
    - Elements are unordered and not index based
     */

    public static void main(String[] args) {

        // HashSet is the widely used Set type which does not have any orders
        Set<String> carMakers = new HashSet<>();

        boolean isAdded = carMakers.add("Honda");
        boolean hasHonda = carMakers.add("Honda"); // Set collection stores only unique elements
        // therefore only the first "Honda" String object will be stored

        System.out.println("Was Honda added already? " + isAdded);
        System.out.println("Was Honda added already? " + hasHonda);
        System.out.println(carMakers);

        carMakers.add("Ford");
        carMakers.add("Cadillac");
        carMakers.add("Chevrolet");

        System.out.println(carMakers);

    }
}
