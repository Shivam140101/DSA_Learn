package ArraysAndMatrix.Matrix;

public class SearchInSortedMatrix {


    public static void search(int[][] mat , int rows, int cols , int x){

        if (x < mat[0][0]) {
            System.out.println("Not found");
            return;
        }
        if (x > mat[rows-1][cols-1]) {
            System.out.println("Not found");
            return;
        }

        int i = 0 , j = cols-1;
        while(i < rows && j >= 0){
            if (mat[i][j] == x) {
                System.out.println("Fount at " + i + ", " + j);
                return;
            }
            else if(mat[i][j] > x) j--;
            else i++;
        }
        System.out.println("Not Found");
    }

    public static void main(String[] args) {

        int[][] mat = {{10,20,30,40},
                       {15,25,35,45},
                       {27,29,37,48},
                       {32,33,39,50}};
        search(mat,mat.length,mat[0].length,29);
    }
}
