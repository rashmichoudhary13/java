package String;

import java.util.Scanner;

class Palindrome {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        sc.close();

        String reverse = new StringBuilder(str).reverse().toString();

        if (str.equals(reverse)){
            System.out.println("The given string is palindrome");
        }else{
             System.out.println("The given string is not palindrome");
        }
    }
}