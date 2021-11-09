package methods.boolean_return_type;

import java.util.Scanner;

public class BoolReturnType {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the room number to check availability:");
        int roomNumber = input.nextInt();

        BoolReturnType boolReturnType = new BoolReturnType();
        System.out.println(boolReturnType.isAvailable(roomNumber));
    }

    public boolean isAvailable (int numberOfRoom) {

        if (numberOfRoom >= 401 && numberOfRoom <= 410) {
            return true;
        }
        return false;
    }
}
