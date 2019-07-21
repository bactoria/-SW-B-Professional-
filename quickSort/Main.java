package lib.quickSort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        final int N = 20;
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = (int) (Math.random() * 30);
        }

        System.out.println(Arrays.toString(arr));
        QuickSort.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
