package Searching.GFGQue;

public class PeakElement {

    public static int getPeak(int[] arr , int n){

        int low = 0 , high = n-1;
        while (low <= high){
            int mid = (low + high) / 2;
            if((mid == 0 || arr[mid] >= arr[mid-1]) && (mid == n-1 || arr[mid] >= arr[mid+1]))
                return arr[mid];
            if (mid > 0 && arr[mid] <= arr[mid-1]) high = mid - 1;
            else low = mid + 1;
        }
        return 0;
    }

    public static void main(String[] args) {

        int[] arr = {1,2,3};

        int peak = getPeak(arr, arr.length);
        System.out.println(peak);
    }
}
