package Hashing.GFGQue;

import java.util.HashMap;

public class SubArrayWithZeroesAndOnes {

    public static int countZeroesOnes(int[] arr){

        for (int i = 0; i < arr.length; i++)
            if (arr[i] == 0) arr[i] = -1;

        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        int preSum = 0 , count = 0;
        for (int j : arr) {
            preSum += j;
            if (preSum == 0) count++;
            if (map.containsKey(preSum)) count += map.get(preSum);
            if (map.containsKey(preSum))
                map.put(preSum, map.get(preSum) + 1);
            else map.put(preSum, 1);
        }
        return count;
    }

    public static void main(String[] args) {

        int[] arr = {1,0,0,1,0,1,1};
        int zeroesOnes = countZeroesOnes(arr);
        System.out.println(zeroesOnes);
    }
}
