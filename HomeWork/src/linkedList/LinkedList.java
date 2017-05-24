package linkedList;

/**
 * Created by ioa on 21.05.17.
 */
public class LinkedList<E> implements Linked<E>{

    private Node<E> frs;
    private Node<E> lst;
    int size = 0;

    LinkedList(){
        lst = new Node<E>(null,null);
        frs = new Node<E>(null, lst);
    }

    @Override
    public void add(E e) {
//        System.out.println("frs: " + frs.item + " : " + frs.next + " > ");
        Node<E> prev = lst; // еще однин указатель
        prev.item = e; // присвоил значение
//        System.out.println(lst.item + " : " + lst.next + " > ");
        lst = new Node<E>(null, null); // страрый узел на новый
        prev.next = lst; // задаю указатель
//        System.out.println(prev.item + " > " + prev.next);
        size++;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public E getItemByIndex(int index) {
        Node<E> t = frs.next;
        for (int i=0; i<index; i++){
            t = t.next;
        }
        return t.item;
    }

    private static class Node<E> {
        public E item;
        public Node<E> next;

        Node(E element, Node<E> next) {
            this.item = element;
            this.next = next;
        }
    }

}