package methods;

import java.util.Scanner;

public class WalkingDogWithMethod {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the time in military format: ");
        short time = scan.nextShort();

        String morning = "Time for morning";
        String afternoon = "Time for afternoon";
        String lunch = "Time for lunch";
        String evening = "Time for evening";

        if (time >= 700 && time <= 800) {

            walkTheDog(morning); // the argument here is "morning" which will be assigned to timeOfDay parameter

        } else if (time >= 1200 && time <= 1300) {

           walkTheDog(afternoon); // the argument here is "afternoon" which will be assigned to timeOfDay parameter

        } else if (time >= 1500 && time <= 1600) {

            walkTheDog(lunch); // the argument here is "lunch" which will be assigned to timeOfDay parameter

        } else if (time >= 1900 && time <= 2100) {

           walkTheDog(evening); // the argument here is "evening" which will be assigned to timeOfDay parameter

        }

    }

    public static void walkTheDog(String timeOfDay){

        String timeToDress = timeOfDay + " walk\n" +
                "1. dress up put on a jacket\n" +
                "2. put on a hat\n" +
                "3. put on a scarf [optional]\n" +
                "4. wear winter shoes\n" +
                "5. wear gloves\n" +
                "6. dress your dog with warm clothes";

        System.out.println(timeToDress);

    }
}
