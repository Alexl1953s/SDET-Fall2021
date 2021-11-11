package strings.equals_method;

public class StringEqualsMethod2 {

    // equals() method is case sensitive
    // it checks if all the characters are in the same case [upper or lower case]

    public static void main(String[] args) {

        boolean isEqual = "Aisha".equals("aisha");
        System.out.println(isEqual);

        boolean isSame = "Aisha".equals("Aisha");
        System.out.println(isSame);
    }
}
