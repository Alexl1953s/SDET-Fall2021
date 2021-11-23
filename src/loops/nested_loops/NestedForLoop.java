package loops.nested_loops;

public class NestedForLoop {

    // Loops can have unlimited number of inner loops but more than 3 is
    // not recommended, simply just divide them into separate loops

    public static void main(String[] args) {

        // printing out the time table by using for loop

        // outer for loop will represent the rows
        // inner for loop is for columns

        for (int i = 1; i <= 10; i++) { // outer loop

            for (int j = 1; j <= 10; j++) { // inner loop

                System.out.print(j + " x " + i + " = " + (i * j) + "\t\t");
            }
            System.out.println();
        }

        // 1 x 1 = 1    2 x 1 = 2   3 x 1 = 3
        // 1 x 2 = 2    2 x 2 = 4   3 x 2 = 6
        // ...          ...         ...
    }
}
