package ArraysAndMatrix.Matrix;

public class MatrixSnake {

    public static void printSnake(int[][] mat){

        int row = mat.length;
        int col = mat[0].length;

        for (int i = 0; i < row; i++){
            if (i%2 == 0){
                for (int j = 0; j < col; j++)
                    System.out.print(mat[i][j]+" ");
            }else{
                for (int j = col-1 ; j >= 0; j--)
                    System.out.print(mat[i][j]+" ");
            }
        }
    }

    public static void main(String[] args) {

        int[][] mat = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

        printSnake(mat);
    }
}
