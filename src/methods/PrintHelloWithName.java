package methods;

import java.util.Scanner;

public class PrintHelloWithName {

    // methods define the behavior of our classes
    // methods are aka functions in other programming languages

    /*
    An argument - is a value passed to a function when the function is called.
    Whenever any function is called during the execution of the program there
    are some values passed with the function. These values are called arguments.
    An argument when passed with a function replaces with those variables which were
    used during the function definition and the function is then executed with these values.

    A parameter - is a variable used to define a particular value during a function definition.
    Whenever we define a function we introduce our compiler with some variables that are being
    used in the running of that function. These variables are often termed as Parameters.
    The parameters and arguments mostly have the same value but theoretically, are different from each other.
     */

    public static void main(String[] args) {

        // now we call method sayHelloToUser();
        sayHelloToUser();

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your age:");
        int yourAge = scan.nextInt();

        printAge(yourAge); // yourAge is an argument that's being passed as a value
        printAge(98);
        printAge('a'); // ASCII decimal value will be passed as an argument
        // printAge(12345L); will not compile because the expected argument type is integer
    }

    public static void sayHelloToUser() {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = input.nextLine();

        System.out.println("Hello " + name);
    }

    // printAge() method takes a parameter of type int
    public static void printAge(int age) {

        System.out.println("Your age is: " + age);
    }
}
