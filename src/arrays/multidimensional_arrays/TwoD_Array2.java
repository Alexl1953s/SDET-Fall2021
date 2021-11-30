package arrays.multidimensional_arrays;

import java.util.Arrays;

public class TwoD_Array2 {

    public static void main(String[] args) {

        String[][] carModels = new String[3][4]; // { { x, x, x, x}, { y, y, y, y}, { z, z, z, z} }

        carModels[0][0] = "Accord";
        carModels[0][1] = "Civic";
        carModels[0][2] = "Odyssey";
        carModels[0][3] = "Pilot";

        carModels[1][0] = "Suburban";
        carModels[1][1] = "Silverado";
        carModels[1][2] = "Camaro";
        carModels[1][3] = "Impala";

        carModels[2][0] = "Fiesta";
        carModels[2][1] = "Mustang";
        carModels[2][2] = "F150";
        carModels[2][3] = "Raptor";

        System.out.println(Arrays.toString(carModels[0]));
        System.out.println(Arrays.toString(carModels[1]));
        System.out.println(Arrays.toString(carModels[2]));
        System.out.println("===========================================");

        for (int i = 0; i <= carModels.length; i++) {

            for (int j = 0; j < carModels.length; j++) {

                System.out.print(carModels[j][i] + ",");
            }
            System.out.println();
        }
    }
}
