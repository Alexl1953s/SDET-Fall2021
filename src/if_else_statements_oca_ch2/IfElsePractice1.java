package if_else_statements_oca_ch2;

import java.util.Scanner;

public class IfElsePractice1 {

    public static void main(String [] args) {

        // get an input form user if it's raining or not
        // get an input from the user about the weather temp outside
        // - check if it's raining outside
        // - if raining then check the temperature,
        // and temperature is below 30 F then stay inside.
        // is it in the range of 30 to 50 F -> wear
        // coat and if 50 to 70F -> wear rain jacket, of if above 70F then -> wear light clothes.
        // - if not raining then just print out "Enjoy the weather!"

        Scanner scan = new Scanner(System.in); // we instantiated a Scanner class to get input from user

        String stayInside = "Stay inside.";
        String coat = "Put on a coat!";
        String rainJacket = "Put on a rain jacket!";
        String lightClothes = "Put on a light clothing!";

        System.out.println("Is it raining outside?");
        boolean isRaining = scan.nextBoolean(); // expecting a boolean input from user

        System.out.println("What is the temp outside?");
        byte temp = scan.nextByte(); // expecting a byte input from user

        if (isRaining && temp <= 30) {
            System.out.println(stayInside);
        } else if (isRaining && temp > 30 && temp <= 50) {
            System.out.println(coat);
        } else if (isRaining && temp >= 51 && temp <= 70) {
            System.out.println(rainJacket);
        } else if (isRaining && temp >= 71) {
            System.out.println(lightClothes);
        } else {
            System.out.println("Enjoy the weather!");
        }
    }
}
