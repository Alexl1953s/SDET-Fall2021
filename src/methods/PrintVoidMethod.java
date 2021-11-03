package methods;

public class PrintVoidMethod {

    /*
    Methods can be anywhere outside of the main() method
    but they have to be in the scope of the class
     */

    public static void main(String[] args) {

        // System.out.println("Hello World!");

        // to call the methods simply type the name of the method if it's static
        // and put parentheses at the end and put semi colon

        printHello(); // method call



    }

    // static optional specifier makes this method accessible from other methods
    // by just calling it's name
    // printHello() method is public and it does not return anything
    // because the return type is void

    public static void printHello() {

        System.out.println("Hello World!");
        System.out.println("This is my first time outside of main() method! Yay!");

    }
}
