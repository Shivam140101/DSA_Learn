package ArraysAndMatrix.Matrix;

public class printBoundary {

    public static void Boundary(int[][] mat){

        int row = mat.length;
        int col = mat[0].length;

        if(row == 1)
            for (int i = 0 ; i < col ; i++)
                System.out.print(mat[0][i]+" ");
        else if (col == 1)
            for (int i = 0 ; i < row ; i++)
                System.out.println(mat[i][0]+" ");
        else{
            for (int i = 0 ; i < col ; i++)
                System.out.print(mat[0][i]+" ");
            for (int i = 1 ; i < row ; i++)
                System.out.print(mat[i][col-1]+" ");
            for (int i = col-2 ; i >= 0 ; i--)
                System.out.print(mat[row-1][i]+" ");
            for (int i = row-2 ; i >= 1 ; i--)
                System.out.print(mat[i][0] + " ");
        }
    }

    public static void main(String[] args) {

        int[][] mat = {{1,2,3,4} , {5,6,7,8} , {9,10,11,12} , {13,14,15,16}};

        Boundary(mat);
    }
}
