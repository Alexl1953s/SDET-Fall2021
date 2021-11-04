package methods;

import java.util.Scanner;

public class MethodsExWithUserInput {

    public static void printAddress(int unitNumber, String street, String city, String state, int zip){
        System.out.println("The address: "
                + unitNumber
                + " " + street
                + ", " + city
                + ", " + state
                + " " + zip);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the unit number: ");
        int unitNum = input.nextInt();
        input.nextLine(); /* That's because the Scanner.nextInt method does not read the newline character
        in your input created by hitting "Enter," and so the call to Scanner.
        nextLine returns after reading that newline.
        */

        System.out.println("Please enter the street name: ");
        String streetName = input.nextLine();

        System.out.println("Please enter the city: ");
        String cityName = input.nextLine();

        System.out.println("Please enter the city: ");
        String stateName = input.nextLine();

        System.out.println("Please enter the zip: ");
        int zipCode = input.nextInt();

        printAddress(unitNum, streetName, cityName, stateName, zipCode);
    }
}
