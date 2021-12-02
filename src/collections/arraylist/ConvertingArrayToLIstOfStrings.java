package collections.arraylist;


import java.util.Arrays;
import java.util.List;

public class ConvertingArrayToLIstOfStrings {

    public static void main(String[] args) {

        String[] animalsArray = {"Lion", "Wolf", "Penguin", "Polar bear", "Dolphin"};
        System.out.println("Original array: " + Arrays.toString(animalsArray));

        List<String> animalsList = Arrays.asList(animalsArray);
        // Returns a fixed-size list backed by the specified array. Changes made to
        // the array will be visible in the returned list, and changes made to the
        // list will be visible in the array.
        System.out.println("Animal List: " + animalsList);

        animalsList.set(3, "White sharks");

        System.out.println("After change array: " + Arrays.toString(animalsArray));
        System.out.println("After change arrayList: " + animalsList);

        animalsArray[animalsArray.length-1] = "Blue Whale";

        System.out.println("After change to Blue whale in array: " + Arrays.toString(animalsArray));
        System.out.println("After change arrayList: " + animalsList);
    }
}
