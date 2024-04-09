package Hashing;

import java.util.HashSet;

public class SubArrayWithGivenSum {

    public static boolean isSum(int[] arr , int sum){

        HashSet<Integer> set = new HashSet<Integer>();
        int preSum = 0;

        for(int x : arr){
            preSum += x;
            if (preSum == sum) return true;
            if (set.contains(preSum-sum)) return true;
            set.add(preSum);
        }
        return false;
    }

    public static void main(String[] args) {

        int[] arr = {5,8,6,13,3,-1};
        boolean sum = isSum(arr, 22);
        System.out.println(sum);
    }
}
