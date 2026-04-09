package Array;

class RemoveDuplicate {
    public static void main(String args[]){
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        int i=0, j=0;
        while(j < arr.length){
            if(arr[i] == arr[j]){
                j++;
            } else {
                arr[i+1] = arr[j];
                i++;
                j++;
            }
        }
        System.out.print("Array is: ");
        for(int k=0; k <= i; k++){
            System.out.print(arr[k] + " ");
        }
    }
}