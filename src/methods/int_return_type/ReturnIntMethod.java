package methods.int_return_type;

public class ReturnIntMethod {


    public static void main(String[] args) {

        int x = 5;

        ReturnIntMethod myObject = new ReturnIntMethod(); // creating an object of ReturnIntMethod class
        int res = myObject.subtractValue(2); // we are calling non static method
        // thus we are creating an object of ReturnIntMethod class

        System.out.println(res);
    }

    int subtractValue(int num) {

        int result; // result variable is local to subtractValue() only
        result = 5 - num;

        addNumber(result);

        return result;
    }

    int addNumber (int num) {

        int result = 4; // result variable is local to addNumber() method only
        return num + result;
    }
}
