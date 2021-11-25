package arrays;

import java.util.Arrays;

public class ArraysWithStringsUseNestedLoop {

    public static void main(String... args) {

//        System.out.println("The size of args array in main method: " + args.length);
//        args = new String[2];
//        args[0] = "Maryna";
//        args[1] = "Mansur";
//        System.out.println(Arrays.toString(args));
//        System.out.println("The size of args array in main method: " + args.length);

        String[] cities = {"Chicago", "Seattle", "San Francisco", "New York", "Austin", "New Zealand"};

        int[] indicesOfCharA = new int[cities.length];

        int indexOfA;

        for (int i = 0; i < cities.length; i++) {

             indexOfA = cities[i].toLowerCase().indexOf('a');
             indicesOfCharA[i] = indexOfA;

        }

        System.out.println(Arrays.toString(cities));
        System.out.println(Arrays.toString(indicesOfCharA));
    }
}
