package data_types;

public class PrimitiveDataTypes_2 {

    public static void main(String [] args){
        // for long data type we need to include "l" or "L" to the end of the value
        // but best practice is to input "L"
        long numberOfViews = 20_000_000_000L;

        System.out.println(numberOfViews);

        // float data types should include "f" or "F" at the end of the value
        float engineSize = 4.5f;

        System.out.println(engineSize);

        // double data type can store up to 15 decimal digits
        double pi = 3.14; // it is optional to put "d" or "D" at the end of the value but it's best to not put it

        System.out.println(pi);

        // boolean data type is a primitive type that has only 2 states
        // boolean can only have true or false values

        boolean isPresent;
        isPresent = true;
        isPresent = false;

        boolean has4Tires = true;
        boolean isCold = false;

        // char [character] that can only hold one character as a value
        // they can be used for different scenarios EX: grades, gender etc.
        // chars use single quotes to wrap it's values

        char gender = 'F';
        char gradeExcellent = 'A';
        char gradeGood = 'B';
        char ampersand = '&';

    }
}
