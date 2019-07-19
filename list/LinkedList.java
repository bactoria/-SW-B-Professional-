package lib.list;

import java.util.Iterator;

public class LinkedList<T> implements List<T>, Iterable<T> {

    private int size = 0;
    private Node<T> first;
    private Node<T> last;

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            int cursor = 0;

            @Override
            public boolean hasNext() {
                return cursor != size;
            }

            @Override
            public T next() {
                return get(cursor++);
            }
        };
    }

    class Node<T> {
        T data;
        Node<T> prev;
        Node<T> next;

        Node(T t) {
            this.data = t;
        }
    }

    @Override
    public void add(T t) {
        Node<T> newNode = new Node<>(t);

        if (size == 0) {
            first = newNode;
            last = newNode;
        } else {
            Node<T> oldNode = last;
            oldNode.next = newNode;
            newNode.prev = oldNode;
            last = newNode;
        }

        size++;
    }

    @Override
    public String toString() {
        Node<T> node = first;
        String s = "";
        while (node != null) {
            s += node.data + " ";
            node = node.next;
        }
        return s;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public T get(int idx) {
        return findNode(idx).data;
    }

    private Node<T> findNode(int idx) {
        Node<T> node;

        if (idx < (size >> 1)) {
            node = first;
            while (idx > 0) {
                node = node.next;
                --idx;
            }
        } else {
            node = last;
            while (idx < size - 1) {
                node = node.prev;
                ++idx;
            }
        }
        return node;
    }

    @Override
    public int remove(int idx) {
        // TODO Auto-generated method stub
        Node<T> target = findNode(idx);
        Node<T> prev = target.prev;
        Node<T> next = target.next;

        if (prev != null) {
            prev.next = next;
        }

        if (next != null) {
            next.prev = prev;
        }

        size--;
        return idx;
    }

}