package lib.list;

public interface List<T> {
    void add(T t);
    boolean isEmpty();
    int size();
    T get(int idx);
    int remove(int index);
}