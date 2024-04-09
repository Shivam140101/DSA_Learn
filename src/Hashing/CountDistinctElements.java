package Hashing;

import java.util.HashMap;

public class CountDistinctElements {

    public static void countDistinct(int[] arr , int k){

        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0 ; i < k ; i++)
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        System.out.println(map.size());

        for (int i = k ; i < arr.length ; i++){
            if (map.get(arr[i-k]) == 1) map.remove(arr[i-k]);
            else map.put(arr[i-k] , map.get(arr[i-k])-1);
            map.put(arr[i] , map.getOrDefault(arr[i],0)+1);
            System.out.println(map.size());
        }
    }

    public static void main(String[] args) {

        int[] arr = {10,20,20,10,30,40,10};
        int k = 4;
        countDistinct(arr, k);
    }
}
