import java.util.*;
class Replace{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sentence : " );
		String sent = sc.nextLine();
		String result = sent.replace(" ","%20");
		System.out.println("Answer is : " + result );
		
	}
}