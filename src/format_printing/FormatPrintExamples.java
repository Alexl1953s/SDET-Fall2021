package format_printing;

import java.util.Calendar;

public class FormatPrintExamples {

    // Formatting Numeric Print Output - is a way we can control the format of our output print
    // especially useful to print out Calendar date and time, double and floating number so that
    // we can format the number of digits that can be printed after the decimal point

    // Format specifiers are special characters that start with a percent sign [%] and followed by a
    // letter are used to specify the output format and the data type
    // of the varargs. Varargs are the arguments that we pass as a variable to be printed

    // %d -> integer
    // %s -> string
    // %f -> float and double
    // %n -> new line

    public static void main(String[] args) {

        int numberOfMonthsInAYear = 12;
        // formatting method
        System.out.format("Number of months in a year is %d as an int %n", numberOfMonthsInAYear+1);
        //regular print out
        System.out.println("Number of months in a year is " + numberOfMonthsInAYear + " as a String");

        String schoolName = "Devx";
        System.out.printf("The name of the school is %S\n", schoolName);

        double PI = 3.14149265359;
        System.out.println("The value of PI is " + PI + " <- println()");
        System.out.format("The value of PI is %.3f <- format() %n", PI);

        Calendar cal = Calendar.getInstance();
        System.out.format("%tB %te, %tY", cal, cal, cal); // November 01, 2021
    }
}
