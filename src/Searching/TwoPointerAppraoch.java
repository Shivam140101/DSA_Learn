package Searching;

public class TwoPointerAppraoch {

    // Time Complexity = O(n^2)
//    public static boolean findPair(int[] arr , int n , int x){
//        for (int i = 0 ; i < n-1 ; i++)
//            for (int j = i+1 ; j < n ; j++)
//                if (arr[i] + arr[j] == x) return true;
//        return false;
//    }

    // Time Complexity = O(n)
    public static boolean findPair(int[] arr , int n , int x) {

        int i = 0 , j = n-1;
        while (i < j){
            if (arr[i] + arr[j] == x) return true;
            else if (arr[i] + arr[j] < x) i++;
            else j--;
        }
        return false;
    }
    public static void main(String[] args) {

        int[] arr = {2,5,8,12,30};

        boolean pair = findPair(arr, arr.length, 17);
        System.out.println(pair);
    }
}
