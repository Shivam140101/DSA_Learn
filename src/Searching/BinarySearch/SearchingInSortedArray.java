package Searching.BinarySearch;

public class SearchingInSortedArray {

    public static int binarySearch(int[] arr , int n , int x){

        int low = 0 , high = n-1;
        while (low <= high){
            int mid = (high + low) / 2;
            if (arr[mid] == x) return mid;
            else if (arr[mid] > x) high = mid - 1;
            else low = mid + 1;
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
        int binarySearch = binarySearch(arr, arr.length, 2);
        System.out.println(binarySearch);
    }
}
