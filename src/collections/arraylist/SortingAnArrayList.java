package collections.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingAnArrayList {

    public static void main(String[] args) {

        List<String> citiesList = Arrays.asList("Chicago", "Los Angeles", "San Francisco", "San Diego", "Buffalo", "Denver");

        System.out.println(citiesList);

        // sort() method is a static method in Collections class
        // and only works with collections that are in Collections framework
        // it sorts the elements of a collection in ascending order
        Collections.sort(citiesList);
        System.out.println("After sorting: " + citiesList);

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(56, 67, 34, 23, 65, 48, 99, 12));

        System.out.println("Before sorting: " + numbers);

//        int maxNum = Collections.max(numbers);
//        System.out.println("The max num is: " + maxNum);
//
//        int minNum = Collections.min(numbers);
//        System.out.println("The min num is: " + minNum);

        Collections.sort(numbers);
        System.out.println("After sorting numbers: " + numbers);

        int[] arr = {3, 4, 52, 3, 5, 4, 8, 98, 103, 32, -78, -199, 7};

//        int max = arr[0];
//        for (int i : arr) {
//
//            if (i > max) {
//                max = i;
//            }
//        }

        Arrays.sort(arr);
        int max = arr[arr.length - 1];
        System.out.println("The max in array is: " + max);

        System.out.println("The smallest element is: " + arr[0]);

        System.out.println("The 3 biggest elements: " + arr[arr.length-1] + ", " + arr[arr.length-2]
                                    + ", " + arr[arr.length-3]);

        List<Integer> numberList = new ArrayList<>();

        for (int i : arr) {
            numberList.add(i);
        }

    }
}
