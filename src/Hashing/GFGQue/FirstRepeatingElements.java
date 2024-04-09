package Hashing.GFGQue;

import java.util.HashMap;

public class FirstRepeatingElements {

    public static int firstRepeat(int[] arr){

        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for (int num : arr) map.put(num , map.getOrDefault(num,0)+1);

        for (int i = 0; i < arr.length; i++)
            if (map.get(arr[i]) > 1)
                return i+1;
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {1, 5, 3, 4, 3, 5, 6};
        int repeat = firstRepeat(arr);
        System.out.println(repeat);
    }
}
