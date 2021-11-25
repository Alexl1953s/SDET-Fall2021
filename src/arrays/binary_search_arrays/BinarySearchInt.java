package arrays.binary_search_arrays;

import java.util.Arrays;

public class BinarySearchInt {

    // binarySearch() method returns int which indicates the index of the first elements which is searched for
    // and it only works with sorted arrays, if array is not sorted then the output is random.
    // if the element does not exist then it will return the index where it would be located in the array -1

    public static void main(String[] args) {

        int[] ids = {56, 78, 12, 34, 99};
        System.out.println(Arrays.toString(ids));
        System.out.println("Before sorting index of 12 is: " + Arrays.binarySearch(ids, 12));
        System.out.println();

        Arrays.sort(ids);
        System.out.println(Arrays.toString(ids));
        System.out.println("After sorting index of 12 is: " + Arrays.binarySearch(ids, 12));
    }
}
