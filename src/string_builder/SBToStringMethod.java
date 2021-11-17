package string_builder;

public class SBToStringMethod {

    /*
     String toString()
     returns a String byb converting StringBuilder to String.
     */

    public static void main(String[] args) {

        String studentName = "Alex";

        // 1. StringBuilder sb = new StringBuilder(); -> default capacity 16
        // 2. StringBuilder sb1 = new StringBuilder("Any String");
        // 3. sb.append("Any String")
        // 4. StringBuilder sb2 = new StringBuilder(32);

        StringBuilder sb = new StringBuilder(studentName);
        String name = sb.toString();
        System.out.println(name);
    }
}
