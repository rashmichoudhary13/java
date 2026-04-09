package Array;

class MissingNumber {
    public static void main(String args[]) {
        int[] arr = {1,4,5,2,6,7};
        int n = arr.length+1;
        int nsum = n*(n+1)/2;
        int sum = 0;
        
        for(int num: arr){
            sum += num;
        }

        int missing = nsum - sum;
        System.out.print("Missing number is: " + missing);
    }
}