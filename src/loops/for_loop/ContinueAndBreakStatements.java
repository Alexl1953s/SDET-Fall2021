package loops.for_loop;

public class ContinueAndBreakStatements {

    // break statement -> switch and loops can contain break statements to stop the iteration of
    // the nearest loop.

    // continue statement used for skipping iteration or to simply continue the iteration

    public static void main(String[] args) {

        String school = "Devx School";

        breakPointOfTheLoop : for (int i = 0; i < school.length(); i++) {
            if (school.charAt(i) == 'v') continue breakPointOfTheLoop; // breakPointOfTheLoop is an optional label to pair with
            // continue statement
            if (school.charAt(i) == 'o') break breakPointOfTheLoop; // breakPointOfTheLoop is an optional label to pair with
            // break statement
            System.out.print(school.charAt(i) + " ");
        }

        System.out.println();

        int i = 0;
        optOutOfWhile: while (i < 10) {

            if (i == 5) break optOutOfWhile;
            System.out.println("The value of i is: " + i);
            i++;
        }
    }
}
