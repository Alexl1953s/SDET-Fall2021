package collections.set;

import javax.print.attribute.HashAttributeSet;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class LoopingOverSetElements {

    /**
     * Since Set collection is not index based and there is not order of elements
     * we cannot loop over this collection using indices [index positions]
     *
     * However one way of iterating over set collection is by using enhanced for loop [aka for each]
     * or by using Iterator interface.
     */

    public static void main(String[] args) {

        Set<Character> symbols = new HashSet<>(Arrays.asList('#', '&', '%', '*', '$', '?'));

        System.out.println(symbols);

        for (char c : symbols) {
            System.out.print(c + " ");
        }

        System.out.println();

        /*
            Iterator is an interface used for iterating over collections such as: Set etc.
            boolean hasNext() -> Returns true if the iteration has more elements. [in the collection]
            E next() -> Returns the next element in the iteration.

            Iterator<E> iterator() -> Returns an iterator over the elements in this set.  The elements are
            returned in no particular order (unless this set is an instance of some
            class that provides a guarantee).
         */

        char $symbol = ' ';
        Iterator<Character> setIterator = symbols.iterator();

        while (setIterator.hasNext()) {

            char temp = setIterator.next();
            if( temp == '$') {
                $symbol = temp;
            }
        }

        System.out.println("$ sign was assigned to $symbol var: " + $symbol);
    }
}
