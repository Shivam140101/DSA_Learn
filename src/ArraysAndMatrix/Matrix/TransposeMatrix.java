package ArraysAndMatrix.Matrix;

public class TransposeMatrix {

    // Naive Solution
//    public static void transpose(int[][] mat){
//
//        int rows = mat.length;
//        int cols = mat[0].length;
//
//        int[][] temp = new int[rows][cols];
//
//        for(int i = 0; i < rows ; i++)
//            for (int j = 0; j < cols ; j++)
//                temp[i][j] = mat[j][i];
//
//        for (int i = 0; i < rows ; i++)
//            for (int j = 0 ; j < cols ; j++)
//                mat[i][j] = temp[i][j];
//
//        for (int i = 0; i < rows ; i++) {
//            for (int j = 0; j < cols; j++)
//                System.out.print(mat[i][j] + " ");
//            System.out.println();
//        }
//    }

    public static void transpose(int[][] mat){

        int rows = mat.length;
        int cols = mat[0].length;

        for (int i = 0; i < rows ; i++)
            for (int j = i+1; j < cols ; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }

        for (int[] ints : mat) {
            for (int j = 0; j < cols; j++)
                System.out.print(ints[j] + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[][] mat = {{1,2,3,4} , {5,6,7,8} , {9,10,11,12} , {13,14,15,16}};

        transpose(mat);
    }
}
