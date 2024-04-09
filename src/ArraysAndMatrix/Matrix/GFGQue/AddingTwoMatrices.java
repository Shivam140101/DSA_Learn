package ArraysAndMatrix.Matrix.GFGQue;

import java.util.Arrays;

public class AddingTwoMatrices {

    public static int[][] add(int[][] arr1 , int[][] arr2){

        int n1 = arr1.length;
        int m1 = arr1[0].length;
        int n2 = arr2.length;
        int m2 = arr2[0].length;

        if (n1 != n2 || m1 != m2){
            return new int[0][0];
        }

        int[][] result = new int[n1][m1];
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < m1; j++)
                result[i][j] = arr1[i][j] + arr2[i][j];
        }
        return result;
    }

    public static void main(String[] args) {

        int[][] arr1 = {{1,2,3} , {4,5,6}};
        int[][] arr2 = {{1,3,3} , {2,3,3}};

        int[][] add = add(arr1, arr2);
        for (int[] i : add){
            System.out.print(Arrays.toString(i) +" ");
        }
    }
}
