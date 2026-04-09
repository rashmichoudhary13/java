package Nqt;//Find the maximum number of leftover cake from 'n' cake while packing it in a group of 1 to n.
//Return the packing group size that has the maximum leftover.

// T.C: O(n)
import java.util.*;

class Leftover{
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int leftover = 0;
        int pack = 0;
        
        for(int i=2; i <=n; i++){
            int left = n % i;
            
            if(left >= leftover){
                pack = i;
                leftover = left;
            }
        }
        
        System.out.println("The answer is: "+ pack);
        sc.close();
    }
} 

// More Optimized version. T.C: O(1)

// class Leftover{
//     public static void main(String[] args) {
//         System.out.println("Enter the number: ");
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
        
//         int pack = n/2 + 1;
        
//         System.out.println("The answer is: "+ pack);
//     }
// } 