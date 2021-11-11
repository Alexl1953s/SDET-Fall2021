package strings.equals_method;

public class StringEqualsIgnoreCaseMethod {

    // public boolean equalsIgnoreCase(String str)
    // returns true even if the cases are different but the character should be equal to it's
    // corresponding case [EX: A -> a, C - > c etc]

    public static void main(String[] args) {

        System.out.println("Alex".equalsIgnoreCase("alex"));

        String school1 = "Princeton";
        String school2 = "princeton";

        boolean isEqual = school1.equalsIgnoreCase(school2);

        System.out.println(isEqual);
    }
}
