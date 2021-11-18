package loops.while_loop;

public class StringCharsPrintReversed {

    public static void main(String[] args) {

        printCharsReversed("Devx"); //xveD
    }

    static void printCharsReversed (String str) {

        int i = str.length()-1; // initializing a variable i to the index of the last char of str
        // it is same thing as if we initialized it to 3
//        i = i - 1;
        while (i >= 0) {
            System.out.print(str.charAt(i) + " ");
            i--;
        }

    }
}
