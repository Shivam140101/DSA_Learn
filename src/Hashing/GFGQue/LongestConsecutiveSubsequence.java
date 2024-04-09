package Hashing.GFGQue;

import java.util.HashSet;

public class LongestConsecutiveSubsequence {

    public static int longestSub(int[] arr){

        HashSet<Integer> set = new HashSet<Integer>();
        for (int x:arr)
            set.add(x);

        int res = 1;
        for (Integer x : set){
            if (!set.contains(x-1)){
                int curr = 1;
                while (set.contains(x+curr)) curr++;
                res = Math.max(res, curr);
            }
        }
        return res;
    }

    public static void main(String[] args) {

        int[] arr = {1,9,3,4,2,20};
        int longestSub = longestSub(arr);
        System.out.println(longestSub);
    }
}
