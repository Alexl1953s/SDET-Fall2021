package practice_interview_questions.solutions;

public class NumericFormatPrinting {

    public static void main(String[] args) {

        // print string
        System.out.format("Hello my name is %s%n", "Baha");
        System.out.println("Hello my name is " + "Baha");

        // print format float numbers
        System.out.printf("The value of pi is %.1f\n", 3.14467); // format specifier is the combination of special characters
        // to specify the format of the output

        // print integers
        System.out.printf("Year is %d", 2021); // Year is 2021
        System.out.println("\nYear is " + 2021 + 1); // Year is 20211
        System.out.println(2021 + 1 + " year"); // 2022 year
        System.out.println(2021 + "" + 1 + " year"); // 20211 year
    }
}
