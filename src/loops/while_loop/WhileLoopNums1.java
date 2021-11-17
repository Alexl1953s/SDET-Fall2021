package loops.while_loop;

public class WhileLoopNums1 {

    public static void main(String[] args) {

        // print out numbers from 10 to 1 in decreasing order

        int n = 10;

        while (n > 0) {

            System.out.print(n + " ");
            n = n - 1; // decreasing the value of n by 1 each iteration

        }

    }
}
