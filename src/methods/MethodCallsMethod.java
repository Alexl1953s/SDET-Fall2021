package methods;

public class MethodCallsMethod {

    // there can be as many methods as needed within one class
    // but outside of main method

    // we can call methods from inside other methods

    public static void main(String[] args) {

        method2();
        method1();

    }

    private static void method1 () {
        method2();
        System.out.println("Hey I am method-1");
    }

    protected static void method2 () {
        System.out.println("Hey I am method-2");
    }
}
