package string_builder;

public class StringBuilderEx1 {

    // String builder is a sequence of chars just like String but it's mutable
    // we can use the same object to manipulate it's value

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("School");
        System.out.println(sb); // empty

        sb.append("Devx"); // append() is like concat() method from String class
        // it adds string builder to the end of existing string builder
        System.out.println(sb); // Devx

        String str = "School";
        System.out.println(str); // empty

        str.concat("Devx");
        System.out.println(str);
    }
}
