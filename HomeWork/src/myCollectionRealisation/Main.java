package myCollectionRealisation;

/**
 * Created by ioa on 28.05.17.
 */
public class Main {
    public static void main(String[] args) {

        //ArrayList

        MyArrayList<Integer> myArrayList = new MyArrayList<Integer>();

        System.out.println("ArrayList:\n");
        for(int i=0; i<10;i++) {
            myArrayList.add(i);
        }

        myArrayList.add(10,555);
        myArrayList.add(0,555);
        myArrayList.add(5,555);

        myArrayList.set(4, 44);

        myArrayList.remove(5);

        System.out.println("length = " + myArrayList.size());
        for(int i=0; i<myArrayList.size();i++) {
            System.out.print(myArrayList.get(i) + " ");
        }

        //Queue

        MyQueue<String> myQueue = new MyLinkedList<>();

        System.out.println("\nQueue:\n");
        myQueue.add("first");
        myQueue.add("2");
        myQueue.add("3");
        myQueue.add("last");

        System.out.println("removeFirst: " + myQueue.removeFirst());

        System.out.println("first: " + myQueue.getElementFirst());

        System.out.println("last: " + myQueue.getElementLast());

        for (int i = 0; i < myQueue.size();i++){

            System.out.print(myQueue.getElementByIndex(i) + ", ");
        }

        System.out.println("\nsize = " + myQueue.size());

        //Deque

        MyDeque<String> myDeque = new MyLinkedList<>();

        System.out.println("\nDeque:\n");
        myDeque.addFirst("3");
        myDeque.addFirst("2");
        myDeque.addFirst("1");

        myDeque.addLast("4");
        myDeque.addLast("5");
        myDeque.addLast("6");

        System.out.println("removeFirst: " + myDeque.removeFirst());

        System.out.println("removeLast: " + myDeque.removeLast());


        for (int i = 0; i < myDeque.size(); i++) {

            System.out.print(myDeque.getItemByIndexOnTheRight(i) + ", ");
        }

        System.out.println("\nfirst element: " + myDeque.getFirst());
        System.out.println("last element: " + myDeque.getLast());
    }
}
