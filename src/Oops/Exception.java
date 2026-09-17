package Oops;

import java.util.Scanner;

public class Exception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int first = sc.nextInt();
        System.out.println("Enter the second number: ");
        int second = sc.nextInt();

        try{
            int result = first / second;
            System.out.println("Result is: " + result);
        } catch(ArithmeticException e){
            if(e.getMessage().equals("/ by zero")){
                System.out.println("Diveded by Zero Error");
            } else{
                throw e;
            }
        }
    }
}
