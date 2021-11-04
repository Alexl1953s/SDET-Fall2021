package methods;

public class MethodExWithVariables {

    // 1. we will need unit number in int type
    // 2. we need street name String type
    // 3. City String type
    // 4. State String
    // 5. ZIP int

    public static void main(String[] args) {

        printAddress(6, "Santa Monica blvd", "Los Angeles", "CA", 90015);
    }

    public static void printAddress(int unitNumber, String street, String city, String state, int zip){
        System.out.println("The address: "
                + unitNumber
                + " " + street
                + ", " + city
                + ", " + state
                + " " + zip);
    }
}
