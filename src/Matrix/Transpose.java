package Matrix;

public class Transpose{

    static void create(int[][] matrix){
        int row = matrix.length;
        int col = matrix[0].length;

        // Create a new matrix array
        int[][] transpose_matrix = new int[col][row];

        // Loop the new array col * row
        for(int i=0; i < col; i++){
            for(int j=0; j < row; j++){
                transpose_matrix[i][j] = matrix[j][i];
            }
        }

        // Print the matrix
        for(int i=0; i < col; i++){
            for(int j=0; j < row; j++){
                System.out.print(transpose_matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        int[][] matrix = {{1,2,3}, {4,5,6}, {7,8,9}};
        // int[][] matrix = {{1,2}, {3,4}, {5,6}};
        create(matrix);
    }
}