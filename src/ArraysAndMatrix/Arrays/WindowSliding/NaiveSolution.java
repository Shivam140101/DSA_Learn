package ArraysAndMatrix.Arrays.WindowSliding;

public class NaiveSolution {

    public static int maxSum(int[] arr , int n , int k){

        int res = Integer.MIN_VALUE;
        for (int i=0 ; i+k-1<n ; i++){
            int curr = 0;
            for (int j=0 ; j<k ; j++){
                curr += arr[i+j];
            }
            res = Math.max(res,curr);
        }
        return res;
    }

    public static void main(String[] args) {

        int[] arr = {1,8,30,-5,20,3};

        int maxSum = maxSum(arr, arr.length, 3);
        System.out.println(maxSum);
    }
}
