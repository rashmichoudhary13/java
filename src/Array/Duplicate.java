package Array;//Check for duplicate element

import java.util.*;
class Duplicate {
    public static void main(String args[]){
        HashSet<Integer> set = new HashSet<>();
        int[] arr = {2,3,4,2,5,7,6};

        for(int num: arr){
            if(set.contains(num)){
                System.out.print("The duplicate element is: " + num);
                return;
            }
            set.add(num);
        }
        System.out.println("There is no duplicate element");
    }
}