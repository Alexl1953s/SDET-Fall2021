package collections.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NestedArrayLIsts1 {

    public static void main(String[] args) {

        // ArrayList can store other collections as elements

        ArrayList<String> school1 = new ArrayList<>(Arrays.asList("Stanford", "Harvard", "OSU"));
        ArrayList<String> school2 = new ArrayList<>(Arrays.asList("MIT", "NWU", "UI", "Berkeley"));

        school1.set(0, "Yale");

        ArrayList<ArrayList<String>> schoolList = new ArrayList<>();

        schoolList.add(school1);
        schoolList.add(school2);

        System.out.println("School 1: " + school1);
        System.out.println("School 2: " + school2);
        System.out.println("School list: " + schoolList);

        for (int i = 0; i < schoolList.size(); i++) {

            for (int j = 0; j < schoolList.get(i).size(); j++) {

                schoolList.get(i).set(j, ("$" + schoolList.get(i).get(j))); // adding '$' to the beginning of each element
            }
        }

        System.out.println("After adding '$': " + schoolList);

        int[] nums = {1,2,3,4};
        int[] nums2 = {120,12,12,23,34};

        Integer[] arrOfIntObjects = {13,24,35,46};

        ArrayList<int[]> numsList = new ArrayList<>();

        numsList.add(nums);
        numsList.add(nums2);

        for (int[] num : numsList) {
            System.out.println(Arrays.toString(num));
        }

//        numsList.add(arrOfIntObjects); -> ArrayList created only stores int[] primitive numbers
    }
}
