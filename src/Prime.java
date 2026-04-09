import java.util.*;

public class Prime {

    static void isPrime(int num) {
        // num is 1 or less than 1 is not prime
        if( num <= 1){
            System.out.println(num + " is not prime");
            return;
        }

        //O(n)
        // num divisible by digit 2 to num-1 is not prime
        for ( int i = 2; i < num; i++){
            if( num % i == 0){
                System.out.println(num + " is not prime");
                return;
            }
        }

        //O(√n)
        // for ( int i = 2; i*i <= n ; i++){ // i <= sqrt(n)
        //     if( num % i == 0){
        //         System.out.println(num + " is not prime");
        //         return;
        //     }
        // }

        System.out.println(num + " is prime");
    }

    public static void main(String args[]){
        Scanner s1 = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = s1.nextInt();
        isPrime(num);
    }
}