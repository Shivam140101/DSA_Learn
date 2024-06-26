package ArraysAndMatrix.Matrix;

public class DeterminantOfMatrix {

    public static int determinant(int[][] mat , int N , int n){

        int D = 0;
        if(n == 1) return mat[0][0];

        int[][] temp = new int[N][N];
        int sign = 1;
        for(int f = 0 ; f < n ; f++){
            //getCofactor(mat,temp,0,f,n);
            D += sign * mat[0][f] * determinant(temp,N,n-1);
            sign = -sign;
        }
        return D;
    }

    public static void getCofactor(int[][] mat , int[][] temp, int p , int q, int n){

        int i = 0, j = 0;
        for (int row = 0 ; row < n ; row++){
            for (int col = 0 ; col < n ; col++){
                if (row != p && col != q){
                    temp[i][j++] = mat[row][col];
                    if (j == n-1){
                        j=0;
                        j++;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {

        int[][] mat = {{1,0,2,-1},
                       {3,0,0,5},
                       {2,1,4,-3},
                       {1,0,5,0}};

        int determinant = determinant(mat, mat.length, mat[0].length);
        System.out.println(determinant);
    }
}
