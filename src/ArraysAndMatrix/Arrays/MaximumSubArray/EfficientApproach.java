package ArraysAndMatrix.Arrays.MaximumSubArray;

public class EfficientApproach {

    public static int maxSum(int[] arr , int n){

        int res =arr[0];
        int maxEnding = arr[0];

        for (int i=1 ; i < n ; i++){
            maxEnding = Math.max(maxEnding + arr[i], arr[i]);
            res = Math.max(res, maxEnding);
        }
        return res;
    }

    public static void main(String[] args) {

        int[] arr = {2,3,-8,7,-1,2,3};

        int maxSum = maxSum(arr, arr.length);
        System.out.println("Maximum SubArray sum is:- " + maxSum);
    }
}
