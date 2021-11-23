package loops.for_loop;

public class ForLoopWithMultipleVars {
    /*
    * There can be more than one variables initialized and used in
    * expression [condition] of the for loop statement but there must be
    * conditional operator for the variables used to checking the condition
    *  */

    public static void main(String[] args) {

//        for (int a = 0, b = 1; a < 5; a++, b++) {
//            System.out.print("The value of 'a': " + a + ". The value of 'b': " + b + "\n");
//        }

        int x = 0;
        int y = 0;
        for (y = 2, x = 1; x < 10 || y < 3; x++, y++) {
            System.out.print("The value of 'x': " + x + ". The value of 'y': " + y + "\n");
        }
    }
}
