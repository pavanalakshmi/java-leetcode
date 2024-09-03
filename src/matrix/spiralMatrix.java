package matrix;

import java.util.ArrayList;
import java.util.List;

public class spiralMatrix {
    public static void main(String[] args) {
        spiralMatrix spiralMatrix = new spiralMatrix();
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(spiralMatrix.spiralOrder(matrix));
    }
    public List<Integer> spiralOrder(int[][] matrix) {
        int rows = matrix.length, cols = matrix[0].length;
        int rowBegin = 0, colBegin = 0, rowEnd = rows-1, colEnd = cols-1;
        List<Integer> output = new ArrayList<>();

        while(rowBegin<=rowEnd && colBegin<=colEnd){
            // traverse right
            for(int i=colBegin;i<=colEnd;i++){
                output.add(matrix[rowBegin][i]);
            }
            rowBegin++;

            // traverse down
            for(int i=rowBegin;i<=rowEnd;i++){
                output.add(matrix[i][colEnd]);
            }
            colEnd--;

            // traverse left
            if(rowBegin<=rowEnd){
                for(int i=colEnd;i>=colBegin;i--){
                    output.add(matrix[rowEnd][i]);
                }
            }
            rowEnd--;

            //traverse up
            if(colBegin<=colEnd){
                for(int i=rowEnd;i>=rowBegin;i--){
                    output.add(matrix[i][colBegin]);
                }
            }
            colBegin++;
        }
        return output;
    }
}
