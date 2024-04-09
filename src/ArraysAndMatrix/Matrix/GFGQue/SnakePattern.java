package ArraysAndMatrix.Matrix.GFGQue;

import java.util.ArrayList;

public class SnakePattern {

    public static ArrayList<Integer> snake(int[][] mat){

        ArrayList<Integer> result = new ArrayList<Integer>();

        int rows = mat.length;
        int cols = mat[0].length;

        for (int i = 0; i < rows; i++){
            if (i%2 == 0)
                for (int j = 0; j<cols; j++) result.add(mat[i][j]);
            else
                for (int j = cols-1 ; j >= 0; j--) result.add(mat[i][j]);
        }
        return result;
    }

    public static void main(String[] args) {

        int[][] mat = {{45, 48, 54},
                       {21, 89, 87},
                       {70, 78, 15}};

        ArrayList<Integer> snake = snake(mat);
        System.out.println(snake);
    }
}
