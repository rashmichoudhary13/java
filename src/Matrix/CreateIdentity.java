package Matrix;// Given an integer N, construct and return an N x N identity matrix.
import java.util.*;

public class CreateIdentity {

    static void create(int n) {
        int[][] matrix = new int[n][n];

        for(int i=0; i < n; i++){
            matrix[i][i] = 1;
        }

        // Print the matrix
        for(int i=0; i < n; i++){
            for(int j=0; j < n; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = s1.nextInt();
        create(num);
        s1.close();
    }
}