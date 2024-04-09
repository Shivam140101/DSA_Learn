package Hashing.GFGQue;

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

        int[] arr = {4,2,-3,1,6};
        boolean zeroSum = isZeroSum(arr);
        if (zeroSum) System.out.println("YES");
        else System.out.println("NO");
    }
}
