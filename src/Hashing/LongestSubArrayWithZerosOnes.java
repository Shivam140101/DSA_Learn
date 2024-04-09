package Hashing;

import java.util.HashMap;

public class LongestSubArrayWithZerosOnes {

    public static int zeroesOnes(int[] arr){

        for (int i = 0; i < arr.length; i++)
            if (arr[i] == 0) arr[i] = -1;

        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int preSum = 0 , res = 0;

        for (int i = 0; i < arr.length; i++) {
            preSum += arr[i];
            if (preSum == 0) res = i+1;
            if (!map.containsKey(preSum)) map.put(preSum,i);
            if (map.containsKey(preSum))
                res = Math.max(res,i-map.get(preSum));
        }
        return res;
    }

    public static void main(String[] args) {

        int[] arr = {1,0,1,1,1,0,0};
        int zeroesOnes = zeroesOnes(arr);
        System.out.println(zeroesOnes);
    }
}
