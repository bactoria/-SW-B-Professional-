package lib.heap;

import java.io.IOException;

/**
 * @author Bactoria
 * @since 2019-07-21 [2019.7월.21]
 */

public class Main {
    public static void main(String[] args) throws IOException {
        final int SIZE = 10;

        Heap heap = new MinHeap(SIZE);
        heap.push(35);
        heap.push(4);
        heap.push(11);
        heap.push(4);
        heap.push(9);
        System.out.println("SIZE: " + heap.size());

        System.out.println(heap.pop());
        System.out.println(heap.pop());
        System.out.println(heap.pop());
        System.out.println(heap.pop());
        System.out.println(heap.pop());
        System.out.println("SIZE: " + heap.size());
    }
}