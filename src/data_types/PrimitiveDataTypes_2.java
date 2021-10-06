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

    }
}
