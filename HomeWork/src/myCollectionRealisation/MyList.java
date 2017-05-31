package myCollectionRealisation;

/**
 * Created by ioa on 26.05.17.
 */
public interface MyList<E> extends MyCollection<E> {

    int size();

//    boolean isEmpty();

//    boolean contains(Object o);

    E get(int index);

    E set(int index, E element);

    void add(int index, E element);

    void add(E element);

    E remove(int index);

//  int indexOf(Object o);

}

