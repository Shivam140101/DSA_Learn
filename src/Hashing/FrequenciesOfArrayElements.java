package Hashing;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FrequenciesOfArrayElements {

    public static void printFrequencies(int[] arr , int n){

        //HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        LinkedHashMap<Integer,Integer> map = new LinkedHashMap<Integer,Integer>();
        for (int i = 0 ; i < n ; i++){
            int num = arr[i];
            if (map.containsKey(num)) map.put(num, map.get(num)+1);
            else map.put(num,1);
        }

        //System.out.println(map);

        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + "->" + entry.getValue());
        }
    }

    public static void main(String[] args) {

        int[] arr = {10,12,10,15,10,12,20,12};

        printFrequencies(arr,arr.length);
    }

}
