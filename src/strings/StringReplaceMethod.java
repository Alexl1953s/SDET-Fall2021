package strings;

public class StringReplaceMethod {

    // public String replace(String s1, String s2) or replace(char c1, char c2)
    // returns a string by replacing all occurrences of
    // the first parameter with the second parameter from given string

    public static void main(String[] args) {

        String str = "feeksforfeeks";
        System.out.println(str);
        System.out.println(str.replace('f', 'g'));

        String str2 = str.replace("feeks", "geeks");
        System.out.println(str2);
    }
}
