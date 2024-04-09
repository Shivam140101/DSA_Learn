package Searching.IndexOfFirstOccurence;

public class RecursiveSolution {

    public static int firstOccurence(int[] arr , int low , int high , int x){

        if(low > high) return -1;

        int mid = (low + high) / 2;
        if (arr[mid] > x) return firstOccurence(arr,low,mid-1,x);
        else if (arr[mid] < x) return firstOccurence(arr,mid+1,high,x);
        else{
            if (mid == 0 || arr[mid-1] != arr[mid]) return mid;
            else return firstOccurence(arr,low,mid-1,x);
        }
    }

    public static void main(String[] args) {

        int[] arr = {1,10,10,10,20,20,40};

        int firstOccurence = firstOccurence(arr, 0, arr.length - 1, 20);
        System.out.println(firstOccurence);
    }
}
