package practice_interview_questions.solutions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddPlusToEveryElementOfTheList {

    /**
     * one of the tasks for today before the class is to write a method that takes
     * an arraylist of string objects and returns ArrayList of String objects by adding “+” to
     * end of each element.
     *
     * NOTE: You can use the same arraylist or create a new arraylist to return.
     * EX: these are the list items = {“alpha”, “beta”, “gamma”}
     * expected output: {“alpha+“, “beta+“, “gamma+“}
     * @param
     */
    public static void main(String[] args) {

        ArrayList<String> wordsList = new ArrayList<>(Arrays.asList("Alpha", "Beta", "Gamma"));

        int indexOfGamma = wordsList.indexOf("Gamma");
        String plusGamma = wordsList.get(indexOfGamma).concat("+");
        // set() method takes index of element that we want to replace
        // and second parameter is what we will replace the element with
        wordsList.set(indexOfGamma, plusGamma);

        System.out.println("Initial list: " + wordsList);

        System.out.println("After adding plus: " + addPlusToElements(wordsList));
    }

    public static ArrayList<String> addPlusToElements(ArrayList<String> list) {

        for (int i = 0; i < list.size(); i++) {

            if (list.get(i).endsWith("+")) {}
            else list.set(i, list.get(i).concat("+"));
        }

        return list;
    }
}
