package string_builder;

public class StringBuilerWithDiffDataTypes {

    // StringBuilder append() method can take different primitive and non primitive data types
    // as a parameter and convert them to StringBuilder and manipulate them

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("String");

        sb.append('&')
                .append(123) // int
                .append(false) // boolean
                .append(000.67) // float
                .append(true) // boolean
                .append(218468127L); // long

        System.out.println(sb);
    }
}
