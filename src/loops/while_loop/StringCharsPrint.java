package loops.while_loop;

public class StringCharsPrint {
    // we will print out the characters of a given string

    public static void main(String[] args) {

        printCharsOfString("Devx");
    }

    static void printCharsOfString (String str) {
        int i = 0;
        while (i < str.length()) {
            System.out.print(str.charAt(i) + " ");
            i++;
        }
    }
}
