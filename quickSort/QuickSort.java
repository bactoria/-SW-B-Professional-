package lib.quickSort;

public class QuickSort {

    public static void sort(int[] arr) {
        sort(arr, 0, arr.length - 1);
    }

    private static void sort(int[] arr, final int start, final int end) {
        if (start >= end) {
            return;
        }

        int pivotData = arr[start];
        int pivot = start;

        int left = start + 1;
        int right = end;

        while (left < right) {
            while (arr[left] <= pivotData && left < right) left++;
            while (arr[right] >= pivotData && left < right) right--;

            swap(arr, left, right);
        }

        if (pivotData < arr[left]) {
            swap(arr, left - 1, pivot);
            pivot = left - 1;
        } else {
            swap(arr, left, pivot);
            pivot = left;
        }
        sort(arr, start, pivot - 1);
        sort(arr, pivot + 1, end);

    }

    private static void swap(int[] arr, int idx1, int idx2) {
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }

}
