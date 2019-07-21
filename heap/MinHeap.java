package lib.heap;

import java.util.Arrays;

public class MinHeap implements Heap{
    private final int MAX_SIZE;
    private int size = 0;
    private int[] arr;

    public MinHeap(int ARRAY_SIZE) {
        int maxHeight = 1;
        while ((ARRAY_SIZE = (ARRAY_SIZE >> 1)) != 0) {
            maxHeight++;
        }
        this.MAX_SIZE = (1 << maxHeight) - 1;
        arr = new int[MAX_SIZE + 1];
    }

    public void push(int data) {
        int curIdx = size + 1;
        arr[curIdx] = data;

        while (curIdx != 1) {
            int parentIdx = curIdx / 2;
            if (arr[curIdx] < arr[parentIdx]) {
                swap(arr, curIdx, parentIdx);
            }
            curIdx = parentIdx;
        }
        size++;
    }

    public int peek() {
        return arr[1];
    }

    public int pop() {
        int result = arr[1];
        arr[1] = arr[size];
        arr[size] = 0;
        size--;

        int idx = 1;
        while (idx <= size) {
            int left = arr[idx * 2];
            int right = arr[idx * 2 + 1];

            int nextIdx;
            if (idx * 2 <= size && arr[idx] > left && left <= right) {
                nextIdx = idx * 2;
            } else if (idx * 2 + 1 <= size && arr[idx] > right) {
                nextIdx = idx * 2 + 1;
            } else {
                break;
            }

            swap(arr, idx, nextIdx);
            idx = nextIdx;
        }
        return result;
    }

    private void swap(int[] arr, int idx1, int idx2) {
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
        return Arrays.toString(arr);
    }
}