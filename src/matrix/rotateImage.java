package matrix;

public class rotateImage {
    public static void main(String[] args) {
        rotateImage rotateImage = new rotateImage();
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        rotateImage.rotate(matrix);
    }
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        /** 4-way swapping
         * temp=bottom left
         * bottom left = bottom right
         * bottom right = top right
         * top right = top left
         * top left = temp
         **/
        for(int i=0;i<(n+1)/2;i++){ // only need to swap 2 values per row, so (n+1)/2;
            // i is for the rings, when i=0, it's the outermost ring
            for(int j=0;j<n/2;j++){ // j is for each element in the ring
                int temp = matrix[n-1-j][i]; //temp=bottom left
                matrix[n-1-j][i] = matrix[n-1-i][n-j-1];
                matrix[n-1-i][n-j-1] = matrix[j][n-1-i];
                matrix[j][n-1-i] = matrix[i][j];
                matrix[i][j] = temp;
            }
        }
    }
}
