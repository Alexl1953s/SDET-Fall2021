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

        // here we are checking if user input is one of these chars
        // and if it is then bool variable gets assigned the outcome of this evaluation
        boolean isValidGender = gender == 'F' || gender == 'M';

        String defaultMsg = "Please enter 'M' for male or 'F' for female!";
        // We are checking if isValidGender is true or not, if true then we want to identify if the user is
        // male or female, if 'M' then we want to display mensCollection and if 'F'
        // then we will be displaying womensCollection
        // in the scenario of invalid gender char entered we will be displaying
        // the defaultMsg.
        String displayCollection = isValidGender ? (gender == 'M' ? mensCollection : womensCollection) : defaultMsg;

        System.out.println("Here is our collections for you: \n" + displayCollection);

    }
}
