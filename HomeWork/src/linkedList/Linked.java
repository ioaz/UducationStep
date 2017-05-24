package linkedList;

/**
 * Created by ioa on 21.05.17.
 */
public interface Linked<E> {

    void add(E e);
//    void addFirst(E e);
    int size();
    E getItemByIndex(int index);
}
