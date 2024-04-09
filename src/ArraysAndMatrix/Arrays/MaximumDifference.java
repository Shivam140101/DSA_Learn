package ArraysAndMatrix.Arrays;

public class MaximumDifference {

    public static int maxDifference(int[] arr , int n){

        int res = arr[1] - arr[0];
        int minValue = arr[0];

        for (int j=1 ; j < n ; j++) {
            res = Math.max(res, arr[j] - minValue);
            minValue = Math.min(minValue , arr[j]);
        }
        return res;
    }


    public static void main(String[] args) {

        int[] arr = {2,3,10,6,4,8,1};

        int maxDifference = maxDifference(arr, arr.length);
        System.out.println("Max difference: " + maxDifference);
    }
}
