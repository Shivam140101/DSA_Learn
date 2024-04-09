package ArraysAndMatrix.Matrix;

import java.util.Arrays;

public class MedianOfRowWiseSorted {

    public static int median(int[][] mat , int rows , int cols) {

        int min = mat[0][0] , max = mat[0][cols-1];
        for (int i = 1 ; i < rows ; i++){
            if (mat[i][0] < min) min = mat[i][0];
            if (mat[i][cols-1] > max) max = mat[i][cols-1];
        }

        int medPos = (rows * cols + 1) / 2;
        while(min < max){
            int mid = (min + max) / 2;
            int midPos = 0;
            for (int i = 0 ; i < rows ; i++){
                int pos = Arrays.binarySearch(mat[i] , mid)+1;
                midPos += Math.abs(pos);
            }
            if (midPos < medPos) min = mid + 1;
            else max = mid;
        }
        return min;
    }

    public static void main(String[] args) {

        int[][] mat = {{1,10,20},{15,25,35},{5,30,40}};

        int median = median(mat, mat.length, mat[0].length);
        System.out.println(median);
    }
}
