import java.util.*;

//O(n)
class MyReverse{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String str = sc.nextLine();
		
		System.out.println(); 
		
		String reverse =new StringBuilder(str).reverse().toString();
		System.out.println("Reverse String :" + reverse);
	} 
}