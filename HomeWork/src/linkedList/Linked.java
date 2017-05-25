package linkedList;

/**
 * Created by ioa on 21.05.17.
 */
public interface Linked<E> {

    void addLast(E e);
    void addItemByIndex(E e, int index);
    int size();
    E getItemByIndex(int index);
    boolean remove(int index);


}
