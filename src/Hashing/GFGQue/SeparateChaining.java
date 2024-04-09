package Hashing.GFGQue;

import java.util.ArrayList;

public class SeparateChaining {

    public static ArrayList<ArrayList<Integer>> chaining(int[] arr , int n , int hashSize){
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            result.add(new ArrayList<>());
        }

        for (int v: arr)
            result.get(v % hashSize).add(v);
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {92,4,14,24,44,91};

        ArrayList<ArrayList<Integer>> list = chaining(arr, arr.length, 10);
        System.out.println(list);
    }
}
