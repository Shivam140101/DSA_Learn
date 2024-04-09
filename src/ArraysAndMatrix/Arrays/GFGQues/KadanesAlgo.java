package ArraysAndMatrix.Arrays.GFGQues;

public class KadanesAlgo {

    public static long maxSum(int[] arr , int n){

        long res = arr[0];
        long maxEnding = arr[0];

        for (int i=1 ; i<n ; i++){
            maxEnding = Math.max(maxEnding + arr[i], arr[i]);
            res = Math.max(res, maxEnding);
        }
        return res;
    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,-2,5};

        long sum = maxSum(arr, arr.length);
        System.out.println(sum);
    }
}
