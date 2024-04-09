package Searching.GFGQue;

import java.util.Arrays;

public class CountOnlyRepeated {

    public static int[] repeat(int[] arr , int n){

        int count = n-(arr[n-1] - arr[0]);
        int low = 0 , high = n-1;

        while (low < high){
            int mid = low+(high-low)/2;
            if (arr[mid] >= (mid+arr[0])) low = mid + 1;
            else high = mid - 1;
        }
        if (count == 1) return new int[] {-1,-1};
        return new int[] {arr[low],count};
    }

    public static void main(String[] args) {

        int[] arr = {2,3,4,5,5};

        int[] repeat = repeat(arr, arr.length);
        System.out.println(Arrays.toString(repeat));
    }
}
