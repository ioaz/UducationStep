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
    public void addLast(E e) {
        Node<E> prev = lst; // еще однин указатель
        prev.item = e; // присвоил значение
        lst = new Node<E>(null, null); // страрый узел на новый
        prev.next = lst; // задаю указатель
        size++;
    }

    @Override
    public void addItemByIndex(E e, int index) {
        if (index == size+1) {
            Node<E> prev = lst; // еще однин указатель
            prev.item = e; // присвоил значение
            lst = new Node<E>(null, null); // страрый узел на новый
            prev.next = lst; // задаю указатель
            size++;
        } else {
            Node<E> t = frs; // t -> frs(null, link -> lst)
            final Node<E> newNode = new Node<E>(e, null);
            Node<E> indexLst;
            for (int i = 0; i < index; i++) {
                t = t.next; // t = frs -> lst(item, link -> next lst)
            }
            indexLst = t.next;
            t.next = newNode;
            t = frs.next;
            for (int i = 0; i < index; i++) {
                t = t.next; // t = frs -> lst(item, link -> next lst)
            }
            t.next = indexLst;
            size++;
        }


    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public E getItemByIndex(int index) {
        rangePointer(index);
        Node<E> t = frs; // t -> frs(null, link -> lst)
        for (int i=0; i<index+1; i++){
            t = t.next; // t = frs -> lst(item, link -> next lst)
        }
        return t.item;
    }

    @Override
    public boolean remove(int index) {

        Node<E> frs = this.frs; // head
        Node<E> t = frs.next; // first
        Node<E> n = null;
        if(index == 0) {
            for (int i=0; i<=index; i++){
                frs = frs.next; // t = frs -> lst(item, link -> next lst)
                n = frs.next;
            }
            this.frs.next = n;
            t = null;
        }
        else if (index == size){
            for (int i=0; i<size-1; i++){
                frs = frs.next;
            }
            frs.next = null;
        }
        else {
            for (int i=0; i<index; i++){
                frs = frs.next;
            }
            n = frs;
            for (int i=0; i<=index; i++){
                t = t.next;
            }
            n.next=t;
        }
        size--;
        return true;
    }

    void print (int index){
        rangePointer(index);
            System.out.println(getItemByIndex(index));
    }
    void printAll (int index){
        rangePointer(index);
            for(int i=0; i<index; i++)
                System.out.print(getItemByIndex(i) + ", ");
    }

    void rangePointer(int index){
        if(index > size)
            throw new NullPointerException(outOfBoundsMsg(index));
    }

    private String outOfBoundsMsg(int index) {
        return "Size: "+size;
    }

    private static class Node<E> {
        E item;
        Node<E> next;

        Node(E element, Node<E> next) {
            this.item = element;
            this.next = next;
        }
    }

}