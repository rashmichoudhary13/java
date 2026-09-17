package Oops;

public class ArrayOperations {
    private int[] arr;

    ArrayOperations(int[] arr){
        this.arr = arr;
    }

    static class Statistics{
        private int sum = 0;

        public int mean(int[] arr){
            for(int num: arr){
                sum += num;
            }

            int avg = sum/arr.length;
            return avg;
        }
    }

    class median{
        public int med(){
            int index = 0;
            if(arr.length % 2 != 0){
                index = arr.length / 2;
            } else {
                index = arr.length / 2;
                int result = (arr[index] + arr[index+1]) / 2;
                return result;
            }
            return arr[index];
        }
    }
}
