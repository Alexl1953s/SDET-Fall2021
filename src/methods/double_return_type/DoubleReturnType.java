package methods.double_return_type;

import java.util.Scanner;

public class DoubleReturnType {

    /*
    1. get input from user for their salary
    2. ask if married or not
    3. create a method that calculates the tax and return the tax amount they should pay
        - if married -> salary * 5/100;
        - if single -> salary * 30/100;
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // input is an instance of [aka object, reference variable] Scanner class
        System.out.println("Enter your annual salary: ");
        double salary = input.nextDouble();
        System.out.println("Are you married? ");
        boolean isMarried = input.nextBoolean();

        new DoubleReturnType().calculateTax(salary, isMarried);

    }

    public double calculateTax (double s, boolean isMarried) {

        double taxAmountToPay;

        if (isMarried) {
            taxAmountToPay = s * 5 / 100;
        } else {
            taxAmountToPay = s * 30 / 100;
        }
        System.out.println("The amount you should pay is: " + taxAmountToPay);
        return taxAmountToPay;
    }
}
