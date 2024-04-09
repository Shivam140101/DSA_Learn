package ArraysAndMatrix.Arrays.MaximumSubArray;

public class NaiveSolution {

    public static int maxSum(int[] arr , int n){

        int res = arr[0];
        for (int i=0 ; i < n ; i++){
            int curr = 0;
            for (int j=i ; j < n ; j++){
                curr += arr[j];
                res = Math.max(res, curr);
            }
        }
        return res;
    }

    public static void main(String[] args) {

        int[] arr = {2,3,-8,7,-1,2,3};

        int sum = maxSum(arr, arr.length);
        System.out.println("Maximum Subarray Sum is:- " + sum);
    }
}
