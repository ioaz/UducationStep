package linkedList;

import java.util.LinkedList;

/**
 * Created by ioa on 21.05.17.
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> linkedListString = new LinkedList<String>();

        linkedListString.add("a");
        linkedListString.add("c");
        linkedListString.add("e");
        linkedListString.add("d");
        linkedListString.add("f");
        linkedListString.addLast("z");
        linkedListString.addFirst("b");
        linkedListString.add(1,"b2");

        System.out.println(linkedListString);

        linkedListString.remove("b2");
        linkedListString.remove(4);

        System.out.println(linkedListString);

        linkedListString.removeFirst();
        linkedListString.removeLast();

        System.out.println(linkedListString);

        String val = linkedListString.get(2);
        linkedListString.set(2, val+ " change");

        System.out.println(linkedListString);
    }
}
