package Hashing;

import java.util.HashSet;

public class PairWithGivenSum {

    public static boolean pair(int[] arr , int sum){

        HashSet<Integer> set = new HashSet<Integer>();
        for (int x : arr) {
            if (set.contains(sum-x)) return true;
            else set.add(x);
        }
        return false;
    }

    public static void main(String[] args) {

        int[] arr = {3,2,8,15,-8};
        int sum = 17;

        boolean pair = pair(arr, sum);
        System.out.println(pair);
    }
}
