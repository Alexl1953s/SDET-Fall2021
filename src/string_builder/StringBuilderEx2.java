package string_builder;

public class StringBuilderEx2 {

    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Devx");
        System.out.println(sb1); // Devx

        StringBuilder sb2 = sb1;
        System.out.println(sb2); // Devx

        sb1.append("School"); // sb1 = DevxSchool
        System.out.println(sb1);
        System.out.println(sb2); // sb2 = DevxSchool -> because sb2 is pointing to sb1 object

        sb2.append("IsCool");
        System.out.println(sb2); // DevxSchoolIsCool
        System.out.println(sb1); // DevxSchoolIsCool -> because they are both pointing to the same object
    }
}
