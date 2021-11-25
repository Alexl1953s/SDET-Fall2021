package arrays;

import java.util.*;

public class ArraysWithForEachLoop {

    public static void main(String[] args) {

        int[] numbers = new int[5];
        numbers[0] = 5;
        numbers[1] = 5;
        numbers[2] = 4;
        numbers[3] = 5;
        numbers[4] = 7;

        // for each loop or enhanced for loop
        // for (dataType varName : array) {}
        for (int anyVariable : numbers) {
            System.out.println(anyVariable);
        }
        
        int sum = 0;
        
        for (int currentNumber : numbers) {
            sum = sum + currentNumber;
        }
        System.out.println("The sum of numbers in " + Arrays.toString(numbers) + " is " + sum);

        int number = 7;
        int modulus = number % 2;
        System.out.println("The remainder is: " + modulus);
        // below task is to sum the elements at even indices
        int sumWithRegForLoop = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (i % 2 == 0) { // we are checking if the index is even or not
                sumWithRegForLoop += numbers[i];
            }
        }

        System.out.println("The sum of elements at even indices: " + sumWithRegForLoop);
    }
}
