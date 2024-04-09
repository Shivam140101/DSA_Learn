package Hashing;

import java.util.HashMap;

public class LongestSubArrayWithGivenSum {

    public static int maxLength(int[] arr , int sum){

        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int preSum = 0 , res = 0;

        for (int i = 0; i < arr.length; i++) {
            preSum += arr[i];
            if (preSum == sum) res = i+1;
            if (!map.containsKey(preSum)) map.put(preSum,i);
            if (map.containsKey(preSum-sum)) res = Math.max(res,i-map.get(preSum-sum));
        }
        return res;
    }

    public static void main(String[] args) {

        int[] arr = {5,8,-4,-4,9,-2,-2};
        int sum = 0;

        int maxLength = maxLength(arr, sum);
        System.out.println(maxLength);
    }
}
