/*
        The JCF provides numerous classes that implement the
        List interface, including LinkedList, ArrayList,
        and Vector. Write code to show how the JCF class ArrayList
        and LinkedList are used to maintain a grocery list. Refer to
        pages 297 - 298 of the textbook.  Verify List methods such as
        "add()", get(), "remove()", "isEmpty()" and "size()" by
        implementing a test program.
*/
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        /* JCF Linked List Startup Test */
        System.out.println("~~~ JCF Linked List Test ~~~");
        LinkedList<Integer> myLinkedList = new LinkedList<>();
        Iterator linkedIter = myLinkedList.iterator();
        if (!linkedIter.hasNext()) {
            System.out.println("The list is empty");
        }

        for (int i = 1; i <= 5; i++) {
            myLinkedList.add(i);
        }

        linkedIter = myLinkedList.iterator();
        while (linkedIter.hasNext()) {
            System.out.println(linkedIter.next());
        }

        System.out.println("First Element: " + myLinkedList.getFirst());
        System.out.println("Last Element: " + myLinkedList.getLast());
        System.out.println("Size: " + myLinkedList.size());
        myLinkedList.removeLast();
        myLinkedList.removeFirst();
        myLinkedList.remove(1);
        System.out.println("Size: " + myLinkedList.size());
        myLinkedList.clear();
        System.out.println("Empty? " + myLinkedList.peekFirst());

        /* JCF Array List Startup Test */
        System.out.println("~~~ JCF Array List Test ~~~");
        ArrayList<String> myArrayList = new ArrayList<>();
        Iterator<String> arrIter;

        myArrayList.add("apple");
        myArrayList.add("bread");
        myArrayList.add("juice");
        myArrayList.add("banana");
        myArrayList.add("carrot");

        System.out.println("Number of items on list: " + myArrayList.size());
        System.out.println("Items in array list are: ");
        arrIter = myArrayList.listIterator();
        while (arrIter.hasNext()) {
            String nextItem = arrIter.next();
            System.out.println(myArrayList.indexOf(nextItem) + ") " + nextItem);
        }
        myArrayList.remove(0);
        myArrayList.remove(2);
        System.out.println("Number of items on list: " + myArrayList.size());
        System.out.println("Item 1: " + myArrayList.get(0));
        myArrayList.clear();
    }
}
