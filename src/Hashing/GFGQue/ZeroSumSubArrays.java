package Hashing.GFGQue;

import java.util.HashMap;

public class ZeroSumSubArrays {

//    public static int sumZero(int[] arr){
//
//        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
//        int count = 0 , sum = 0;
//
//        for (int j : arr) {
//            sum += j;
//            if (sum == 0) count++;
//            if (map.containsKey(sum)) count += map.get(sum);
//            if (map.containsKey(sum)) map.put(sum, map.get(sum) + 1);
//            else map.put(sum, 1);
//        }
//        return count;
//    }

    public static int sumZero(int[] arr){

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int sum = 0 , count = 0;
        map.put(0,1);

        for (int j : arr) {
            sum += j;
            if (map.containsKey(sum)) count += map.get(sum);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {

        int[] arr = {0,0,5,5,0,0};
        int zero = sumZero(arr);
        System.out.println(zero);
    }
}
