package methods;

public class SimpleMethodForPrinting {

    // methods can be anywhere outside of main() method
    // however they have to be in class scope

    // every method has a task or purpose
    // they have to perform some action

    // void type methods do not return anything
    public static void welcomingMessage () {
        System.out.println("Welcome to Devx!");
    }

    public static void main(String[] args) {
        // call or invoke a method
        welcomingMessage();

    }
}

