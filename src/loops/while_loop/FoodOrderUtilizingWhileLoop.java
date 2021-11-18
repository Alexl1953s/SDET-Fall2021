package loops.while_loop;

import java.util.Scanner;

public class FoodOrderUtilizingWhileLoop {

    /*
    1. Welcome message to customers and ask what would they like?
    2. Ask if they would like to order more?
    3. and if yes then create a while loop to add orders
    4. adding orders should be done in a separate method
    5. print out the order items
     */
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Welcome to Mars_01 cafe.\nWhat would you like today?");
        StringBuilder order = new StringBuilder(); // String order = "";

        order.append(scan.nextLine()).append("\n"); // [String] order.concat(scan.nextLine()).concat("\n");

        boolean moreOrderOrNo = orderMore().equalsIgnoreCase("yes");

        while (moreOrderOrNo) {
            addMoreItems(order);
            if(!orderMore().equalsIgnoreCase("yes")) moreOrderOrNo = false;
        }

        System.out.println("\nHere is your ordered items:\n" + order);
    }

    static StringBuilder addMoreItems (StringBuilder order) {

        System.out.println("What would you like?");
        return order.append(scan.nextLine()).append("\n");
    }

    static String orderMore () {

        System.out.println("Would you like to order anything else?");
        String moreItems = scan.nextLine();
        return moreItems;
    }
}
