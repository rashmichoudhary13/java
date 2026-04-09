package Array;// Find a union and intersection of two array
import java.util.*;

class Union {
    static void unionAndIntersection (int[] arr1, int[] arr2){
        HashSet<Integer> set = new HashSet<>();

        for(int num: arr1){
            set.add(num);
        }

        System.out.print("Intersection: ");
        for(int num: arr2){
            if(set.contains(num)){
                System.out.print(num + " ");
            }
        }

        System.out.println();
        for(int num: arr2){
            set.add(num);
        }
        System.out.print("Union: " + set);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int[] arr1 = new int[size];

        for(int i=0; i<size; i++){
            System.out.print("Enter the element of array: ");
            arr1[i] = sc.nextInt();
        }

        System.out.println();
        System.out.print("Enter the size of array: ");
        int size2 = sc.nextInt();
        int[] arr2 = new int[size2];

        for(int i=0; i<size2; i++){
            System.out.print("Enter the element of array: ");
            arr2[i] = sc.nextInt();
        }

        unionAndIntersection(arr1,arr2);

        sc.close();
    }
}