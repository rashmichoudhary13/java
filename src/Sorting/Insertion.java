package Sorting;

class Insertion {

    //Logic
    // Start from the second element
    // Compare it with the previous elements
    // Shift bigger elements to the right
    // Insert the current element in the correct position
    
    static void insertionSort(int[] arr) {
        for(int i=1; i < arr.length; i++) {
            int current = arr[i];
            int j = i-1;
            while(j >=0 && current  < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }

            arr[j+1] = current;
        }
    }
    public static void main(String args[]) {
          int[] arr = {7,8,3,1,2};
        insertionSort(arr);
        System.out.print("Sorted array: ");
        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}