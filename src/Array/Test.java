package Array;

import java.util.*;

public class Test {
    public static void main(String args[]) {
        int[] arr = {3, 2, 7, 2, 8, 6};

        // Reversing the array
        /*
        int low = 0;
        int high = arr.length -1;

        while(low <= high){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }

        System.out.print("Reversed arr: " );
        for(int num : arr) {
            System.out.print(num + " ");
        }
        */
       HashSet<Integer> set = new HashSet<>();
       for(int i=0; i<arr.length; i++){
            set.add(arr[i]);
        }

        System.out.println("Set is: " + set);
       
    }
}