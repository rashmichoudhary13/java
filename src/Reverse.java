import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Using StringBuilder for easy reversal
        String reversed = new StringBuilder(str).reverse().toString();
        
        System.out.println("Reversed String: " + reversed);
        // System.out.println("type of: " + reversed.getClass().getSimpleName());
    }
}
