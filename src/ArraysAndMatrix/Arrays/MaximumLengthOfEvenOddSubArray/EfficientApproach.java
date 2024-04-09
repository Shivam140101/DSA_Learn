package ArraysAndMatrix.Arrays.MaximumLengthOfEvenOddSubArray;

public class EfficientApproach {

    public static int maxEvenOdd(int[] arr , int n){

        int res =1 , curr = 1;
        for (int i=1 ; i < n ; i++){
            if((arr[i]%2 ==0 && arr[i-1]%2 != 0) || (arr[i]%2 != 0 && arr[i-1]%2 == 0)){
                curr++;
                res = Math.max(res,curr);
            }else
                curr = 1;
        }
        return res;
    }

    public static void main(String[] args) {

        int[] arr = {10,12,14,7,8};

        int maxEvenOdd = maxEvenOdd(arr, arr.length);
        System.out.println(maxEvenOdd);

    }
}
