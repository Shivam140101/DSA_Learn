package ArraysAndMatrix.Matrix.Operations;

public class Addition {

    public static int[][] add(int[][] arr1 , int[][] arr2 , int m , int n){

        int[][] arr3 = new int[m][n];

        for (int i = 0; i < m ; i++) {
            for (int j = 0; j < n; j++) {
                arr3[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++)
                System.out.print(arr3[i][j] + " ");
        }
        return arr3;
    }

    public static void main(String[] args) {

        int m=2,n=3;

        int[][] arr1 = {{1,2,3},
                        {4,5,6}};

        int[][] arr2 = {{7,8,9},{10,11,12}};

        add(arr1,arr2,m,n);

    }
}
