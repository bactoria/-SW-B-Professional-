package lib.quickSort;

public class QuickSort {

    public static void sort(int[] arr) {
        sort(arr, 0, arr.length - 1);
    }

    private static void sort(int[] arr, final int start, final int end) {
        if (start >= end) {
            return;
        }

        final int pivot = start;
        final int pivotData = arr[pivot];

        int left = start + 1;
        int right = end;

        while (left < right) {
            while (arr[left] <= pivotData && left < right) left++;
            while (arr[right] >= pivotData && left < right) right--;

            swap(arr, left, right);
        }

        int nextPivot = left;
        if (pivotData < arr[nextPivot]) {
            nextPivot -= 1;
        }

        swap(arr, pivot, nextPivot);

        sort(arr, start, nextPivot - 1);
        sort(arr, nextPivot + 1, end);
    }

    private static void swap(int[] arr, int idx1, int idx2) {
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }

}
