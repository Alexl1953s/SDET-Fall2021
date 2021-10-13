package java_operators;

public class CompoundAssignmentOperator {

    public static void main(String[] args) {

        int x = 1;
        int y = 2;

//        y = y + x;
//        System.out.println(y);

        // This operation is called COMPOUND ASSIGNMENT OPERATOR
        // it is same as y = y + x -> y += x;
        // BELOW ARE THE EXAMPLES:
        /*
         *   x = x + y -> x += y
         *   x = x - y -> x -= y
         *   x = x * y -> x *= y
         *   x = x / y -> x /= y
         *   x = x % y -> x %= y
         */
        y += x;
        System.out.println(y);

        y -= x; // y = y -x
        y *= x;
        y /= x;

        // Given an initial salary
        // calculate the salary raise with bonuses after 5 years
        // using augmented assignment operator or compound assignment operator
        double salary = 100_000;
        double yearlyIncrease = 0.03;
        // the first year
        System.out.println("The first year salary: " + salary);
        // the second year
        System.out.println("The second year salary with bonus: " + (salary += salary * yearlyIncrease));
        // the third year
        System.out.print("The third year salary with bonus: " + (salary += salary * yearlyIncrease));
        // the fourth year
        System.out.print("The fourth year salary with bonus: " + (salary += salary * yearlyIncrease));
        // the fifth year
        System.out.print("The fifth year salary with bonus: " + (salary += salary * yearlyIncrease));


        // % modulus will give us the remainder after dividing a number by another
        // number

        int num1 = 5 / 2;
        int num2 = 5 % 2; // this will give me 1 after dividing the remainder is 1

        // one of the use cases for using modulo is
        // when trying to identify if the number is odd vs even
        // EX: 4/2 remainder of 0; 6/2 remainder is 0; 1000/2 remainder 0;

        // EX: 5/2 remainder is 1; 7/2 remainder is 1;

        System.out.println(13.4 / 2);
        System.out.println(13.4 % 2); // 13 % 2 -> 1 and then the fraction part is .4
        System.out.println(12.7 % 2); // 12 % 2 -> 0 and then the fraction is rounded as close as
        // possible to the fraction

        double pi = 3.14;
        // String concatenation is basically adding 2 string objects
        // When adding any value to the string java will convert that value to a string
        // Type casting has the highest precedence when it comes to operations
        // then java looks for parenthesis and then starts converting them to strings
        System.out.println("The value of PI is: " + pi + (double) 1); // The value of PI is: 3.141.0
        System.out.println("The value of PI is: 3.141");

        System.out.printf("The value of PI is: %.2f \n", (pi + (double) 1)); // The value of PI is: 4.14

        String hello = "Welcome";
        String world = "Planet";
        //String whiteSpace = " ";

        String helloWorld = hello + " to " + world + " Mars!";
        System.out.println(helloWorld);

        //i += 2; // i = i + 2

    }
}
