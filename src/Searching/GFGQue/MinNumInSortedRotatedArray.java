package Searching.GFGQue;

public class MinNumInSortedRotatedArray {

    public static int minNumber(int[] arr , int low , int high){

        if (low == high) return arr[low];

        int mid = (low + high) / 2;
        if (arr[mid] > arr[high]) return minNumber(arr,mid+1,high);
        else return minNumber(arr,low,mid);
    }

    public static void main(String[] args) {

        int[] arr = {2,3,4,5,6,7,8,9,10,1};

        int minNumber = minNumber(arr, 0, arr.length - 1);
        System.out.println(minNumber);
    }
}
