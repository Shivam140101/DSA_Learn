package Searching.GFGQue;

import java.util.HashMap;
import java.util.Map;

public class CountMoreThanOccurrences {

    public static int countOccurrences(int[] arr , int n , int k){

        HashMap<Integer, Integer> map = new HashMap<>();
        int barrier = n/k;
        int count = 0;

        for (int i=0 ; i < n ; i++) {
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            if (entry.getValue() > barrier) count++;
        }
        return count;
    }

    public static void main(String[] args) {

        int[] arr = {3,1,2,2,1,2,3,3};

        int occurrences = countOccurrences(arr, arr.length, 4);
        System.out.println(occurrences);
    }
}
