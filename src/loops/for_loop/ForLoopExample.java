package loops.for_loop;

import java.util.Scanner;

public class ForLoopExample {

    /* Write a method to: public static int findNumOfAppears(String str, char c) {}
    * Find number of times the given character appears in the given string
    * */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a sentence or word:");
        String wordOrSentence = scan.nextLine();
        System.out.println("Please enter a character to be looked for:");

        char target = scan
                .nextLine()
                .toLowerCase()
                .charAt(0);

        System.out.println("The number if time it appears: " + findNumOfTimesCharFromString(wordOrSentence.toLowerCase(), target));
    }

    public static int findNumOfTimesCharFromString(String str, char c) {

        int numberOfTimes = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                numberOfTimes++;
            }
        }
        return numberOfTimes;
    }
}
