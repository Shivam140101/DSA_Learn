package ArraysAndMatrix.Matrix.Operations;

public class Subtraction {

    public static void subtract(int[][] arr1 , int[][] arr2 , int m , int n){

        int[][] arr3 = new int[m][n];

        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                arr3[i][j] = arr1[i][j] - arr2[i][j];

        for (int i = 0 ; i < arr3.length ; i++){
            for (int j = 0 ; j < arr3[i].length ; j++)
                System.out.print(arr3[i][j] + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int m = 3 , n=3;

        int[][] arr1 = {{9,9,9} , {9,9,9} , {9,9,9}};
        int[][] arr2 = {{3,3,3} , {3,3,3} , {3,3,3}};

        subtract(arr1, arr2,m,n);


    }
}
