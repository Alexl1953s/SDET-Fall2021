package collections.arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class CopyingElementsOfListToArray {

    public static void main(String[] args) {

        // another way of inserting elements at initialization of an arraylist
        ArrayList<Integer> idsList = new ArrayList<>(Arrays.asList(1221, 2132, 3432, 2423, 24335, 3444));

        System.out.println("Initial idsList: " + idsList);

        ArrayList<Integer> idsListCopy = new ArrayList<>(idsList);
        idsListCopy.set(2, 6788);

        System.out.println("Initial idsListCopy: " + idsListCopy);

        int[] idsArray = new int[idsList.size()];

        for (int i = 0; i < idsListCopy.size(); i++) {

            idsArray[i] = idsListCopy.get(i);
        }

        System.out.println("Array: " + Arrays.toString(idsArray));
    }
}
