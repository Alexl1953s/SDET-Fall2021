package strings;

import java.util.Scanner;

public class StringToUpperCaseMethod {

    // public String toUpperCase()
    // returns a string by converting each character in it to upper case

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a word to be converted to uppercase:");
        String input = scan.nextLine();
        System.out.println(input.toUpperCase());

        int indexOfChar = lookForChar('a', input);
        System.out.println(indexOfChar);
    }

    static int lookForChar (char c, String str) {

        if (c == str.charAt(str.length()-1)) {
            System.out.println("THIS IS THE LAST CHAR");
            return 100;
        } else if (str.indexOf(c) == -1) {
            System.err.println("Not found");
            return 999;
        }
        return str.indexOf(c);
    }
}
