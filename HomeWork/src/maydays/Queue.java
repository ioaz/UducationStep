package maydays;

/**
 * Created by ioa on 21.05.17.
 */
public interface Queue<E> {

    void addLast(E e);
    void addFirst(E e);
    int size();
    E getItemByIndex(int index);
}
