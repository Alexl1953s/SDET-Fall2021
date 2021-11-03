package methods;

public class CallingMethodWithAnArgumentPassed {

    public static void main(String[] args) {

        sayHi("Devx"); // we are calling the the method sayHi and passing "Devx" as an argument
    }

    // "private" is access modifier for this method "sayHi"
    // meaning that this method can only be called within this class

    private static void sayHi(String str){

        System.out.println(str); // str = "Devx"
    }

}
