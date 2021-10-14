package data_types_oca_ch_1;

public class NonPrimitiveDataTypes {

    /**
     * A reference type refers to an object (an instance of a class).
     * Unlike primitive types that hold their values in the memory where the variable is
     * allocated, references do not hold the value of the object they refer to. Instead, a
     * reference “points” to an object by storing the memory address where the object is located,
     * a concept referred to as a pointer.
     */

    public static void main(String[] args) {

        String firstName;
        firstName = "Negesti";

        String lastName = "Gomez";
        String favoriteCar = "Aston Martin";

        System.out.println(firstName);
        System.out.println(lastName);

        // String is a sequence of characters in cadence
        // String can have very large amount of words or characters in it

        String randomText = " A reference type refers to an object (an instance of a class). \n" +
                "      Unlike primitive types that hold their values in the memory where the variable is \n" +
                "      allocated, references do not hold the value of the object they refer to. Instead, a \n" +
                "      reference “points” to an object by storing the memory address where the object is located, \n" +
                "      a concept referred to as a pointer. ";

        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
        //System.out.println("Favorite car: " + favoriteCar);
        System.out.println(firstName + "'s favorite car is a " + favoriteCar);


        // + sign like above is used to concatenate Strings
        System.out.println(firstName + " " + lastName + " " + favoriteCar);


    }
}
