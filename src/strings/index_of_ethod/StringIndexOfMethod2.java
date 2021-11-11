package strings.index_of_ethod;

public class StringIndexOfMethod2 {

    // public int indexOf (String str, int index)
    // returns the index of a first occurrence of specific string from given
    // string starting from specified index

    public static void main(String[] args) {

        int indexOfFirstE = "Daniel Sellers".indexOf('e');
        System.out.println("The index of first 'e' is: " + indexOfFirstE);

        int indexOfSecondE = "Daniel Sellers".indexOf("e", 5);
        System.out.println("The index of second 'e' is: " + indexOfSecondE);

        int indexOfThirdE = "Daniel Sellers".indexOf("e", indexOfSecondE + 1);
        System.out.println("The index of third 'e' is: " + indexOfThirdE);

        String name = "Daniel Sellers";
        int indexOdWhiteSpace = name.indexOf(" ");
        System.out.println("The index of white space is: " + indexOdWhiteSpace);
    }
}
