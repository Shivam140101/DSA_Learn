package Hashing;

import java.util.HashSet;

public class SubArrayWithZeroSum {

    public static boolean isZeroSum(int[] a){

        HashSet<Integer> set = new HashSet<Integer>();
        int preSum = 0;
        for (int j : a) {
            preSum += j;
            if (set.contains(preSum)) return true;
            if (preSum == 0) return true;
            set.add(preSum);
        }
        return false;
    }

    public static void main(String[] args) {

        int[] arr = {1,4,13,-3,-10,5};
        boolean zeroSum = isZeroSum(arr);
        System.out.println(zeroSum);
    }
}
