package matrix;

public class setMatrixZeroes {
    public static void main(String[] args) {
        setMatrixZeroes setMatrixZeroes = new setMatrixZeroes();
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        setMatrixZeroes.setZeroes(matrix);
    }

    public void setZeroes(int[][] matrix) {
        boolean firstRow = false, firstCol = false;

        // modify first row and first column
        for(int i=0;i<matrix.length;i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    if (i == 0) {firstRow = true;}
                    if (j == 0) {firstCol = true;}
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }
        // inner matrix
        for(int i=1;i<matrix.length;i++){
            for(int j=1;j<matrix[0].length;j++){
                if(matrix[0][j]==0 || matrix[i][0]==0){
                    matrix[i][j]=0;
                }
            }
        }
        if(firstRow){
            for(int j=0;j<matrix[0].length;j++){
                matrix[0][j]=0;
            }
        }
        if(firstCol){
            for(int i=0;i<matrix.length;i++){
                matrix[i][0]=0;
            }
        }

    }
}
