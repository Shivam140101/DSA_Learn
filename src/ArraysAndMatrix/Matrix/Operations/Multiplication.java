package ArraysAndMatrix.Matrix.Operations;

public class Multiplication {

    public static void multiply(int[][] arr1 , int[][] arr2 , int m , int n){

        int[][] arr3 = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++){
                arr3[i][j] = 0;
                for (int k = 0; k < n; k++)
                    arr3[i][j] += arr1[i][k] * arr2[k][j];
            }
        }

        for (int i = 0 ; i < arr3.length ; i++){
            for (int j = 0 ; j < arr3[i].length ; j++)
                System.out.print(arr3[i][j] + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {


        int[][] A = {{1,2,3} , {4,5,6}};
        int[][] B = {{1,2} , {3,4} , {5,6}};

        multiply(A, B,3,2);
    }
}
