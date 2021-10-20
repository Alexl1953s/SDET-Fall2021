package user_input;

import java.util.Scanner;

public class JobQualificationApp {

    public static void main(String[] args) {

        /*
        1. We want to get full name -> String
        2. Age -> short
        3. Years of experience -> byte
        4. Eligible to work -> boolean
        5. Expected compensation -> double
         */

        System.out.println("Hi! Welcome to ZIP recruiter. Please fill in the required fields: ");

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your full name: ");
        String name = input.nextLine(); //nextLine() because it can scan the entire line with white spaces

        System.out.println("Please enter your age: ");
        short age = input.nextShort();

        System.out.println("Enter the number years you have been in IT: ");
        byte yearsOfExperience = input.nextByte();

        System.out.println("Are you eligible to work? [Enter 'y' for yes or 'n' for no");
        char workEligibility = input.next().charAt(0); // because the index of the first char in the text always starts from 0 [zero]
        boolean isEligible = workEligibility == 'y';

        System.out.println("What is your expected annual compensation? ");
        double compensation = input.nextDouble();

        System.out.println("Candidate info: \n"
                + "Fullname: " + name + "\n"
                + "Age: " + age + "\n"
                + "Years of experience: " + yearsOfExperience + "\n"
                + "Eligibility to work: " + (isEligible ? "Yes" : "No") + "\n"
                + "Expected annual compensation: " + compensation + "\n");

        // 1. If the candidate is eligible to work
        // 2. Expected salary is less than or equal to 140_000
        // 3. Number of years of experience is greater than or equal to 5
        // 4. Age older than or equal to 21
        // Task is to qualify a candidate fpr a position if they meet all the above requirements
        // Expected output: The candidate is qualified.
        // If they don't meet the req-s then "The candidate is not qualified."

        boolean isQualified = isEligible
                && compensation <= 140_000
                && yearsOfExperience >= 5
                && age >= 21;

        System.out.println(isQualified ? "The candidate is qualified." : "The candidate is not qualified. ");

    }
}
