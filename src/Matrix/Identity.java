package Matrix;

// Check if an matrix is an identity matrix
public class Identity {

    static boolean isIdentity(int[][] matrix) {

        int row = matrix.length;
        int col = matrix[0].length;

        if(row != col){
            return false;
        }

        for (int i = 0; i < row; i++){
            for(int j=0; j < col; j++){
                if(i == j){
                    if(matrix[i][j] != 1){
                        return false;
                    }
                }else {
                    if(matrix[i][j] != 0){
                        return false;
                    }
                }
            }
        }

        return true;
    }

    public static void main(String args[]){
        int[][] matrix = {{1,0,0,0}, {0,1,0,0}, {0,0,1,0}};
        boolean result = isIdentity(matrix);

        if (result){
            System.out.println("The given matrix is identity matrix");
        }else {
            System.out.println("The given matrix is not an identity matrix");
        }
    }
}