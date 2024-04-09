package Hashing.GFGQue;

import java.util.HashMap;

public class CountNonRepeatingElements {

    public static int count(int[] arr , int n){

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0 ;i < n ; i++){
            int num = arr[i];
            if (map.containsKey(num)) map.put(num , map.get(num)+1);
            else map.put(num, 1);
        }

        System.out.println(map);

        int count = 0;
        for (int values : map.values()){
            if (values == 1) count++;
        }
        return count;
    }

    public static void main(String[] args) {

        int[] arr = {1,1,2,2,3,3,4,5,6,7};

        int count = count(arr, arr.length);
        System.out.println(count);
    }
}
