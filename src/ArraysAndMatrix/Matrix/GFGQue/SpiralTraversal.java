package ArraysAndMatrix.Matrix.GFGQue;

import java.util.ArrayList;

public class SpiralTraversal {

    public static ArrayList<Integer> spiral(int[][] matrix , int r , int c){

        ArrayList<Integer> result = new ArrayList<>();
        int top = 0 , left = 0;

        while(top < r && left < c){

            for(int i = left ; i < c ; ++i)
                result.add(matrix[top][i]);
            top++;

            for(int i = top ; i < r ; ++i)
                result.add(matrix[i][c-1]);
            c--;

            if(top < r){
                for(int i = c-1 ; i >= left ; --i )
                    result.add(matrix[r-1][i]);
                r--;
            }
            if(left < c){
                for(int i = r-1 ; i>= top ; --i)
                    result.add(matrix[i][left]);
                left++;
            }
        }
        return result;
    }

    public static void main(String[] args) {

        int[][] mat = {{1,2,3,4} , {5,6,7,8} , {9,10,11,12} , {13,14,15,16}};

        ArrayList<Integer> spiral = spiral(mat, mat.length, mat[0].length);
        System.out.println(spiral);
    }
}
