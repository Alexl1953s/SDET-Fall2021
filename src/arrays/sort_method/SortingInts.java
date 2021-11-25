package arrays.sort_method;

import java.util.Arrays;

public class SortingInts {

    // sort() is void method which sorts an array in an ascending order

    //NOTE: Numbers sort before letters and uppercase sorts before lowercase

    public static void main(String[] args) {

        int[] scores = {75, 78, 98, 95, 84, 57, 65};
        int[] scoresCopy = new int[scores.length];
        System.out.println("Before sorting: " + Arrays.toString(scores));
        Arrays.sort(scores);
        scoresCopy = scores;
//        scoresCopy = Arrays.sort(scores); // since sort() is a void type method we cannot assign the outcome to another array
        System.out.println("After sorting: " + Arrays.toString(scores));

        String[] schools = {"harvard", "Stanford", "OSU", "anu", "ASU", "Penn State", "acu", "UCLA", "Berkeley", "UNL", "123"};
        System.out.println("Before sorting: " + Arrays.toString(schools));
        Arrays.sort(schools);
        System.out.println("After sorting: " + Arrays.toString(schools));

        String[] names = {"Aaron", "Akon", "Arthur", "Adeline", "Abe", "Aabraham"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        char[] specialChars = {'%', '.', '7', '!', '^', '1', '*', 'B', ' ', 'g', '|', ','};

        System.out.println("Before sorting: " + Arrays.toString(specialChars));
        Arrays.sort(specialChars);
        System.out.println("After sorting: " + Arrays.toString(specialChars));


    }
}
