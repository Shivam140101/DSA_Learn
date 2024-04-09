package Searching.GFGQue;

public class SearchingInSortedArray {

    public static int sortedSearch(int[] arr , int n , int k){

        int low = 0 , high = n-1;
        while (low <= high){
            int mid = (low + high) / 2;
            if (arr[mid] == k) return 1;
            else if (arr[mid] > k) high = mid -1;
            else low = mid +1;
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        int sortedSearch = sortedSearch(arr, arr.length, 6);
        System.out.println(sortedSearch);
    }
}
