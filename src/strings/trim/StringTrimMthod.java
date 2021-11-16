package strings.trim;

public class StringTrimMthod {

    // public String trim()
    // returns a string by removing whitespaces from both ends
    // removes \t, \r, \s

    // since String is an immutable any method we call on strings
    // won't change the object, it will instead create new objects each and every time.

    public static void main(String[] args) {

        String schoolName = "   Devx school    ";
        System.out.println(schoolName.trim()); // "Devx school"
        System.out.println(schoolName);

        schoolName = schoolName.trim();
        System.out.println(schoolName);
    }
}
