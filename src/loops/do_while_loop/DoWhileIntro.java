package loops.do_while_loop;

public class DoWhileIntro {

    // do while statement will iterate at least once before checking the expression
    // A do…while loop allows a series of instructions in the body of the loop to run
    // once before validation of the condition that controls the loop. e.g.:

//    EX: do {
//              print("Hello World");
//          } while (condition);

    public static void main(String[] args) {

        do {

            System.out.println("Hello SDETs");

        } while (false);

        System.out.println("Now we are out of the loop");
    }
}
