package myCollectionRealisation;

/**
 * Created by ioa on 26.05.17.
 */
public interface MyQueue<E> extends MyCollection<E> {

    void add(E e);

    E removeFirst();

    E removeLast();

    E getElementFirst();

    E getElementLast();

    E getElementByIndex(int index);

}
