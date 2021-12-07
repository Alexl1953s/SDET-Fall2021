package collections.set;

import java.util.*;

public class SetInterfaceMethods {

    /**
     * boolean remove(E e) -> returns true if the element exists and removed and false otherwise
     * boolean contains(E e) -> returns true if the element exists in the collection and false otherwise
     * boolean isEmpty() -> returns true if there is no elements in the collection
     * int size() -> returns the number of elements from given collection
     * void clear() -> removes all elements of a set collection
     */

    public static void main(String[] args) {

        Set<String> ssn = new HashSet<>(
                Arrays.asList(
                "010-00-9956",
                "011-01-0110",
                "012-02-1212",
                "020-20-3232"));

        System.out.println("Initial collection of SSN numbers: " + ssn);

        String mySSN = "011-01-0110";

        System.out.println("Does SSN exist in the collection? " + ssn.contains(mySSN));

        boolean isRemoved = ssn.remove(mySSN);
        System.out.println("Has my ssn been removed from the collection? " + isRemoved);

        System.out.println("After modification collection of SSN numbers: " + ssn);
        System.out.println("Is the set empty before removing elements? " + ssn.isEmpty());

        ssn.clear(); // we are removing all the elements of set
        System.out.println("After removing all elements from SSN set: " + ssn);

        System.out.println("Is the set empty after removing elements? " + ssn.isEmpty());
    }
}
