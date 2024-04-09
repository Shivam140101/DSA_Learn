package ArraysAndMatrix.Arrays.MaxCircularSubArray;

public class NaiveSolution {

    public static int maxSum(int[] arr , int n){

        int res = arr[0];
        for (int i=0 ; i < n ; i++){
            int currMax = arr[i];
            int currSum = arr[i];
            for (int j=1 ; j < n ; j++){
                int index = (i + j) % n;
                currSum += arr[index];
                currMax = Math.max(currMax, currSum);
            }
            res = Math.max(res, currMax);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {5,-2,3,4};

        int sum = maxSum(arr, arr.length);
        System.out.println(sum);
    }
}
