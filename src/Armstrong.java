import java.util.*;
class Armstrong {
    
    public static boolean gcd(int num){
       int len = (int) Math.log10(num) + 1;
       
       int sum = 0;
       int org = num;
       
       while(num != 0){
           int rem = num%10;
           num = num/10;
           int val = (int) Math.pow(rem,len);
           sum += val;
       }
       
       return sum == org;
    }
    
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        
        boolean result = gcd(num);
        System.out.println("result is: " + result);
    }
}