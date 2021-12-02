package collections.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListMethods2 {

    public static void main(String[] args) {

        List<String> teslaModels = new ArrayList<>(Arrays.asList("Model 3", "Model X", "Model S", "Model Y"));

        System.out.println("Tesla cars: " + teslaModels);

        // let's check if our teslaModels list contains "Model S"
        boolean hasModelS = teslaModels.contains("Model S");
        System.out.println("Does teslaModels list contain Model S? " + (hasModelS ? "yes" : "no"));

        boolean hasElements = teslaModels.isEmpty();
        System.out.println("Is teslaModels list empty? " + hasElements);

        // clear() -> method deletes the elements of an Arraylist
        teslaModels.clear();
        System.out.println("Has teslaModels elements been deleted now? " + teslaModels.isEmpty());

        List<String> fordCars1 = new ArrayList<>(Arrays.asList("F150", "Raptor", "Escape", "Fusion"));
        List<String> fordCars2 = new ArrayList<>(Arrays.asList("F150", "Raptor", "Escape", "Fusion"));
        // equals() -> method checks whether 2 lists contain the same elements in the same order
        System.out.println("Do these lists contains the same elements in the same order? " + fordCars1.equals(fordCars2));

        // boolean remove(element name) -> removes the first matching element from the list
        // Element e remove(index) -> removes the element at index

        boolean isRaptorRemoved = fordCars1.remove("Raptor");
        boolean isFiestaRemoved = fordCars1.remove("Fiesta");

        System.out.println("Has Raptor been removed from fordCars1? " + isRaptorRemoved);
        System.out.println("Has Fiesta been removed from fordCars1? " + isFiestaRemoved);

        String removedEscape = fordCars2.remove(2);
        System.out.println("The removed car from fordCars2 is: " + removedEscape);

        System.out.println("The fordCars2 after removing Escape: " + fordCars2);

        fordCars1.set(0, "F250");

        System.out.println("After changing index 0 to F250: " + fordCars1);
    }
}
