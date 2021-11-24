package loops.while_loop;

public class WhileLoopWithBool {

    public static void main(String[] args) {

        int n = 1;

        while (true) {

            // int n = 1; -> this is dangerous because n will be initialized to 1 every iteration
            // so it will never break out of this while loop
            System.out.println("Yay! While loop iterated " + n + " times.");
            if (n == 5) break;
            n++; // adding 1 to the value of n every iteration

        }
    }
}
