package myCollectionRealisation;

/**
 * Created by ioa on 26.05.17.
 */
public interface MyDeque<E> extends MyQueue<E> {

    void addFirst(E e);

    void addLast(E e);

    E getFirst();

    E getLast();

    E getItemByIndexOnTheRight(int index);


}
