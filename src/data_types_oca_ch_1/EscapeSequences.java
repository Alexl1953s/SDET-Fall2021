package data_types_oca_ch_1;

public class EscapeSequences {

    public static void main(String[] args) {

        String welcome = "Welcome to Google.";
        String ourHqrs = "This is the \"headquarters\" of our company!"; // escape sequence for inserting
        // double quotes within a text [string]

        System.out.println(welcome);
        System.out.println(ourHqrs);

        // inserting a new line within a String by using \n escape sequence
        String welcomeToHqrs = "Welcome to Google. \nThis is the \"headquarters\" of our company!";

        System.out.println(welcomeToHqrs);

        // to insert a tab in the text we can use \t escape sequence
        System.out.println("\tHello all, please meet Sundar Pichai.");
    }
}
