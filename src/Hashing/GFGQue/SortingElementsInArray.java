package Hashing.GFGQue;

import java.util.*;

public class SortingElementsInArray {

    public static ArrayList<Integer> sort(int[] arr , int n){

        HashMap<Integer,Integer> map = new HashMap<>();
        for (int num : arr)
            map.put(num, map.getOrDefault(num, 0)+1);

        ArrayList<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a,b) -> b.getValue().compareTo(a.getValue()) == 0 ?
                 a.getKey().compareTo(b.getKey()) : b.getValue().compareTo(a.getValue()));
        ArrayList<Integer> result = new ArrayList<>();
        for (Map.Entry<Integer,Integer> entry : list){
            int num = entry.getKey();
            int count = entry.getValue();
            while (count > 0){
                result.add(num);
                count--;
            }
        }
        return result;
    }

    public static void main(String[] args) {

        int[] arr = {5,5,4,6,4};
        ArrayList<Integer> sort = sort(arr, arr.length);
        System.out.println(sort);
    }
}
