package arrays.multidimensional_arrays;

import java.util.Arrays;

public class JaggedArraysWithStrings {

    public static void main(String[] args) {

//        int[] arr = new int[3];
//        System.out.println(Arrays.toString(arr));
//
//        double[] arr1 = new double[3];
//        System.out.println(Arrays.toString(arr1));
//
//        Object[] arr2 = new Object[4];
//        System.out.println(Arrays.toString(arr2));
//
//        String[] str = new String[2];
//        System.out.println(Arrays.toString(str));
//
//        boolean[] bool = new boolean[2];
//        System.out.println(Arrays.toString(bool));
//
//        int[][] nums = new int[5][];
//        System.out.println(Arrays.toString(nums));

        // we can create jagged arrays by providing elements at creation

        String[][] computers = {
                {"Hp", "Lenovo", "Toshiba"},
                {"MacPro", "MacAir"},
                {"IBM", "Dell", "Asus", "Samsung", "Acer"}
        };

        for (int i = 0; i < computers.length; i++) {

            for (int j = 0; j < computers[i].length; j++) {

                System.out.println(computers[i][j]);

            }

        }

    }
}
