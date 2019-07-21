package lib.heap;

public interface Heap {
    void push(int data);
    int peek();
    int pop();
    boolean isEmpty();
    int size();
}
