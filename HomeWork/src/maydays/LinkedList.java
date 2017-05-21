package maydays;

import java.util.Iterator;

/**
 * Created by ioa on 21.05.17.
 */
public class LinkedList<E> implements Queue<E>, Iterable<E>, DescendingIterator {

    private Node<E> frsNode;
    private Node<E> lstNode;
    private int size = 0;

    public LinkedList(){
        lstNode = new Node<E>(null, frsNode, null);
        frsNode = new Node<E>(null,null, lstNode);
    }

    @Override
    public void addLast(E e) {
        Node<E> prev = lstNode; // еще один указатель что бы не потерять данные
        prev.setCurrentItem(e); // задали текущий елемент (а был null)
        lstNode = new Node<E>(null, prev,null);//заменили старый на новый и задали елемент
        prev.setNextItem(lstNode); // задаем указатель на след элем.
        size++;
    }

    @Override
    public void addFirst(E e) {
    Node<E> next = frsNode;
    next.setCurrentItem(e);
    frsNode = new Node<E>(null,null,next);
    next.setPrevItem(frsNode);
    size++;

    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public E getItemByIndex(int index) {
        Node<E> target = frsNode.getNextItem(); //
        for(int i=0; i<index; i++){
            target = getNextItem(target);
        }
        return target.getCurrentItem();
    }
    private Node<E> getNextItem(Node<E> index){
        return index.getNextItem();
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() { //анонимный класс
            int counter = 0;

            @Override
            public boolean hasNext() {
                return counter < size;
            }

            @Override
            public E next() {
                return getItemByIndex(counter++);
            }
        };
    }

    @Override
    public Iterator<E> descendingIterator() {
        return new Iterator<E>() {
            int counter = size - 1;
            @Override
            public boolean hasNext() {
                return counter>=0;
            }

            @Override
            public E next() {
                return getItemByIndex(counter--);
            }
        };
    }


    private class Node<E> {
        private E item;
        private Node<E> next;
        private Node<E> prev;

        //конструктор узла
        private Node(E element, Node<E> prev, Node<E> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;

        }

        public E getCurrentItem(){
            return item;
        }

        public void setCurrentItem(E item){
            this.item = item;
        }

        public Node<E> getNextItem(){
            return next;
        }

        public void setNextItem(Node<E> next){
            this.next = next;
        }

        public Node<E> getPrevItem(){
            return prev;
        }

        public void setPrevItem(Node<E> prev){
            this.prev = prev;
        }

    }
}
