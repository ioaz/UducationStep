package list;

/**
 * Created by ioa on 16.05.17.
 */
public class DynamicArray<T> implements List<T>{
    private int length;
    private T[] items;

    DynamicArray(){
        length = 0;
        items = (T[]) new Object[length];
    }

    @Override
    public void add(T item) {
        length +=1;
        T[] old = items;
        items = (T[])new Object[length];
        for (int i=0; i<length-1; i++)
            items[i] = old[i];
        items [length-1] = item;
    }

    @Override
    public void insert(int index, Object item) {

    }

    @Override
    public void set(int index, Object item) {

    }


    @Override
    public void remove(int index) {

        for (int i = index; i < length - 1; i++) {
            items[i] = items[i+1];
        }
        length --;

    }

    @Override
    public int size() {
        return length;
    }

    @Override
    public T get(int index) {
        if (index<length)
            return items[index];
        return null;
    }
}
