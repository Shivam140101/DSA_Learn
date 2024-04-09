package Hashing;

import java.util.HashMap;

public class LongestCommonSpan {

    public static int commonSpan(int[] a , int[] b){

        int[] temp = new int[a.length];
        for (int i = 0; i < a.length; i++)
            temp[i] = a[i] - b[i];

        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int preSum = 0 , res = 0;

        for (int i = 0 ; i < temp.length ; i++) {
            preSum += temp[i];
            if (preSum == 0) res = i+1;
            if (!map.containsKey(preSum)) map.put(preSum,i);
            if (map.containsKey(preSum))
                res = Math.max(res,i-map.get(preSum));
        }
        return res;
    }

    public static void main(String[] args) {

        int[] a = {0,1,0,0,0,0};
        int[] b = {1,0,1,0,0,1};

        int commonSpan = commonSpan(a, b);
        System.out.println(commonSpan);
    }
}
