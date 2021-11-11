package practice_interview_questions.solutions;

import java.util.Scanner;

public class MethodReturnsLengthOfString {

    // 1. write a method that takes and input from the user as
    // a string and returns the value returned from the second method which is string
    // 2. write a method that returns the length of the user input when called from first method

    public static void main(String[] args) {

//        String finalOutput = ("The length is: " + new MethodReturnsLengthOfString()
//                .returnLength(new MethodReturnsLengthOfString().takeUserInput()));

        MethodReturnsLengthOfString myObj = new MethodReturnsLengthOfString();
        String inputFromUser = myObj.takeUserInput();

        int lengthOfInput = myObj.returnLength(inputFromUser);
        System.out.println(lengthOfInput);

    }

    String takeUserInput () {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a anything: ");
        // we have created String variable that points to user's input from scanner
        String userInput = scan.nextLine();

        return userInput;
    }

    public int returnLength (String str) {
        int lenStr = str.length(); // str.length() counts the number of characters in str and returns it.

        return lenStr;
    }
}
