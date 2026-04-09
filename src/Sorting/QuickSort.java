package Sorting;

import java.util.*;

class QuickSort {
    static void quick(int arr[], int low, int high) {
        if(low  <= high ) {
            int pvid = partition(arr, low, high);
            quick(arr, low, pvid-1);
            quick(arr, pvid + 1, high);
        }
    }

    static int partition(int [] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for(int j=low; j < high; j++) {
            if(arr[j] < pivot) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
             }
        }

        //swap with pivot
        i++;
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;
        return i; 
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[] arr;        
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        arr = new int[n];

        System.out.print("Enter the array elements: ");
        for(int  i=0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        sc.close();
        quick(arr, 0, n-1);
        System.out.print("Sorted array: ");
        for(int i=0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        
    }
}