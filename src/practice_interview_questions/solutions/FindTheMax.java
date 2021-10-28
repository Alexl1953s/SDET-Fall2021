package practice_interview_questions.solutions;

import java.util.Scanner;

public class FindTheMax {

    public static void main(String[] args) {

        /*
        1. Get 3 int inputs from the user
        2. Given 3 integers find the max
        */

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a number for 'a': ");
        int a = scan.nextInt();
        System.out.println("Please enter a number for 'b': ");
        int b = scan.nextInt();
        System.out.println("Please enter a number for 'c': ");
        int c = scan.nextInt();

        int max = 0;

        if (a > b && a > c) {
            max = a;
        } else if (b > a && b > c) {
            max = b;
        } else if (c > b && c > a) {
            max = c;
        } else if (a == b && a > c) {
            max = a;
        } else if (c == b && c > a) {
            max = b;
        } else if (a == c && a > b) {
            max = c;
        } else System.out.println("They are equal");

        if (max > 0){
            System.out.println("The max is: " + max);
        }
    }
}
