package if_else_statements_oca_ch2;

import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {
        
        // print out the grade depending on the test grade
        // if between 90-100 -> A
        // if between 80-89 -> B
        // if between 70-79 -> C
        // if between 60-69 -> D
        // if between 50-59 -> E
        // if below 50 -> F

        Scanner gradeScan = new Scanner(System.in);

        System.out.print("Please enter your test grade:\t");
        
        int testScore = gradeScan.nextInt();
        char grade = ' ';
        
        if (testScore <= 100 && testScore >= 90) grade = 'A';
        else if (testScore <= 89 && testScore >= 80) grade = 'B';
        else if (testScore <= 79 && testScore >= 70) grade = 'C';
        else if (testScore <= 69 && testScore >= 60) grade = 'D';
        else if (testScore <= 59 && testScore >= 50) grade = 'E';
        else if (testScore < 50 && testScore >= 0) grade = 'F';
        else System.out.println("Grade is invalid. Try again.");

        if (testScore > -1 && testScore < 101) {
            System.out.println("Your test score is: " + testScore);
            System.out.println("Your grade is: " + grade);
        }
    }
}
