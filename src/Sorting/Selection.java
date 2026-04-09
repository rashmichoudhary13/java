package Sorting;

class Selection {
    
    static void selectionSort(int[] arr) {
        for(int i=0; i < arr.length-1; i++) {
            int min = i;
            for(int j=i+1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

    public static void main(String args[]) {
        int[] arr = {4,45,32,1,3};
        selectionSort(arr);
        System.out.print("Sorted array: ");
        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}