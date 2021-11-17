package loops.while_loop;

public class WhileLoopSyntax {

    /*
    while loop - repetition control structure in Java
    Like all [for-loop, while, do-while] repetition control structures, it has a termination condition,
    implemented as a boolean expression, that will continue as long as the expression evaluates to true.
    While loop iteration breaks only when the expression/condition evaluates to false;

    While loop checks the expression before execution every time until it becomes false;
     */

    public static void main(String[] args) {

        // in below while statement we are printing numbers from 1 to 10 including
        // and in order to break[stop] the iteration of the loop
        // we have to control the condition to evaluate to false

        int n = 1;

        while ( n <= 10 ) {
            System.out.println(n); // 1 -> 1
            n = n + 1; // we are updating the value of n by adding 1 on each iteration of while loop
            // n += 1 or n++
        }
//        System.out.println(1);
//        System.out.println(2);
//        System.out.println(3);
//        System.out.println(4);
//        System.out.println(5);
//        System.out.println(6);
//        System.out.println(7);
//        System.out.println(8);
//        System.out.println(9);
//        System.out.println(10);

    }
}
