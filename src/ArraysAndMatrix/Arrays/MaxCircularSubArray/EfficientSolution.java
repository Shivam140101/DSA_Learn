package ArraysAndMatrix.Arrays.MaxCircularSubArray;

public class EfficientSolution {

    public static int maxSum(int[] arr, int n) {

        int res = arr[0];
        int maxEnding = arr[0];
        for (int i = 1; i < n; i++) {
            maxEnding = Math.max(maxEnding + arr[i], arr[i]);
            res = Math.max(res, maxEnding);
        }
        return res;
    }

    public static int overallMaxSum(int[] arr, int n) {

        int maxNormal = maxSum(arr, n);
        if (maxNormal < 0)
            return maxNormal;
        int arrSum = 0;
        for (int i = 0; i < n; i++) {
            arrSum += arr[i];
            arr[i] = -arr[i];
        }
        int maxCircular = arrSum + maxSum(arr, n);
        return Math.max(maxNormal, maxCircular);
    }

    public static void main(String[] args) {
        int[] arr = {5, -2, 3, 4};

        int overallMaxSum = overallMaxSum(arr, arr.length);
        System.out.println(overallMaxSum);
    }
}
