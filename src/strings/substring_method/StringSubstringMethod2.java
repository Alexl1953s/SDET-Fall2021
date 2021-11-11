package strings.substring_method;

public class StringSubstringMethod2 {

    // public String substring(int index1, int index2)
    // returns a partial string from given string starting at index1 inclusive
    // to stopping at index2 exclusive

    public static void main(String[] args) {

        String subs1 = "Devx".substring(0, 2);
        System.out.println(subs1);
        // subs1 string will result in "De" of "Devx" because it starts from
        // index 0 to index 2 but index 2 will be excluded.

        String subs2 = "Stanford".substring(2,5);
        System.out.println(subs2);
        // substring starts with char at index 2 'a' all the way to
        // index 5 but stops at index 4 -> "anf" from "Stanford"
    }
}
