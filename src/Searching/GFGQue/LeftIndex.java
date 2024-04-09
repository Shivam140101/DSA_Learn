package Searching.GFGQue;

public class LeftIndex {
    public static int firstOccurence(int[] arr , int n , int x){

        int low = 0 , high = n-1;
        while(low <= high){
            int mid = (low + high) / 2;
            if(arr[mid] > x) high = mid -1;
            else if(arr[mid] < x) low = mid + 1;
            else{
                if(mid == 0 || arr[mid-1] != arr[mid]) return mid;
                else high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {1,10,10,10,20,20,20,40};

        int firstOccurence = firstOccurence(arr, arr.length, 20);
        System.out.println(firstOccurence);
    }
}
