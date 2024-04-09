package ArraysAndMatrix.Arrays.GFGQues;

public class MajorityElements {

    public static int majority(int[] arr , int n , int x , int y){
        int xCount = 0 , yCount = 0;

        for (int i = 0; i < n ; i++){
            if (arr[i] == x) xCount++;
            else if (arr[i] == y) yCount++;
        }

        if (xCount == yCount)
            return Math.min(x, y);
        else if (xCount > yCount)
            return x;
        return y;
    }

    public static void main(String[] args) {

        int[] arr = {1,1,2,2,3,3,4,4,4,4,5};
        int majority = majority(arr, arr.length, 4, 5);
        System.out.println(majority);
    }
}
