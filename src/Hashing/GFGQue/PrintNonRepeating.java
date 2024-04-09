package Hashing.GFGQue;

import java.util.ArrayList;
import java.util.HashMap;

public class PrintNonRepeating {

    public static ArrayList<Integer> printNonRepeating(int[] arr , int n){

        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for (int i = 0 ; i < n ; i++){
            int num = arr[i];
            if (map.containsKey(num)) map.put(num,map.get(num)+1);
            else map.put(num,1);
        }

        System.out.println(map);

        ArrayList<Integer> result = new ArrayList<Integer>();

        for (int num : arr)
            if (map.get(num) == 1) result.add(num);
        return result;
    }

    public static void main(String[] args) {

        int[] arr = {1,1,2,2,3,3,4,5,6,7};

        ArrayList<Integer> list = printNonRepeating(arr, arr.length);
        System.out.println(list);
    }
}
