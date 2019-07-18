package lib.hash;

import java.util.Arrays;

public class HashMap<K, V> implements Map {
    private int size = 0;
    private int tableCapacity = 10;
    private Node<K, V>[] table = new Node[tableCapacity];

    static class Node<K, V> {
        final K key;
        V value;
        Node<K, V> next;

        Node(K key, V value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "key=" + key +
                    ", value=" + value +
                    ", next=" + next +
                    '}';
        }
    }

    public V put(Object key, Object value) {

        if (table[hash(key) % tableCapacity] == null) {
            table[hash(key) % tableCapacity] = new Node<>((K) key, (V) value);
        } else {
            Node<K, V> e = table[hash(key) % tableCapacity];

            if (e.key == key || e.key.equals(key)) {
                e.value = (V) value;
                System.out.println(Arrays.toString(table));
                System.out.println(size);
                return e.value;
            }

            while (e.next != null) {
                if (e.key == key || e.key.equals(key)) {
                    e.value = (V) value;
                    return e.value;
                }
                e = e.next;
            }
            e.next = new Node<>((K) key, (V) value);
        }
        size++;
        return (V) value;
    }

    private int hash(Object obj) {
        return obj.hashCode();
    }

    public V get(Object key) {
        Node<K, V> e = table[hash(key) % tableCapacity];
        while (e != null) {
            if (e.key == key || e.key.equals(key)) {
                return e.value;
            }
            e = e.next;
        }
        return null;
    }

    public V remove(Object key) {
        Node<K, V> e = table[hash(key) % tableCapacity];

        if (e == null) return null;

        if (e.key == key || e.key.equals(key)) {
            if (e.next == null) {
                table[hash(key) % tableCapacity] = null;
            } else {
                table[hash(key) % tableCapacity] = e.next;
            }
            --size;
            return e.value;
        }

        Node<K, V> newE;
        while ((newE = e.next) != null) {
            if (newE.key == key || newE.key.equals(key)) {
                e.next = newE.next;
                --size;
                return newE.value;
            }
            e = newE;
        }
        return null;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }
}
