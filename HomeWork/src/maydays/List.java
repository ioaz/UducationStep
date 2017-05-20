package maydays;

/**
 * Created by ioa on 17.05.17.
 */
public interface List<T> {

    // Returns the number of elements in this list.
    int size();

    //Returns the element at the specified position in this list.
    T get(int index);

    //Replaces the element at the specified position in this list.
    //Returns the element that was removed from the list.
    T set(T item, int index);

    //Inserts the specified element at the last position.
    void add(T item);

    //Inserts the specified element at the specified position in this list.
    void insert(int index, T item);

    //Removes the element at the specified position in this list (optional
    //operation).  Shifts any subsequent elements to the left.
    //Returns the element that was removed from the list.
    T remove(int index);

}
