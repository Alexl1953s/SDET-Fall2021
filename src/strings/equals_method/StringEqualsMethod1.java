package strings.equals_method;

public class StringEqualsMethod1 {

    // public boolean equals(String str)
    // returns true if 2 strings have the same value
    // vs. '==' checks if 2 strings are pointing to the same object

    public static void main(String[] args) {

        String s1 = new String("New");
        String s2 = s1;

        s1 = "New1";
        s2 = new String("New1");

        System.out.println(s1.equals(s2)); // true -> if they have the same value

        System.out.println(s1 == s2); // false -> if they are pointing to the same object
    }
}
