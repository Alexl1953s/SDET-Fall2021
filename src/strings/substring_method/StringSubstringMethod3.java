package strings.substring_method;

public class StringSubstringMethod3 {

    public static void main(String[] args) {

        String name = "Elon Musk";
        System.out.println(name.substring(2));
        System.out.println(name);
        // since strings are immutable whatever the methods we use
        // won't change the string object

        name = name.substring(5);
        System.out.println(name);
    }
}
