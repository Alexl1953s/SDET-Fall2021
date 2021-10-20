package practice_interview_questions.solutions;

public class InterviewQuestionsClass {

    public static void main(String[] args) {

        // 24. How can I swap the values of these 2 variables?
        // Expected output: x = 10 and y = 100;

        int x = 100;
        int y = 10;

        //this is by using one extra variable to swap the values
//        int temp = x;
//
//        x = y;
//        y = temp;

        System.out.println("Initial x is: " + x + " and initial y is: " + y);

        // this one is using 2 extra variables to swap
//        int x1 = y;
//        int y1 = x;
//
//        x = x1;
//        y = y1;

        // this is the ideal solution without using any extra variables
        x = x + y; // now x is 110
        y = x - y; // y is 100
        x = x - y; // now x is 110 - 100 -> 10


        System.out.println("x is: " + x + " and y is: " + y);
    }
}
