package ArraysAndMatrix.Matrix.Basic;

public class Creating2DArray {
    public static void main(String[] args) {

        int m=2 , n=3;
        int[][] arr = new int[m][n];

        for (int i=0; i<arr.length; i++) {
            for (int j=0; j<arr[i].length; j++){
                arr[i][j] = 10;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
