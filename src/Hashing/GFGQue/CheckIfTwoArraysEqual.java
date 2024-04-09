package Hashing.GFGQue;

import java.util.HashMap;
import java.util.Map;

public class CheckIfTwoArraysEqual {

    public static boolean check(int[] arr1 , int[] arr2 , int n){

        HashMap<Long,Long> map = new HashMap<>();

        for (int i =0 ; i < n ; i++){

            long num = arr1[i];
            if (map.containsKey(num)){
                long freq = map.get(num);
                freq++;
                map.put(num,freq);
            } else
                map.put(num,(long)1);
        }

        for (int i = 0 ; i < n ; i++){
            long num = arr2[i];
            if (map.containsKey(num)){
                long freq = map.get(num);
                freq--;
                map.put(num,freq);
            }
        }

        for (Map.Entry<Long,Long> entry : map.entrySet()){
            if (entry.getValue() != 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

        int[] arr1 = {1,2,5,4,0};
        int[] arr2 = {2,4,5,0,9};

        boolean check = check(arr1, arr2, arr1.length);
        System.out.println(check);
    }
}
