package loops.while_loop;

import java.util.Scanner;

public class ReverseStringWithWhileLoop {

    /*
    Create a method which will take a string as a parameter
    and returns the characters reversed in a string.
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a word or sentence to be reversed:");
        String userInput = scan.nextLine();

//        String reversedString = reverseString(s).toString();
//        System.out.println(reversedString);

        System.out.println(reverseString(userInput));

    }

    static StringBuilder reverseString (String str) {

        StringBuilder sb = new StringBuilder();

        int index = str.length()-1; // to point to the last element index

        while (index >= 0) {

            sb.append(str.charAt(index)); // we are appending [concatenating] the char at index i from the given string
            index--;

        }

        return sb;
    }
}
