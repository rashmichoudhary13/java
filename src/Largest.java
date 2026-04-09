import java.util.*;


class Largest{
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the Size of array : ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println();
		for(int i=0; i<size;i++){
			System.out.print("Enter the Element in array : ");
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);  // O(n log n)
		int index = size;
		int n = size-1;
		int s = size-2;
		
		System.out.println("Largest Number in Arrays is : " + arr[n]);
		System.out.println("Second Largest Number in Arrays is : " + arr[s]);

		// 2nd method
		// Time complexity: O(n)
        /* 
			// Initialize largest and second largest
			int largest = Integer.MIN_VALUE;
			int secondLargest = Integer.MIN_VALUE;

			for (int num : arr) {
				if (num > largest) {
					// update second largest before updating largest
					secondLargest = largest;
					largest = num;
				} else if (num > secondLargest && num != largest) {
					// update only second largest
					secondLargest = num;
				}
			}

	   */


	}
}