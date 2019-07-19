package lib.binarySearch;

import static lib.binarySearch.BinarySearch.binarySearch;

class Main {

    private static final int N = 20;

    public static void main(String[] args) {
        int[] array = new int[N];

        for (int i = 0; i < N; i++) {
            array[i] = i + 10;
        }

        int idx = binarySearch(array, 14);
        System.out.println("idx: " +  idx);
        System.out.println("data: " + array[idx]);
    }
}
