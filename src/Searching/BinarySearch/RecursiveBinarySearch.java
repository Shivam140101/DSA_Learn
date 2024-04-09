package Searching.BinarySearch;

public class RecursiveBinarySearch {


    // Time Complexity = O(log n)
    public static int recSearch(int[] arr , int x , int low , int high){
        if (low > high) return -1;
        int mid = (low + high) / 2;
        if (arr[mid] == x) return mid;
        else if (arr[mid] > x) return recSearch(arr,x,low,mid -1);
        else return recSearch(arr,x,mid+1,mid);
    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        int recSearch = recSearch(arr, 2, 0, arr.length - 1);
        System.out.println(recSearch);
    }
}
