package strings.substring_method;

public class StringSubstringMethod1 {

    // public String substring(int index) -> returns part of the string starting and including character from
    // index to the end of the string variable

    public static void main(String[] args) {

        String substring1 = "Devx".substring(1);
        System.out.println(substring1);
        // substring1 will return substring starting from index 1 to the end of "Devx"
        // char at index 1 is 'e' so the result will be "evx"

        String substring2 = "Devx".substring(2);
        System.out.println(substring2);
        // substring2 will return substring starting from index 2 'v' all the way to the end
        // of "Devx" which will result in "vx"
    }
}
