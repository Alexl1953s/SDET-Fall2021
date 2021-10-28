package if_else_statements_oca_ch2;

public class IfElseWithoutElseIf {
    public static void main(String[] args) {

        // There might be a similar example to this but here
        // we can see the difference when the age variable value is bigger then 40
        // when multiple if statements then java will go through each of them
        // to check the condition and if it satisfies the condition then
        // it will run all of them

        // but when we replace the if statements starting from the second if statement
        // then once any of them evaluates to true and gets executed
        // the rest of the else-if statements will not be checked

        int age = 65;

        if (age > 60) {
            System.out.println("You are in your 60s.");
        }
        if (age > 50) {
            System.out.println("You are in your 50s.");
        }
        if (age > 40) {
            System.out.println("You are in your 40s.");
        }
        else if (age > 30) {
            System.out.println("You are in your 30s.");
        }
        else if (age > 20) {
            System.out.println("You are in your 20s.");
        }
        else if (age > 10) {
            System.out.println("You are young.");
        }
        else System.out.println("Age is not valid!");
    }
}
