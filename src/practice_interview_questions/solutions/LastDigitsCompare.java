package practice_interview_questions.solutions;

import java.util.Scanner;

public class LastDigitsCompare {

    public static void main(String[] args) {

        // write a program that will compare the last digit of 2 numbers
        // and print out "Equal" if they are equal
        // and vice versa should print out "Not equal"

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the first number: ");
        int x = scan.nextInt();

        System.out.println("Please enter the second number: ");
        int y = scan.nextInt();

        // int a = 33654654;
        // int b = 47;
        // Not equal

        // % -> modulo returns the remainder of a number divided by another
        // 12 % 5 -> returns 2 [because 2 * 5 = 10, 12 - 10]
        // 33 % 10 -> 3 * 10 -> 30, 33 - 30 -> 3;

        int remainderOfX = x % 10;
        int remainderOfY = y % 10;

        if(remainderOfX == remainderOfY){ // x % 10 returns the last digit of a number
            System.out.println("Equal");
        }else System.out.println("Not equal");

        int mod = 57 % 10; // this will return the remainder after division
        int div = 57 / 10; // this will return the int after division

        System.out.println("This is remainder: " + mod);
        System.out.println("This is int after division: " + div);
    }
}
