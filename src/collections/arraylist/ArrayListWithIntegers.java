package collections.arraylist;

import java.util.ArrayList;

public class ArrayListWithIntegers {

    public static void main(String[] args) {

        // Java 5 has introduced a way of storing primitive types into Arraylist
        // by providing the data type to be a wrapper class

        ArrayList<Integer> testScores = new ArrayList<>();

        testScores.add(96);
        testScores.add(75);
        testScores.add(68);
        testScores.add(90);

        System.out.println(testScores);

        testScores.add(2, testScores.get(2) + 5);
        System.out.println("After adding 5 to element 3: " + testScores);

        // set(index, value) -> Replaces the element at the specified position in this list with
        // the specified element.

        testScores.set(2, 55);
        System.out.println("After updating the value at index 2: " + testScores);

        for (int i = 0; i < testScores.size(); i++) {
            System.out.println(testScores.get(i));
        }

        System.out.println("Below are test scores printed using enhanced for loop: ");

        for (int i : testScores) {
            System.out.println(i);
        }

        System.out.println("Below forEach is used for printing only: ");

        testScores.forEach(System.out::println);
    }
}
