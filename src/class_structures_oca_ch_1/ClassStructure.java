package class_structures_oca_ch_1;

/**
 * The purpose of Javadoc comment is to make the user [developer, programmer] to pay attention to read it.
 * Because these Javadoc comments usually have an important description about the class or sometimes
 * even about the whole application itself. Or it's also used to give info about methods and some parameters
 * that can be used.
 *
 * @by: BahaUson
 */

/*
    Hello World!
    This is a multi line comment [ /* ...  ]
    This is our first class in Java. We will be going over Class Structures and how to add comments to them.
 */
public class ClassStructure {

    public static void main(String[] args) {

        // Adding "//" in the beginning of a line makes it a comment
        // Printing "Hello World!" into the console once this class runs.
        // If we do not have .println() then it's going to print the next output
        // in the same line with this.
        System.out.print("Hello World!"); // this line prints out Hello World
        // Output below this .println() will be on a new line
        System.out.println("Welcome to your first Java class!");
        System.out.println("Java is fun.");

        // In Java System.out.print() will print to the standard out of the system
        // you are using. On the other hand, System.err.print() will print to the standard error.
        System.err.print("This is coming from the standard error output.");
        System.err.println();

        System.err.println("Error output on a new line.");
    }

}
