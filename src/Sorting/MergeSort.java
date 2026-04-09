package Sorting;

import java.util.*;

class MergeSort {

    static void conquer(int[] arr, int si, int mid, int ei) {
        int[] merged = new int[ei-si+1];
        int k = 0;
        int idx1 = si;
        int idx2 = mid + 1;

        while(idx1 <= mid && idx2 <= ei) {
            if(arr[idx1] >= arr[idx2]){
               merged[k++] = arr[idx2++];
            } else {
                merged[k++] = arr[idx1++];
            }
        }

        while(idx1 <= mid) {
            merged[k++] = arr[idx1++];
        }

        while(idx2 <= ei) {
            merged[k++] = arr[idx2++];
        }

       
        for(int i=0, j=si; i < merged.length; i++, j++){
            arr[j] = merged[i];
        }
    }

    static void divide(int[] arr, int si, int ei) {
        if(si >= ei){
            return;
        }
        int mid = (si+ei)/2;
        divide(arr,si, mid);
        divide(arr, mid+1, ei);
        conquer(arr, si, mid, ei);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[] arr;
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        arr = new int[n];
        System.out.println("Enter the elements of array: ");
        for(int i=0; i < n; i++){
            arr[i] = sc.nextInt();  
        }
        sc.close();
        divide(arr, 0, n-1);
        System.out.print("Sorted array :  ");
        for(int i=0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }

        
}