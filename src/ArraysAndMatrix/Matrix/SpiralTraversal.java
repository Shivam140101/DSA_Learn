package ArraysAndMatrix.Matrix;

public class SpiralTraversal {


    public static void printSpiral(int[][] mat , int rows, int cols){

        int top = 0 , left = 0;

        while (top < rows && left < cols){

            for (int i = left ; i < cols ; i++)
                System.out.print(mat[top][i]+" ");
            top++;

            for (int i = top ; i < rows ; i++)
                System.out.print(mat[i][cols-1]+" ");
            cols--;

            if (top < rows){
                for (int i = cols-1 ; i >= left ; i--)
                    System.out.print(mat[rows-1][i]+" ");
                rows--;
            }
            if (left < cols){
                for (int i = rows-1 ; i >= top ; i--)
                    System.out.print(mat[i][left]+" ");
                left++;
            }
        }
    }

    public static void main(String[] args) {

        int[][] mat = {{1,2,3,4} , {5,6,7,8} , {9,10,11,12} , {13,14,15,16}};

        printSpiral(mat,mat.length,mat[0].length);
    }
}
