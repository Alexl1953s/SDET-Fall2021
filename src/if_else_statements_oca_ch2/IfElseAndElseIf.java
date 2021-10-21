package if_else_statements_oca_ch2;

import java.util.Scanner;

public class IfElseAndElseIf {

    public static void main(String[] args) {

        // if can be used without statement because is optional
        // but statement cannot be used without if

//        {
//            System.out.println("hsbfsb");
//        }
        // this will throw a compile error because is without if statement

        // if and also if
        // if is a control flow after if statement

//        if {
//            System.out.println("Something");
//        }
        // this will not compile because if is without if statement

        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter your age:\t");
        short age = scan.nextShort();

        // If statements are independent of one another unless they are
        // nested inside other if statements

        if (age >= 80) {
            System.out.println("You are in your 80s.");
        } else if (age >= 70) {
            System.out.println("You are in your 70s.");
        } else if (age >= 60) {
            System.out.println("You are in your 60s.");
        } else if (age >= 50) {
            System.out.println("You are in your 50s.");
        } else if (age >= 40) {
            System.out.println("You are in your 40s.");
        } else if (age >= 30) {
            System.out.println("You are in your 30s.");
        } else System.out.println("You are 4ever young.");
    }
}
