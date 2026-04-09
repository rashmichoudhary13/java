package String;// Find all substring of a string
import java.util.Scanner;

class Substring {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        sc.close();

        for(int i=0; i <= str.length(); i++){
            for(int j=i+1; j <= str.length(); j++){
                String sub = str.substring(i,j);
                System.out.println(sub);
            }
        }
    }
}