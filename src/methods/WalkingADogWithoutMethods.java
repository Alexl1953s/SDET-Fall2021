package methods;

import java.util.Scanner;

public class WalkingADogWithoutMethods {

    public static void main(String[] args) {

        // you have to walk your dog outside few times a day
        // if it's a winter time

        // morning walk 07:00 to 08:00
        // lunch walk 12:00 to 13:00
        // afternoon walk 15:00 to 16:00
        // evening walk 19:00 to 21:00

        // 1. dress up put on a jacket
        // 2. put on a hat
        // 3. put on a scarf [optional]
        // 4. wear winter shoes
        // 5. wear gloves
        // 6. dress your dog with warm clothes

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the time in military format: ");
        short time = scan.nextShort();

        if (time >= 700 && time <= 800) {
            System.out.println("Time for morning walk");
            System.out.println("1. dress up put on a jacket");
            System.out.println("2. put on a hat");
            System.out.println("3. put on a scarf [optional]");
            System.out.println("4. wear winter shoes");
            System.out.println("5. wear gloves");
            System.out.println("6. dress your dog with warm clothes");
        } else if (time >= 1200 && time <= 1300) {
            System.out.println("Time for lunch walk");
            System.out.println("1. dress up put on a jacket");
            System.out.println("2. put on a hat");
            System.out.println("3. put on a scarf [optional]");
            System.out.println("4. wear winter shoes");
            System.out.println("5. wear gloves");
            System.out.println("6. dress your dog with warm clothes");
        } else if (time >= 1500 && time <= 1600) {
            System.out.println("Time for afternoon walk");
            System.out.println("1. dress up put on a jacket");
            System.out.println("2. put on a hat");
            System.out.println("3. put on a scarf [optional]");
            System.out.println("4. wear winter shoes");
            System.out.println("5. wear gloves");
            System.out.println("6. dress your dog with warm clothes");
        } else if (time >= 1900 && time <= 2100) {
            System.out.println("Time for evening walk");
            System.out.println("1. dress up put on a jacket");
            System.out.println("2. put on a hat");
            System.out.println("3. put on a scarf [optional]");
            System.out.println("4. wear winter shoes");
            System.out.println("5. wear gloves");
            System.out.println("6. dress your dog with warm clothes");
        }
    }
}
