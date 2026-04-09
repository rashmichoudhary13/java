// A magic number is a number whose sum of digit (repeated until a single digit) equals 1.
import java.util.*;

public class Magic {
    static void isMagic(int n){
        int org = n;
        int sum = 0;

        // loop until we get the single digit in sum
        while( n > 9){
            sum = 0;
            while(n != 0) {
                int rem = n % 10;
                sum += rem;
                n = n/10;
            } 
            n = sum;
        }

        if ( sum == 1){
            System.out.println(org + " is a magic number");
        }else{
            System.out.println(org + " is not a magic number");

        }
    }

    public static void main(String args[]){
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = s1.nextInt();
        isMagic(num);
    }
}