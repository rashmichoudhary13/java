package Array;// Move zeroes at the end of array

class MoveZeroes {
    public static void main(String args[]) {
        int[] arr = {1,0,2,3,0,0,4,5,0};
        // pos is used to track where non-zero element will be placed.
        int pos = 0;

        // i is used to track if the no. is zero or not
        for(int i=0; i < arr.length; i++){
            if(arr[i] != 0){
                arr[pos++] = arr[i];
            } 
        }

        // put zero in the end
        for(int k = pos; k < arr.length; k++){
            arr[k] = 0;
        }

        for(int num: arr){
            System.out.print(num + " ");
        }
    }
}