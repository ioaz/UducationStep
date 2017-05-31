package linkedList;

/**
 * Created by ioa on 21.05.17.
 */
public class LinkedListDemo {


    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();


        linkedList.addLast("first");
        linkedList.addLast("second");
        linkedList.addLast("3");

        linkedList.addItemByIndex("3",3);
        linkedList.addItemByIndex("0",0);
        linkedList.addItemByIndex("last", linkedList.size);

        linkedList.remove(0);
        linkedList.remove(23);

        linkedList.printAll(linkedList.size);

    }
}
