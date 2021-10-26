package if_else_statements_oca_ch2.nested_if_else_stmts;

public class NestedIfElse1 {

    public static void main(String[] args) {

        // nested if-statements are the if statements inside the scope of another if statement
        // and the main purpose is to evaluate the outer or the parent if statement condition first
        // and only if that evaluates to true then we will check the inner or nested if statement

        // EX: in order to drive your car you need to first start it

        boolean isRunning = true;

        String whatsNext = "back up";
        String drive = "Change gear to 'D'";
        String backUp = "Change gear to 'R'";


        if(isRunning) {

            if(whatsNext == "drive") {
                System.out.println(drive);
            }
            else {
                System.out.println(backUp);
            }
        }
    }
}
