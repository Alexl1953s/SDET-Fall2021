package methods;

public class MethodThatTakesParam {

    // methods can take 0 or more parameters
    // and those parameters are local to that method only

    // if we pass more than one parameters to our method
    // then they have to be separated by comma and each parameter
    // should have data type before the parameter name

    public static void sayHiToStudent (String studentName, int studentAge) {

        System.out.println("Hello " + studentName + ". You are " + studentAge);

    }

    public static void main(String[] args) {

        sayHiToStudent("Mansur", 67);
    }
}
