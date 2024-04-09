package ArraysAndMatrix.Arrays.WindowSliding;

public class EfficientAppraoch {

    public static int maxSum(int[] arr , int n , int k){

        int curr=0;
        for (int i=0 ; i < k ; i++)
            curr += arr[i];
        int res = curr;
        for (int i=k ; i < n ; i++){
            curr += arr[i]-arr[i-k];
            res = Math.max(res,curr);
        }
        return res;
    }

    public static void main(String[] args) {

        int[] arr = {1,8,30,-5,20,7};

        int maxSum = maxSum(arr, arr.length, 3);
        System.out.println(maxSum);
    }
}
