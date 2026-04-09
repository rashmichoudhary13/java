import java.util.Scanner;

class MyJava{
	public static void main(String[] args){
        Scanner sc =new Scanner(System.in);

        System.out.print("Enter any number : " );
        int num =sc.nextInt();

        int result = num % 10;
        System.out.println("Last Number is : " + result);
    }		
}
