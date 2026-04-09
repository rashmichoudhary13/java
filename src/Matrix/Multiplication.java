package Matrix;

public class Multiplication{

    static void multiply(int[][] matrix1, int[][] matrix2){
        int m1_row = matrix1.length;
        int m1_col = matrix1[0].length;

        int m2_col = matrix2[0].length;

        int[][] result_matrix = new int[m1_row][m2_col];
        int result = 0;

        for(int i=0; i < m1_row; i++){
            for(int j=0; j < m2_col; j++){
                for(int k=0; k < m1_col; k++){
                   result += matrix1[i][k] * matrix2[k][j];
                }
                result_matrix[i][j] = result;
                result = 0;
            }
        }

        // Print the matrix
        for(int i=0; i < m1_row; i++){
            for(int j=0; j < m2_col; j++){
                System.out.print(result_matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        // int[][] matrix1 = {{1,4}, {2,5}, {3,6}};
        // int[][] matrix2 = {{1,3}, {2,4}};
        int[][] matrix1 = {{1,2,6}, {3,4,1}};
        int[][] matrix2 = {{5,2}, {6,1}, {3,4}};
        multiply(matrix1, matrix2);
    }
}