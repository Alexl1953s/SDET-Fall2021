package java_operators_oca_ch_2;

public class ArithmeticOperators {

    public static void main(String[] args) {

        // Arithmetic operators in java are the basic mathematical operations
        // such as addition (+), subtraction (-), division (/), multiplication (*)
        // modulo operator (%)

        int num1 = 123;
        int num2 = 456;
        // addition
        int numsAdded = num1 + num2;
        System.out.println("Addition: " + numsAdded);
        // subtraction
        int numsSubtracted = num2 - num1;
        System.out.println("Subtracted: " + numsSubtracted);
        // division
        float numsDivided = num2 / num1; // when integer numbers are divided the outcome of that
        // operation is going to be an integer
        System.out.println("Divided: " + numsDivided);
        // multiplication
        int numsMultiplied = num1 * num2;
        System.out.println("Multiplied: " + numsMultiplied);

        int x = 3;
        int y = 2;
        // when dividing 2 integers java will treat them as integers and does the math operation
        // and then convert them to a float
        // rather if we want more precise outcome with the fractions
        // then we can first convert the type and then do the math operation
        float z = (float) x / y;
        System.out.println(z);
        int res = (int) z;

        long varLong = 123456L;
        float varFloat = varLong;

        // precedence order is starts with parenthesis operation first
        // then multiplication or division and then right to left
        System.out.println("What will be the outcome of this?");
        int finalOutcome1 = x + (res - y);
        System.out.println(finalOutcome1);

        int finalOut2 = x * y / 3;
        System.out.println(finalOut2);

        // order precedence for arithmetic operations
        // highest precedence is () parenthesis
        // second -> *, /, %
        // third -> +, - -> will go from left - to - right order
        System.out.println("The order precedence: " + (4 + 3 % 2 * 5));
        System.out.println("The order precedence: " + (4 * 2 / 2 % 3));
        System.out.println( 6 + 2 - 3 * (4 + (5 - 3)%2));

        int dividend = 4; // 4.0
        double divisor = 2.2;

        System.out.println("Both operands are converted to double for this operation: " + dividend/divisor); // both of the operands are going to convert implicitly to double type

        // when perform arithmetic operation of 2 chars their decimal representation from ASCII table will be added/subtracted/ etc.
        char charA = 'a';
        char charB = 'b';
        int aBSum = charA + charB;
        System.out.println("'a' plus 'b' = " + aBSum);

        // x * y / z ?
        short shNum = 14;
        float floatNum = 13;
        double doubleNum = 30;

        double nums = shNum * floatNum / doubleNum;
    }
}
