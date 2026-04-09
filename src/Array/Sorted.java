package Array;

// Check whether an array is sorted (either ascending or descending)
class Sorted {
    static boolean isSorted(int[] arr) {
        boolean ascending = true;
        boolean descending = true;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                descending = false;
            }
            if (arr[i] > arr[i + 1]) {
                ascending = false;
            }
        }

        return ascending || descending;
    }

    public static void main(String args[]) {
        int[] arr = {7,7,5,4,3,2};
        System.out.println("Is Sorted: " + isSorted(arr));
    }
}
