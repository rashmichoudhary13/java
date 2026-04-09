import java.util.*;

class Leap{
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the Year : " );
		int year = sc.nextInt();
		if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
			System.out.println(year + " its a Leap year");
		}else{
			System.out.println(year + " its not a Leap year");
		}
	}
}