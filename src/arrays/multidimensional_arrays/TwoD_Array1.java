package arrays.multidimensional_arrays;

public class TwoD_Array1 {

    /*
     * Arrays can be nested which means that we can store other arrays inside the arrays
     * */

    public static void main(String[] args) {

        int[] evenNumbers = {2, 4, 6, 8, 10, 24, 96, 1048};

        // to print element at certain index we just need to call the array name
        // and add [] to the end of it by passing index into [] -> arrayName[index]

        System.out.println("Number 8 is stored in index 3: " + evenNumbers[3]);

        // for 2 dimensional arrays we need to provide pair of square brackets
        // after the data type of the name of array

        int[][] oddNumbers = { {1, 3, 5}, {7, 9, 11} }; // int[2][3]

        // to access the elements of multi dimensional arrays
        // we need to first provide the index of nested array itself and then provide the
        // index of an element inside that nested array

        System.out.println("The length of oddNumbers array is: " + oddNumbers.length);

        System.out.println(oddNumbers[0][0]); // it will print 1
        System.out.println(oddNumbers[0][1]); // prints 3
        System.out.println(oddNumbers[0][2]); // prints 5

        System.out.println(oddNumbers[1][0]); // prints 7
        System.out.println(oddNumbers[1][1]); // prints 9
//        System.out.println(oddNumbers[oddNumbers.length-1][oddNumbers[oddNumbers.length-1].length-1]);
        System.out.println(oddNumbers[1][2]); // prints 11
    }
}
