package arrays;

import java.util.Arrays;

public class ArraysWithInts {

    public static void main(String[] args) {

        // the default value of integer elements is 0

        int[] numbers = new int[5];

        numbers[0] = 5;
        numbers[1] = 7;
        numbers[2] = 9;

        System.out.println(Arrays.toString(numbers)); // to print out the array
        // as a string we need to use toString() method of Arrays class

        int sum = numbers[0] + numbers[2];
        System.out.println("The sum of elements at index 0 and index 2 is: " + sum);

        // updating the element at index 2 would be performed as below
        numbers[2] = sum;
        System.out.println("The new value of index 2 is: " + numbers[2]);
    }
}
