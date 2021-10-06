package data_types;

/*
 Data types are there to store some information because every piece of
 information needs to get stored in the memory, every information uses a memory in the computer.
 Depending on the data type we use it takes or reserves that much memory from the
 storage of the server or the computer. [EX: age can be easily stored in an int, imagine we use
 long for it and see how much memory it takes up to for social media sites]
 */

public class PrimitiveDataTypes_1 {

    public static void main(String[] args) {
        // Variable names are also camelCase but only the difference is the first letter is lowerCase
        // all variables should have a data type and a name for that variable
        // this process is called declaring a variable
        byte firstByteVariable; // declared a byte type variable name b
        byte b1; // declared a byte type variable name b1

        // variable names cannot be the same
        // there will be a naming conflict

        firstByteVariable = 13; // assigning a value to a variable is called initializing a variable
        System.out.println(firstByteVariable);

        b1 = 127;
        System.out.println(b1);

        // byte b2 = 13;
        byte b2 = firstByteVariable;
        System.out.println(b2);

        int age; // variable declaration
        age = 32; // variable initializing

        int numberOfTires = 4; // this is both declaring and initializing a variable
        System.out.println(numberOfTires);

        int minNum = -2_147_483_647; // underscores are also allowed to be included in the value for whole numbers
        System.out.println(minNum);

        // multiple variables can be declared in one statement
        // but they have to have the same data type
        int numberOfComments = 58, numberOfLikes; int numberOfFollowers = 1_000_000;

        // anything that comes before semi colon - [;] is one statement

//        int numberOfComments;
//        int numberOfLikes;
//        int numberOfFollowers;
        numberOfLikes = 999_000;

        System.out.println(numberOfComments);
        System.out.println(numberOfLikes);
        System.out.println(numberOfFollowers);


    }

}
