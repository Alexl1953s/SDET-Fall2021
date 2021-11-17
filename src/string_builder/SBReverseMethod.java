package string_builder;

public class SBReverseMethod {

    /*
    StringBuilder reverse()
    returns a reference to the same string builder by reversing the characters
    in it.
     */

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Ciuperca");
        sb.reverse();

        System.out.println("Ciuperca is reversed: " + sb);

        StringBuilder sb1 = new StringBuilder("Maryna Nesterenko");
        System.out.println("Maryna Nesterenko reversed: " + sb1.reverse());

        // given string s = "Mykhailo"
        // write a method to reverse it and return
        String s = "Mykhailo";
        System.out.println("Mykhailo is reversed: " + reverseString(s));
    }

    public static String reverseString(String str) {

        StringBuilder sb = new StringBuilder(str);
        sb.reverse();

        return sb.toString();

    }
}
