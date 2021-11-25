package arrays.sort_method;

import java.util.Arrays;

public class ArrayCopy {

    // since Arrays are mutable, it is better to use Arrays.copyOf() method
    // to make a copy of an array, that way when an element is updated
    // on one of them the other one will not get affected.

    public static void main(String[] args) {

        int[] nums = {3,2,4,7,8};
        int[] numsCopy = nums;

        System.out.println("Before change: " + Arrays.toString(nums));
        System.out.println("Before change: " + Arrays.toString(numsCopy));

        nums[1] = 9;
        System.out.println("Before change nums: " + Arrays.toString(nums));
        System.out.println("Before change numsCopy: " + Arrays.toString(numsCopy));

        numsCopy[3] = 25;
        System.out.println("Before change nums: " + Arrays.toString(nums));
        System.out.println("Before change numsCopy: " + Arrays.toString(numsCopy));

        int[] temps = {65, 73, 48, 92};
        int[] tempsCopy = new int[temps.length];

        System.out.println(Arrays.toString(temps));
        System.out.println(Arrays.toString(tempsCopy));

        tempsCopy = Arrays.copyOf(temps, temps.length);
        System.out.println("After copying temps to tempCopy: " + Arrays.toString(tempsCopy));
        System.out.println();

        temps[3] = 56;
        System.out.println("After changing temp: " + Arrays.toString(temps));
        System.out.println("After changing temp our tempCopy: " + Arrays.toString(tempsCopy));
        System.out.println();

        tempsCopy[2] = 104;
        System.out.println("After changing tempCopy our temp: " + Arrays.toString(temps));
        System.out.println("After changing tempCopy: " + Arrays.toString(tempsCopy));
    }
}
