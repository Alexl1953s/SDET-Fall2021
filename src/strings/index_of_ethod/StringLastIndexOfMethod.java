package strings.index_of_ethod;

public class StringLastIndexOfMethod {

    // public int lastIndexOf(String str)
    // returns the index of a specific string from given string starting from the END

    public static void main(String[] args) {

        String name = "Daniel Sellers";

        System.out.println("The last occurrence of \"el\" is at index: " + name.lastIndexOf("el"));

        System.out.println("The first occurrence of \"el\" is at index: " + name.indexOf("el"));

    }
}
