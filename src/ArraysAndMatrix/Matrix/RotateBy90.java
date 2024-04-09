package ArraysAndMatrix.Matrix;

public class RotateBy90 {

    public static void rotate(int[][] mat){

        int rows = mat.length;
        int cols = mat[0].length;

        for (int i = 0; i < rows; i++)
            for (int j = i+1; j < cols; j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }

        for(int i = 0; i < rows; i++){
            int low = 0 , high = rows-1;
            while(low < high){
                int temp1 = mat[low][i];
                mat[low][i] = mat[high][i];
                mat[high][i] = temp1;

                low++;
                high--;
            }
        }

        for (int i = 0; i < rows ; i++){
            for (int j = 0; j < cols ; j++)
                System.out.print(mat[i][j]+" ");
            System.out.println();
        }

    }

    public static void main(String[] args) {

        int[][] mat = {{1,2,3} , {4,5,6} , {7,8,9}};

        rotate(mat);
    }
}
