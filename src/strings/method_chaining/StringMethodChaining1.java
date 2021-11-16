package strings.method_chaining;

public class StringMethodChaining1 {

    // method chaining is a process of calling one method after another but the rule is
    // to make sure that the return type of the previous method is supported by the next method

    public static void main(String[] args) {

        String animal = " Zebra  ";
        String animalTrimmed = animal.trim();
        String animalUpperCase = animalTrimmed.toUpperCase();
        String animalCharReplaced = animalUpperCase.replace("Z", "J");

        System.out.println(animal);
        System.out.println(animalTrimmed);
        System.out.println(animalUpperCase);
        System.out.println(animalCharReplaced);

        String animalFinal = animal  //animal.trim().toUpperCase().replace("E", "A");
                .trim()
                .toUpperCase()
                .replace("E", "A");

        System.out.println(animalFinal);
    }
}
