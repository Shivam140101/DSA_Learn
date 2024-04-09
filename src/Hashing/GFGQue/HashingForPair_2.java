package Hashing.GFGQue;

import java.util.HashMap;

public class HashingForPair_2 {

    public static int sumExists(int[] arr , int n , int sum){

        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for (int i = 0 ; i < n ; i++){
            int num = sum - arr[i];
            if(map.containsKey(num)) return 1;
            else map.put(arr[i],i);
        }
        return 0;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int sumExists = sumExists(arr, arr.length, 14);
        System.out.println(sumExists);

    }
}
