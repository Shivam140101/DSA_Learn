package ArraysAndMatrix.Arrays.GFGQues;

public class MinAdjacentDiffInACircularArray {

    public static int minDiff(int[] arr , int n){

        int res = Math.abs(arr[0] - arr[1]);
        for (int i = 2 ; i < n ; i++)
            res = Math.min(res,Math.abs(arr[i] - arr[i-1]));
        res = Math.min(res,Math.abs(arr[n-1] - arr[0]));
        return res;
    }

    public static void main(String[] args) {

        int[] arr = {8,-8,9,-9,10,-11,12};

        int minDiff = minDiff(arr, arr.length);
        System.out.println(minDiff);
    }
}
