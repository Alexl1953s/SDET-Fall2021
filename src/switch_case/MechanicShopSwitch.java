package switch_case;

import java.util.Calendar;
import java.util.Scanner;

public class MechanicShopSwitch {

    public static void main(String[] args) {

        double hourlyServicePrice = 40;
        double largeEngineOilChangePrice = 69.99;
        double smallEngineOilChangePrice = 29.99;
        double fluidsCheckServicePrice = 19.99;
        double brakeServicePrice = 299.99;
        double paintJobPrice = 199.99;

        System.out.println("Welcome to our shop. What type of service would you like today? \n" +
                "Choose from the options below:" +
                "\n1. Oil change" +
                "\n2. Fluids check" +
                "\n3. Brake pad change" +
                "\n4. Paint touch up");

        Scanner scanner = new Scanner(System.in);
        char typeOfService = scanner.next().charAt(0);
        System.out.println("Please enter the engine size:");
        int engineSize = (int) Math.ceil(scanner.nextDouble());
        System.out.println();

        String orderTotal = "YOUR TOTAL WITH HOURLY SERVICE CHARGE IS: $";

        switch (typeOfService) {
            case '1':
                if (engineSize > 4) {
                    System.out.println("Large engine has been selected.\n");
                    System.out.println(orderTotal + (largeEngineOilChangePrice + hourlyServicePrice));
                } else {
                    System.out.println("Small engine has been selected.\n");
                    System.out.println(orderTotal + (smallEngineOilChangePrice + hourlyServicePrice));
                }
                break;
            case '2':
                System.out.println("Fluid check has been selected.\n");
                System.out.println(orderTotal + (fluidsCheckServicePrice + hourlyServicePrice));
                break;
            case '3':
                System.out.println("Brake service has been selected.\n");
                System.out.println(orderTotal + (brakeServicePrice + hourlyServicePrice));
                break;
            case '4':
                System.out.println("Paint job has been selected.\n");
                System.out.println(orderTotal + (paintJobPrice + hourlyServicePrice));
                break;
            default:
                System.out.println("Sorry! We currently do not provide this service!");
        }


//        System.out.printf("The price of Oil change is: %.1f%n", oilChangePrice);
//
//        System.out.format("%.2f%n", oilChangePrice * paintJobPrice);
//        System.out.println(oilChangePrice * paintJobPrice);
//
//        Calendar cal = Calendar.getInstance();
//        System.out.format("%tB %te, %tY%n", cal, cal, cal);
    }
}
