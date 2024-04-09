package ArraysAndMatrix.Matrix.GFGQue;

import java.util.Arrays;

public class Multiply {

    public static int[][] multiply(int[][] A , int[][] B){

        int n1 = A.length;
        int m1 = A[0].length;
        int n2 = B.length;
        int m2 = B[0].length;

        if (m1 != n2) return new int[0][0];

        int[][] C = new int[n1][m2];
        for (int i = 0; i < n1; i++){
            for (int j = 0; j < m2; j++){
                int sum = 0;
                for (int k = 0; k < m1; k++){
                    sum += A[i][k] * B[k][j];
                }
                C[i][j] = sum;
            }
        }
        return C;
    }

    public static void main(String[] args) {

        int[][] A = {{1,2,3} , {4,5,6}};
        int[][] B = {{1,2} , {3,4} , {5,6}};

        int[][] multiply = multiply(A, B);
        System.out.println(Arrays.deepToString(multiply));
    }
}
