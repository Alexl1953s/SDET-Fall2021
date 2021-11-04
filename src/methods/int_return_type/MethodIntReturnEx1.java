package methods.int_return_type;

public class MethodIntReturnEx1 {

    // methods should have either void or valid return type
    // when declaring them
    // methods can return int, char, boolean etc all primitive and non primitive types
    // such as String

    public static int addTwoNumbers (int num) {

        return num + 3; // this will return the value of 5 because num = 2 and we are
        // adding num to 3
    }

    public static void main(String[] args) {

        int result = addTwoNumbers(2);

        System.out.println(result);
    }
}
