package list;

/**
 * Created by ioa on 05.05.17.
 */
public interface List<T>{
    void add(T item);
    void insert(int index, Object item);
    void set(int index, Object item);
    void remove(int index);
    int size();
    T get(int index);


}
