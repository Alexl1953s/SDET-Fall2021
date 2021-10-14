package java_operators_oca_ch_2;

public class ComparisonOperators2 {

    public static void main(String[] args) {

        char gender = 'M';

        boolean isMale = gender == 'M';
        System.out.println("Welcome to our store here are the list of amazing fall collection we have for men.");

        String str1 = "Devxschool";
        String str2 = "Devxschool";

        String strObj = new String("Devxschool");
        boolean isSame = str1 == strObj;
        System.out.println("Are they the same? " + isSame);

        System.out.println("Are the schools equal? " + (str1 == str2));
        System.out.println("Is \"devxschool\" equal to \"" + str1 + "\"? " + ("devxschool" == str1));

        boolean b1 = true;
        boolean b2 = false;

        System.out.println(b2 = b1 = false); // when only one '=' symbol is there it is an assignment operator
        System.out.println(b2 = b1 == false); // b1 has been assigned 'false' on line 25 that's why the
        // "b1 == false" executes to true therefore the outcome of this operation gets assigned to b2 as true
        System.out.println("The value of b1: " + b1);
        System.out.println("The value of b2: " + b2);

        int x = 5;
        double d1 = 5.0;
        boolean b10 = x == d1;
        // whenever we perform a comparison operation between
        // 2 primitive literals such as int, short, double etc.
        // Java will convert the smaller data type to the larger data type
        // and then it performs the operation
        //EX: int x = 5; double d1 = 5.0; in comparison operation both will be 5.0 == 5.0
        System.out.println("Is 5 equal to 5.0? " + b10);

        // When char is compared with a number first char will get the ASCII value of it
        // and then performs the operation

        // and if the char is being compared to a double then first
        // java will get the decimal representation of that char from ASCII
        // and then convert it to a larger type [double]
        char b = 'B';
        System.out.println(b == 66.0);

        // boolean b12 = str2 == 7; // we cannot compare non primitive with primitive type

        int i1 = 5;
        boolean b13 = !(i1 != 5); // first the comparison of not equal to get executed in the parenthesis
        // and then the outcome will be changed to the complement of it [ex: if true then becomes not true when there
        // is a '!' mark so the outcome of the comparison will become true and gets assigned to b13
        System.out.println(b13);

        boolean b14 = !(!(!true)); // the value of b14 is now 'false'
    }
}
