package methods.static_methods;

import java.util.Scanner;

public class StaticMethod1 {

    // there are methods called instance methods aka non static methods
    // and these instance methods belong to an object of the class
    // EX: Scanner scan = new Scanner(System.in);
    // scan.next(); scan.nextLine() etc.

    // instance methods can call static methods directly without creating an object

    // non static methods can call other non static methods directly
    // without creating an object of that class
    // within that class only

    public void subtractNumbers(int num1, int num2) {
        addTwoNumbers(3,4);
        System.out.println("Num2 - num2 is: " + (num2 - num1));
    }

    // static methods belong to the class
    // and that enables us to call those static methods
    // form other classes without creating an object of that class

    public static void main(String[] args) {

        addTwoNumbers(1,2);
        StaticMethod1.addTwoNumbers(3,4); // I can call the static methods by class without object

        StaticMethod1 myObj = new StaticMethod1(); // we have just created our own object of type StaticMethod1
        myObj.subtractNumbers(2,5);

        new StaticMethod1().subtractNumbers(2,7); // this is just another way of calling
        // non static methods by instantiating the class
    }

    // addTwoNumbers() is a static method and it belongs to StaticMethod1 class
    // since it's static I can call this method from any other static methods and instance methods
    // directly without creating an object of that class

    public static void addTwoNumbers (int a, int b) {
        // non static methods cannot be called directly without object from static methods
        // we need to first create an object of that class to call it's instance members
//        StaticMethod1 myObj1 = new StaticMethod1();
//        myObj1.subtractNumbers(5,8);

        System.out.format("The sum is: %d%n", a + b);
    }

}
