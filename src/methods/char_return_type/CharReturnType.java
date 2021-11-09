package methods.char_return_type;

public class CharReturnType {

    public static void main(String[] args) {

        System.out.println("Your grade is: " + new CharReturnType().calculateGrade(78));

    }

    public char calculateGrade (int testScore) {

        char grade = ' ';

        if (testScore <= 100 && testScore >= 90) grade = 'A';
        else if (testScore <= 89 && testScore >= 80) grade = 'B';
        else if (testScore <= 79 && testScore >= 70) grade = 'C';
        else if (testScore <= 69 && testScore >= 60) grade = 'D';
        else if (testScore <= 59 && testScore >= 50) grade = 'E';
        else if (testScore < 50 && testScore >= 0) grade = 'F';
        else System.out.println("Grade is invalid. Try again.");

        return grade;
    }
}
