package Searching.IndexOfLastOccurence;

public class RecursiveSolution {

    public static int lastOccurence(int[] arr , int n , int low , int high , int x){

        if(low > high) return -1;
        int mid = (low + high) / 2;
        if (arr[mid] > x) return lastOccurence(arr,n,low,mid-1,x);
        else if(arr[mid] < x) return lastOccurence(arr,n,mid+1,high,x);
        else{
            if (mid == n-1 || arr[mid+1] != arr[mid]) return mid;
            else return lastOccurence(arr,n,mid+1,high,x);
        }
    }

    public static void main(String[] args) {

        int[] arr = {1,10,10,10,20,20,40};

        int lastOccurence = lastOccurence(arr, arr.length, 0, arr.length - 1, 20);
        System.out.println(lastOccurence);
    }
}
