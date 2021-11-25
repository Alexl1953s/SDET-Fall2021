package arrays.binary_search_arrays;

import java.util.Arrays;

public class BinarySearchStrings {

    public static void main(String[] args) {

        String[] schools = new String[]{"Devx", "ITSchool", "IIT", "CaterpillarAcademy"};

        System.out.println("The number of times 'e' appears in schools is: " + findOfChars(schools, 'o'));
        System.out.println("Before sorting index of \"IIT\": " + Arrays.toString(schools) + " " + Arrays.binarySearch(schools, "IIT"));

        Arrays.sort(schools);
        System.out.println("After sorting index of \"IIT\": " + Arrays.toString(schools) + " " + Arrays.binarySearch(schools, "IIT"));
    }

    static int findOfChars(String[] str, char target) {
        int count = 0;
        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str[i].length(); j++) {
                if (str[i].charAt(j) == target) {
                    count++;
                }
            }
        }
        return count;
    }
}
