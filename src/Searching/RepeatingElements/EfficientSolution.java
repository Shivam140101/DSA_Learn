package Searching.RepeatingElements;

public class EfficientSolution {

    // Time Complexity = O(n)
    public static int repeat(int[] arr , int n){

        boolean[] arr1 = new boolean[n];
        for (int i = 0 ; i < n - 1 ; i++){
            if (arr[i] == arr[i+1])
                return arr[i];
            arr1[arr[i]] = true;
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {0,2,1,3,2,2};
        int repeat = repeat(arr, arr.length);
        System.out.println(repeat);

    }
}
