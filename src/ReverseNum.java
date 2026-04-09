import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int result = 0;

        while( num != 0){
            int rem = num % 10;
            num = num / 10;
            result = result * 10 + rem;
        }

        System.out.print("The reversed no: " + result);
    }
}
