package collections.set;

import java.util.*;

public class ArrayListToSet {

    public static void main(String[] args) {

        Short[] nums1 = {12, 23, 12, 45, 23, 67, 89, 45, 3, 5, 7};
        Short[] nums2 = {12, 23, 12, 45, 23, 67, 89, 45, 3, 5, 7};
        Short[] nums3 = {12, 23, 12, 45, 23, 67, 89, 45, 3, 5, 7, 8}; // one extra element at the end

        Set<Short> setAge = new HashSet<>();

        // boolean addAll(Collection c) -> returns true if the collection parameter does not exist in the collection already
        // or even if 1 element is different and added successfully it still returns true
        // and if the collection we are trying to add already exists in the main collection
        // then it will return false
        boolean isAdded1 = setAge.addAll(Arrays.asList(nums1));
        boolean isAdded2 = setAge.addAll(Arrays.asList(nums2));
        boolean isAdded3 = setAge.addAll(Arrays.asList(nums3));

        System.out.println("For adding nums 1 to set: " + isAdded1);
        System.out.println("For adding nums 2 to set: " + isAdded2);
        System.out.println("For adding nums 3 to set: " + isAdded3);

        //================//================//================//================//================//================

        ArrayList<String> names = new ArrayList<>(Arrays.asList("David", "John", "Elon", "Elon", "Elon", "David", "Steve", "Andreas", "Elon"));
        System.out.println("List of names: " + names + ", " + names.size());

        Set<String> nameSet = new HashSet<>(names);
        System.out.println("Unique names from the set: " + nameSet + ", " + nameSet.size());

    }
}
