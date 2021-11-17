package string_builder;

public class SBDeleteMethod {

    // StringBuilder delete(int start, int end)
    // returns a reference to the same StringBuilder by deleting the char sequences
    // starting at start index and ending before end index

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        sb.append("Devx");

        sb.delete(1, 3); // Dx
        System.out.println(sb);

        StringBuilder school = new StringBuilder("Stanford");

        StringBuilder s = new StringBuilder(school.substring(school.indexOf("f")));
        // substring() does not change
        // the value of string builder object

        StringBuilder schoolDeleted = school.delete(school.indexOf("f"), school.length());
        System.out.println(schoolDeleted); // Stan

        System.out.println(school); // Stan
        System.out.println(s);

        /*
         StringBuilder deleteCharAt(int target)
         returns a reference to the same string builder object by removing the char at target index.
         */

        StringBuilder college = new StringBuilder("Harvard");

        college.deleteCharAt(college.length()/2); // dividing length by 2 we get the index of middle char
        System.out.println(college); //Harard
    }
}
