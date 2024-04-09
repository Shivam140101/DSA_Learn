package Hashing;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class CountDistinctElement {

    public static int countDistinct(int[] arr , int n){

        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0 ; i < n ; i++)
            set.add(arr[i]);
        return set.size();
    }


    public static void main(String[] args) {

        int[] arr = {15,12,13,12,13,13,18};
        int i = countDistinct(arr, arr.length);
        System.out.println(i);


    }
}
