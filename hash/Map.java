package lib.hash;

public interface Map<K, V> {
    V get(K key);
    V put(Object key, Object value);
    V remove(Object obj);
    int size();
}
