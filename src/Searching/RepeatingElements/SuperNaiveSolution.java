package Searching.RepeatingElements;

public class SuperNaiveSolution {

    // Time Complexity = O(n^2)
    public static int repeat(int[] arr , int n) {
        for (int i = 0 ; i < n-1 ; i++)
            for (int j = i+1 ; j < n ; j++)
                if (arr[i] == arr[j]) return arr[i];
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {0,2,1,3,2,2};

        int repeat = repeat(arr, arr.length);
        System.out.println(repeat);
    }
}
