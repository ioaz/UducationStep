package myCollectionRealisation;

import java.util.NoSuchElementException;

/**
 * Created by ioa on 26.05.17.
 */
public class MyLinkedList<E> implements MyDeque<E> {

    private Node<E> last;

    private Node<E> first;

    private int size = 0;

    public MyLinkedList() {
    }

    @Override
    public int size() {
        return size;
    }

    // methods Deque

    @Override
    public void addLast(E e) {
        final Node<E> l = last;
        final Node<E> newNode = new Node<>(l, e, null);
        last = newNode;
        if (l == null)
            first = newNode;
        else
            l.next = newNode;
        size++;
    }

    @Override
    public void addFirst(E e) {
        final Node<E> f = first; //
        final Node<E> newNode = new Node<>(null, e, f);
        first = newNode;
        if (f == null)
            last = newNode; // ссылка на последний узел
        else
            f.prev = newNode; // ссылка пред-го узла на первый
        size++;
    }

    @Override
    public E removeLast() {
        final Node<E> l = last;
        final E element = l.item;
        Node<E> prev = l.prev;
        if (l == null)
            throw new NoSuchElementException();
        l.item = null;
        l.next = null;
        last = prev;
        size--;
        return element;
    }

    @Override
    public E removeFirst() {
        final Node<E> f = first;
        final E element = f.item;
        Node<E> next = f.next;
        if (f == null)
            throw new NoSuchElementException();
        f.item = null;
        f.next = null;
        first = next;
        size--;
        return element;
    }

    @Override
    public E getFirst() {
        final Node<E> f = first;
        if (f == null)
            throw new NoSuchElementException();
        return f.item;
    }

    @Override
    public E getLast() {
        final Node<E> l = last;
        if (l == null)
            throw new NoSuchElementException();
        return l.item;
    }

    @Override
    public E getItemByIndexOnTheRight(int index) {
        Node<E> target = first;
        for (int i = 0; i < index; i++) {
            target = target.next;
        }
        return target.item;
    }

    // methods Queue

    @Override
    public void add(E e) {
        final Node<E> l = last; // ссылка на последний узел
        final Node<E> newNode = new Node<>(e, null);// новый узел
        last = newNode;//ссылка на последний узел
        if (l == null) {
            first = newNode;//выполняется один раз
        } else {
            l.next = newNode;//присваиваю предудущему узлу ссылку на следующий
        }
        size++;
    }

    @Override
    public E getElementFirst() {
        final Node<E> f = first;
        if (f == null)
            throw new NoSuchElementException();
        return f.item;
    }

    @Override
    public E getElementLast() {
        final Node<E> l = last;
        if (l == null)
            throw new NoSuchElementException();
        return l.item;
    }

    @Override
    public E getElementByIndex(int index) {
        Node<E> target = first; // ссылка на первый узел
        for (int i = 0; i < index; i++) {
            target = target.next; // с каждой итер-ей движемся по очереди пока не доходим до указанного индекса
        }
        return target.item; //возвращаем данные из узла по указанному индексу
    }

    private static class Node<E> {
        E item;
        Node<E> next;
        Node<E> prev;

        // Queue constructor
        Node(E element, Node<E> next) {
            this.item = element;
            this.next = next;
        }

        //Deque constructor
        Node(Node<E> prev, E element, Node<E> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
    }
}
