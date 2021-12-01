package collections.arraylist;

import java.util.ArrayList;

public class ArrayListOfObjects {

    // Arraylist is a collection of objects and it implements List interface
    // and it is part of Collection interface. (Collection framework)
    // Arraylist is dynamic where we can create and manipulate it by adding or removing elements
    // from it, the size can change.

    // Arraylist stores objects, primitives by autoboxing them to their corresponding wrapper classes.

    // Arraylist elements can be accessed by their index positions.

    public static void main(String[] args) {

        ArrayList list = new ArrayList(); // list of objects or collection of objects

        list.add(123);
        list.add("123456");
        list.add('k');
        list.add(Boolean.TRUE);

        System.out.println(list);

//        int a = list.get(0);
//        boolean b = list.get(3);
    }

}
