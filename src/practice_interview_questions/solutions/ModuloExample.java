package practice_interview_questions.solutions;

import java.util.Scanner;

public class ModuloExample {

    public static void main(String[] args) {

        // task is to identify if the number is odd or even

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a number to find out if it's even or odd: ");
        int num = scanner.nextInt();

        int remainder = num % 2;

        if(remainder == 1) System.out.println("Odd number!");
        else System.out.println("Even number!");

        // 1. To find if the number is even just use modulo 2 [EX: number % 2 == 0] means even number
        // 2. To get the last digit of the number use modulo 10 [EX: number % 10]

        System.out.println(2376546 % 10000);
    }
}
