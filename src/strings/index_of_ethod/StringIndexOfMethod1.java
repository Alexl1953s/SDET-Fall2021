package strings.index_of_ethod;

public class StringIndexOfMethod1 {

    // public int indexOf(String str)
    // indexOf() returns the index of a string from a given string
    // it starts from index 0 and looks for the string we are searching for

    public static void main(String[] args) {

        System.out.println("Mansur".indexOf("n"));
        // from given string "Mansur" the index of "n" is 2

        int indexOfN = "Mansur".indexOf("n");
        System.out.println("The index of \"n\" is: " + indexOfN);
    }
}
