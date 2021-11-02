package switch_case;

import java.util.Scanner;

public class McDonaldsOrder {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to McDonald's. Please select from the menu:");

        String itemOptions = "Please choose A, B or C:\n";

        String burgerMenu = itemOptions +
                "A. Cheeseburger $0.99\n" +
                "B. McChicken $1.99\n" +
                "C. Big Mac $3.99";

        float cheeseBurgerPrice = 0.99f;
        float mcChickenPrice = 1.99f;
        float bigMacPrice = 3.99f;

        String drinkMenu = itemOptions +
                "A. Coke $0.49\n" +
                "B. Diet Coke $0.49\n" +
                "C. Sprite $0.49";

        float cokePrice = 0.49f;
        float dietCokePrice = 0.49f;
        float spritePrice = 0.49f;

        String saladMenu = itemOptions +
                "A. Caesar $2.49\n" +
                "B. Grilled Chicken $3.49\n" +
                "C. Green salad $2.99";

        float caesarPrice = 2.49f;
        float grilledChickenPrice = 3.49f;
        float greenSaladPrice = 2.99f;

        String typeYorN = " Enter 'Y' for 'yes' and 'N' for 'no'";

        float totalPrice = 0;
        String numberOfItemsAsk = "How many would you like?";
        byte numberOfItems = 1;
        char itemType = ' ';

        String orderDetails = "Here is your order details:\n";
// ================================================================================================================

        System.out.println("Would you like a burger?" + typeYorN);
        char burgerAsk = scan.next().charAt(0);

        if (burgerAsk == 'Y' || burgerAsk == 'y') {
            System.out.println(burgerMenu);
            itemType = scan.next().charAt(0);

            System.out.println(numberOfItemsAsk);
            numberOfItems = scan.nextByte();

            switch (itemType) {
                case 'A','a':
                    orderDetails = orderDetails + "\n" + numberOfItems + "- Cheeseburger: $" + (numberOfItems * cheeseBurgerPrice);
                    totalPrice += (numberOfItems * cheeseBurgerPrice);
                    break;
                case 'B','b':
                    orderDetails = orderDetails + "\n" + numberOfItems + "- McChicken: $" + (numberOfItems * mcChickenPrice);
                    totalPrice += (numberOfItems * mcChickenPrice);
                    break;
                case 'C','c':
                    orderDetails = orderDetails + "\n" + numberOfItems + "- Big Mac: $" + (numberOfItems * bigMacPrice);
                    totalPrice += (numberOfItems * bigMacPrice);
            }
        }

// ================================================================================================================

        System.out.println("Would you like a drink?" + typeYorN);
        char drinkAsk = scan.next().charAt(0);

        if (drinkAsk == 'Y' || drinkAsk == 'y') {
            System.out.println(drinkMenu);
            itemType = scan.next().charAt(0);

            System.out.println(numberOfItemsAsk);
            numberOfItems = scan.nextByte();

            switch (itemType) {
                case 'A','a':
                    orderDetails = orderDetails +  "\n" + numberOfItems + "- Coke: $" + (numberOfItems * cokePrice);
                    totalPrice += (numberOfItems * cokePrice);
                    break;
                case 'B','b':
                    orderDetails = orderDetails + "\n" + numberOfItems + "- Diet Coke: $" + (numberOfItems * dietCokePrice);
                    totalPrice += (numberOfItems * dietCokePrice);
                    break;
                case 'C','c':
                    orderDetails = orderDetails + "\n" + numberOfItems + "- Sprite: $" + (numberOfItems * spritePrice);
                    totalPrice += (numberOfItems * spritePrice);
            }
        }

// ================================================================================================================

        System.out.println("Would you like a salad?" + typeYorN);
        char saladAsk = scan.next().charAt(0);

        if (saladAsk == 'Y' || saladAsk == 'y') {
            System.out.println(saladMenu);
            itemType = scan.next().charAt(0);

            System.out.println(numberOfItemsAsk);
            numberOfItems = scan.nextByte();

            switch (itemType) {
                case 'A','a':
                    orderDetails = orderDetails + "\n" + numberOfItems + "- Caesar: $" + (numberOfItems * caesarPrice);
                    totalPrice += (numberOfItems * caesarPrice);
                    break;
                case 'B','b':
                    orderDetails = orderDetails + "\n" + numberOfItems + "- Grilled Chicken: $" + (numberOfItems * grilledChickenPrice);
                    totalPrice += (numberOfItems * grilledChickenPrice);
                    break;
                case 'C','c':
                    orderDetails = orderDetails + "\n" + numberOfItems + "- Green salad: $" + (numberOfItems * greenSaladPrice);
                    totalPrice += (numberOfItems * greenSaladPrice);
            }
        }

        System.out.println("************************************");
        System.out.printf(orderDetails + "\n\nYour total: $%.2f", totalPrice);
    }
}
