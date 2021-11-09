package methods.int_return_type;

public class MethodIntReturnEx1 {

    // methods should have either void or valid return type when declaring them
    // methods can return int, char, boolean etc all primitive and non primitive types
    // such as String

    public static int addTwoNumbers (int i) {

        return i + 3; // this will return the value of 5 because num = 2 and we are
        // adding num to 3
    }

    public static void main(String[] args) {

        int i;
        i = 2;

        int a;
        System.out.println(addTwoNumbers(2)); // 5
        a = addTwoNumbers(7);
        System.out.println(a);
        System.out.println(addTwoNumbers(135 + a));

        // Scanner input = new Scanner(System.in);
        MethodIntReturnEx1 object = new MethodIntReturnEx1();
        System.out.println(object.randomMethod());

        System.out.println();
    }

    int randomMethod(){
        return addTwoNumbers(3);
    }
}
