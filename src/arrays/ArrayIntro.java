package arrays;

import java.util.Arrays;

public class ArrayIntro {

    /*
    * Arrays are fixed size, once array is created size cannot be changed
    * Accessing the elements will take the same time, the first and the last element
    * can be accessed in constant time O(1)
    * Arrays are objects themselves
    * Arrays can store primitive and non primitives, can store Arrays and other types of collections
    * Syntax to create an array: dataType[] nameOfArray = new dataType[size]
    * */

    public static void main(String[] args) {

        // the default value os Strings is null

        String[] names = new String[5]; // we have created an array of type String and the size of 5
        // this array object can hold 5 elements in it

        names[4] = "Sam";
        names[0] = "Aisha";
        names[2] = "Fenton";
        names[1] = "Alex";
        names[3] = "Daniel";

        System.out.println("The name at index 2 is: " + names[2]);

        System.out.println(Arrays.toString(names)); // if we want to print out all
        // elements of an array in an array view then we have to use toString() method of Arrays class
        // otherwise it will simply print out the memory location of the reference variable

        String [] school = new String[]{"Stanford", "Harvard", "OSU", "Penn State"};
        // I want to print out "OSU" which canbe done by index
        System.out.println("The school is: " + school[2]);

        String[] optionalSchoolNames = {"Devx", "UxUiSchool", "Devx school"};
        System.out.println(optionalSchoolNames[2]);
        System.out.println(optionalSchoolNames[optionalSchoolNames.length-1]);
    }
}
