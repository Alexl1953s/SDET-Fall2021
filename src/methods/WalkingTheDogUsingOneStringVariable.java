package methods;

import java.util.Scanner;

public class WalkingTheDogUsingOneStringVariable {

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

        String morning = "Time for morning";
        String afternoon = "Time for afternoon";
        String lunch = "Time for lunch";
        String evening = "Time for evening";

        String timeToDress = " walk\n" +
                "1. dress up put on a jacket\n" +
                "2. put on a hat\n" +
                "3. put on a scarf [optional]\n" +
                "4. wear winter shoes\n" +
                "5. wear gloves\n" +
                "6. dress your dog with warm clothes";

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the time in military format: ");
        short time = scan.nextShort();

        if (time >= 700 && time <= 800) {

            System.out.println(morning + timeToDress);

        } else if (time >= 1200 && time <= 1300) {

            System.out.println(lunch + timeToDress);

        } else if (time >= 1500 && time <= 1600) {

            System.out.println(afternoon + timeToDress);

        } else if (time >= 1900 && time <= 2100) {

            System.out.println(evening + timeToDress);

        }
    }
}
