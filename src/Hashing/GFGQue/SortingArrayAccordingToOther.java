package Hashing.GFGQue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class SortingArrayAccordingToOther {

    public static int[] sort(int[] A1 , int[] A2){

        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int num : A1) map.put(num, map.getOrDefault(num , 0)+1);

        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int num : A2) {
            if (map.containsKey(num)) {
                int count = map.get(num);
                for (int i = 0; i < count; i++) list.add(num);
                map.remove(num);
            }
        }

        ArrayList<Integer> remain = new ArrayList<Integer>(map.keySet());
        Collections.sort(remain);
        for (int num : remain){
            int count = map.get(num);
            for (int i = 0 ; i < count ; i++) list.add(num);
        }

        for(int i = 0 ; i < A1.length ; i++)
            A1[i] = list.get(i);
        return A1;
    }

    public static void main(String[] args) {

        int[] A1 = {2, 1, 2, 5, 7, 1, 9, 3, 6, 8, 8};
        int[] A2 = {2, 1, 8, 3};

        int[] sort = sort(A1, A2);
        for (int num : sort)
            System.out.print(num+" ");
    }
}
