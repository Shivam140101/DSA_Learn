package Searching.IndexOfLastOccurence;

public class IterativeSolution {

    public static int lastOccurence(int[] arr , int n , int x){

        int start = 0 , end = n-1;
        while (start <= end){
            int mid = (start+end)/2;
            if (arr[mid] > x) end = mid-1;
            else if(arr[mid] < x) start = mid+1;
            else{
                if(mid == n-1 || arr[mid+1] != arr[mid]) return mid;
                else start = mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {1,10,10,10,20,20,40};

        int lastOccurence = lastOccurence(arr, arr.length, 20);
        System.out.println(lastOccurence);
    }
}
