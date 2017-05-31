package myCollectionRealisation;

/**
 * Created by ioa on 26.05.17.
 */
public class MyArrayList<E> implements MyList<E> {

    private Object[] itemData;
    private Object[] oldItemData;
    private E oldElem;
    private static final Object[] DEFAULTCAPACITY_EMPTY_ELEMENTDATA = {};

    private static final int DEFAULT_CAPACITY = 10;

    private int size = 0;

    public MyArrayList() {
        this.itemData = DEFAULTCAPACITY_EMPTY_ELEMENTDATA;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public E get(int index) {
        return (E) itemData[index];
    }

    @Override
    public E set(int index, E element) {
        oldElem = (E) itemData[index];
        itemData[index] = element;
        return oldElem;
    }

    @Override
    public void add(int index, E element) {
        size++;
        if (itemData == DEFAULTCAPACITY_EMPTY_ELEMENTDATA && index == 0) {
            itemData = new Object[DEFAULT_CAPACITY];
            itemData[size - 1] = element;

        } else if (index == itemData.length) {
            oldItemData = itemData;
            itemData = new Object[itemData.length + 10];
            for (int i = 0; i < size - 1; i++) {
                itemData[i] = oldItemData[i];
            }
            itemData[size - 1] = element;

        } else if (index < size) {
            oldItemData = itemData;
            itemData = new Object[size];

            for (int i = 0; i < index; i++) {
                itemData[i] = oldItemData[i];
            }
            itemData[index] = element;

            for (int i = index + 1; i < size; i++) {
                itemData[i] = oldItemData[i - 1];
            }

        } else {
            System.out.println("ex");
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    @Override
    public void add(E element) {
        size++;
        if (itemData == DEFAULTCAPACITY_EMPTY_ELEMENTDATA) {
            itemData = new Object[DEFAULT_CAPACITY];
            itemData[size - 1] = element;
        } else if (itemData.length == size - 1) {
            oldItemData = itemData;
            itemData = new Object[itemData.length + 10];
            for (int i = 0; i < size - 1; i++) {
                itemData[i] = oldItemData[i];
            }
            itemData[size - 1] = element;
        } else {
            oldItemData = itemData;
            for (int i = 0; i < size - 1; i++) {
                itemData[i] = oldItemData[i];
            }
            itemData[size - 1] = element;
        }
    }

    @Override
    public E remove(int index) {
        oldElem = (E) itemData[index];
        for (int i = index; i < size - 1; i++) {
            itemData[i] = itemData[i + 1];
        }
        size--;
        return oldElem;
    }

    int getLength() {
        return itemData.length;
    }
}
