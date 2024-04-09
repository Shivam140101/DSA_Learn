package Hashing.GFGQue;

import java.util.HashSet;

public class HashingForPair_1 {

    public static int checkPair(int[] arr , int n , int sum){

        HashSet<Integer> set = new HashSet<Integer>();

        for (int i=0 ; i < n ; i++) set.add(arr[i]);

        for (int i = 0 ; i < n ; i++){

            if (sum - arr[i] != arr[i]) {
                if (set.contains(sum - arr[i])) return 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int checkPair = checkPair(arr, arr.length, 14);
        System.out.println(checkPair);
    }
}
