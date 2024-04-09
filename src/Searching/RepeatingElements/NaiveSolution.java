package Searching.RepeatingElements;

import java.util.Arrays;

public class NaiveSolution {

    // Time Complexity = O(nlogn)
    public static int repeat(int[] arr , int n){

        Arrays.sort(arr);
        for (int i = 0 ; i < n-1 ; i++)
            if (arr[i] == arr[i+1]) return arr[i];
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {0,2,1,3,2,2};

        int repeat = repeat(arr, arr.length);
        System.out.println(repeat);
    }
}
