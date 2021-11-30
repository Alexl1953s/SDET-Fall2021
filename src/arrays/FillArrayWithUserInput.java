package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FillArrayWithUserInput {

    public static void main(String[] args) {

        String[] domesticAnimals = {"Dog", "Cat", "Parrots", "Goats"};

        String catElement = domesticAnimals[1];
        System.out.println(catElement);

        String kittyElement = "Kitty";

        domesticAnimals[1] = kittyElement;
        System.out.println(domesticAnimals[1]);

        System.out.println("The size of this array is: " + domesticAnimals.length);

//        domesticAnimals[4] = "Tigers";
//        System.out.println(domesticAnimals[4]); This will give index out of bound exception because
        // domesticAnimals array has the size of 4 only

        String python = "Python";
        String gorilla = "Gorilla";

        String[] wildAnimals = {"Eagle", python, "Anaconda", gorilla, "Ostrich"};

        for (String animal : wildAnimals) {

            if (animal.equalsIgnoreCase("python")) {
                System.out.println("I have found python so I will skip to the next animal.");
                continue; // continue statement will skip the iteration to the next element in the array
            }
            else if (animal.equalsIgnoreCase("Gorilla")) {
                System.out.println("I have came across " + animal + ". Terminating now.");
                break;
            }
            else System.out.println(animal);
        }

        // take an input from the user in a loop to fill in this array with animals for the zoo
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the number of animal you want to add: ");

        int numberOfAnimals = scan.nextInt();
        scan.nextLine();

        String[] zooAnimals;
        zooAnimals = new String[numberOfAnimals];

        for (int i = 0; i < zooAnimals.length; i++) {

            System.out.println("Please enter " + (zooAnimals.length-i) + " animals more: ");
            zooAnimals[i] = scan.nextLine();
        }

        System.out.println("Here are the animals in our zoo: " + Arrays.toString(zooAnimals));
    }
}
