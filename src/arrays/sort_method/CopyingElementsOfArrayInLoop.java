package arrays.sort_method;

import java.util.Arrays;

public class CopyingElementsOfArrayInLoop {

    public static void main(String[] args) {

        int[] numbers = {8, 4, 3, 9, 7};
        System.out.println("Numbers: " + Arrays.toString(numbers));

        int[] number2 = new int[numbers.length]; //[0, 0, 0, 0, 0] -> [8, 4, 3, 9, 7]
        System.out.println("Number2: " + Arrays.toString(number2));

        for (int i = 0; i < numbers.length; i++) {

            number2[i] = numbers[i];
        }

        System.out.println("After copying numbers to number2: " + Arrays.toString(number2));

        numbers[0] = 10;
        numbers[3] = 48;

        System.out.println("Numbers after changing: " + Arrays.toString(numbers));
        System.out.println("Number2 after changing: " + Arrays.toString(number2));
    }
}
