package Array;// Find pair with given sum in an array

import java.util.*;
class TwoSum {

    static ArrayList<Integer> pair(int[] arr, int target) {
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i < arr.length; i++){
            int diff = target - arr[i];
            if(map.containsKey(diff)){
                list.add(map.get(diff));
                list.add(i);
            }
            map.put(arr[i], i);
        }

        return list;
    }

    public static void main(String args[]) {
        int[] arr1 = {1,2,3,4,6};
        int target = 5;
        
        ArrayList<Integer> list = pair(arr1, target);

        System.out.println("Pairs are: ");
        
        for(int i=0; i < list.size(); i++){
            System.out.print(arr1[list.get(i)] + " ");

            if(i%2 != 0){
                System.out.println();
            }
        }

    }
}