package user_input;
import java.util.Scanner;

public class ShoppingSitePractice {

    public static void main(String[] args) {

        // I want to get the gender of a shopper as a char input and provide
        // our clothing collections accordingly

        // There will be 2 string objects
        // First string will contain the collection for men
        // and second object will contain women's collection

        System.out.println("Welcome to our shopping web site. Please enter your gender" +
                " for better shopping experience: [M for men and F for female");
        Scanner scan = new Scanner(System.in);
        char gender = scan.next().charAt(0);

        // create 2 strings for different genders
        String mensCollection = "1. Jackets\n" +
                "2. Coats\n" +
                "3. Classic outfit\n" +
                "4. Jeans etc.";

        String womensCollection = "1. Cashmere Jackets\n" +
                "2. Womens Coats\n" +
                "3. Daily outfit\n" +
                "4. Scarves etc.";

        boolean bool = gender == 'W' || gender == 'w' || gender == 'F' ||
                gender == 'f';
        System.out.println("The value of bool is: " + bool);
        System.out.println("Here is our collections for you: \n" +
                ( bool ? womensCollection : mensCollection));
    }
}
