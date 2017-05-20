package maydays;

/**
 * Created by ioa on 17.05.17.
 */

public class ArrayList<T> implements List<T> {
//    public static class IndexOutOfBoundsException extends Exception {
//
//    }
    private int length;
    private T[] items;
    private T oldValue;

    ArrayList(){
        length = 0;
        items = (T[]) new Object[length];
    }

    public void rangeCheck(int index) {
        if (index >= this.length)
            throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
    }

    public String outOfBoundsMsg(int index) {
        return "Index: " + index + ", Le: " + this.length;
    }

    @Override
    public void add(T item) {
        length += 1;
        T[] old = items;
        items = (T[]) new Object[length];
        for(int i = 0; i < length-1; i++) {
            items[i] = old[i];
        }
        items[length-1] = item;
    }

    @Override
    public int size() {
        return length;
    }

    @Override
    public T remove(int index) {
//        rangeCheck(index);

        oldValue = items[index];
        for (int i = index; i < length - 1; i++)
            items[i] = items[i + 1];
        length--;
        return oldValue;
    }

    @Override
    public T get(int index) {
//        if (index<length)
            return items[index];
//        else System.out.println("ERROR. MAX INDEX IS " + size());
//        return null;
    }

    @Override
    public T set(T item, int index) {
//        rangeCheck(index);

        oldValue = items[index];
        items[index] = item;
        return oldValue;
    }

    @Override
    public void insert(int index, T item) {
        length += 1;
        T[] old = items;
        items = (T[]) new Object[length];
        for (int i = 0; i < length - 1; i++) {
            items[i] = old[i];
        }
        for(int i = length-1; i > index ;i--) {
            items[i] = items[i-1];
        }
        items[index] = item;
    }
}
