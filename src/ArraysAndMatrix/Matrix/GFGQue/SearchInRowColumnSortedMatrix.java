package ArraysAndMatrix.Matrix.GFGQue;

public class SearchInRowColumnSortedMatrix {

    public static boolean search(int[][] mat , int rows , int cols , int x){

        if (x < mat[0][0]) return false;
        if (x > mat[rows-1][cols-1]) return false;

        int i = 0 , j = cols-1;
        while(i < rows && j >= 0){
            if (mat[i][j] == x) return true;
            else if (mat[i][j] > x) j--;
            else i++;
        }
        return false;
    }

    public static void main(String[] args) {

        int[][] mat = {{ 3, 30, 38},
                       {36, 43, 60},
                       {40, 51, 69}};

        boolean search = search(mat, mat.length, mat[0].length, 30);
        System.out.println(search);
    }
}
