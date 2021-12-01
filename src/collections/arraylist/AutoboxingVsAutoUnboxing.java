package collections.arraylist;

public class AutoboxingVsAutoUnboxing {

    // Boxing -> converting primitive to Wrapper Object manually
    // Autoboxing -> converting primitive to Wrapper Object type automatically java handles it

    // Unboxing -> converting Wrapper object to primitive type
    // Autounboxing ->converting Wrapper Object to primitive

    public static void main(String[] args) {

        // Boxing
        int i = 77;

        Integer iObject = Integer.valueOf(i);

        // Autoboxing

        int age = 67;

        Integer ageObject = age;

        // Unboxing

        Character cObject = new Character('h');

        char cPrimitive = cObject.charValue();

        // Auto unboxing

        Double temp = 87.45;

        double tempPrimitive = temp;
    }
}
