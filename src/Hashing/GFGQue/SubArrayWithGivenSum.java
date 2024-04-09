package Hashing.GFGQue;

import java.util.HashMap;

public class SubArrayWithGivenSum {

//    public static int iscount(int[] array , int sum) {
//
//        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
//        int preSum = 0 , count = 0;
//        map.put(0,1);
//
//        for (int x: array) {
//            preSum += x;
//            if (map.containsKey(preSum-sum)) count += map.get(preSum-sum);
//            map.put(preSum,map.getOrDefault(preSum,0)+1);
//        }
//        return count;
//    }

    public static int iscount(int[] array , int sum) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int preSum = 0 , count = 0;

        for (int x: array) {
            preSum += x;

            if (preSum == sum) count++;
            if (map.containsKey(preSum-sum)) count += map.get(preSum-sum);
            if (map.containsKey(preSum)) map.put(preSum,map.get(preSum)+1);
            else map.put(preSum,1);
        }
        return count;
    }

    public static void main(String[] args) {

        int[] array = {10,2,-2,-20,10};
        int iscount = iscount(array, -10);
        System.out.println(iscount);
    }
}
