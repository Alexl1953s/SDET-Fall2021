package practice_interview_questions.solutions;

public class PassOrFail {

    public static void main(String[] args) {

        /*
        26. Depending on the test score result I want to print out if student has passed the the exam or not.

            if the score is less than or equal to 50 I want to print out "FAIL"
            and if greater than 50 then "PASS";

            String pass = "PASS";
            String fail = "FAIL";
            int testResult = 73;
         */

        // ternary operator
        String pass = "PASS";
        String fail = "FAIL";
        int testResult = 73;

        String passOrFail = testResult > 50 ? pass : fail;
        System.out.println("You " + passOrFail + " the test.");

//        int x = 0;
//        x++; // 0
//        --x; // 0
//        x = x++ + 2 + ++x; // x = x++ + 2; -> 2
//        System.out.println(x);
//        int y; // declaring
//        x +=y; // compile time error because 'y' has not been initialized yet
//        System.out.print(x);

    }
}
