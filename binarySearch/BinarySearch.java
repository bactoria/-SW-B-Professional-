package lib.binarySearch;

public class BinarySearch {

    public static int binarySearch(int[] arr, int key) {
        return binarySearch(arr, 0, arr.length - 1, key);
    }

    private static int binarySearch(int[] arr, int left, int right, int key) {
        while (left <= right) {

            int mid = (left + right) >>> 1;
            int midVal = arr[mid];

            if (key < midVal) {
                right = mid - 1;
            } else if (midVal < key) {
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

}
