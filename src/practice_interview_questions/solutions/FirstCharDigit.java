package practice_interview_questions.solutions;

import java.util.Scanner;

public class FirstCharDigit {

    public static void main(String[] args) {

        // take input as a string from user
        // and check the first character and identify if it's a digit or not
        // if it's a digit print out "The first char is a digit"
        // if not then "It's not a digit"

        // Ex: "23 Oak blvd, Miami, FL"

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter a text: ");
        String text = keyboard.nextLine();

        char firstChar = text.charAt(0);
        System.out.println("The first char is: " + firstChar);

//        if(firstChar == '0'
//                || firstChar == '1'
//                || firstChar == '2'
//                || firstChar == '3'
//                || firstChar == '4'
//                || firstChar == '5'
//                || firstChar == '6'
//                || firstChar == '7'
//                || firstChar == '8'
//                || firstChar == '9'
//        ) System.out.println("First character is a digit!");
//        else System.out.println("It's not a digit!");

//====================================================================================================

        if(firstChar >= '0' && firstChar <= '9') System.out.println("First character is a digit!");
        else System.out.println("It's not a digit!");

// ====================================================================================================

        if( firstChar >= 48 && firstChar <= 57) System.out.println("First character is a digit!");
        else System.out.println("It's not a digit!");

    }
}
