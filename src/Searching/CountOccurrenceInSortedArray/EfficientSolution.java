package Searching.CountOccurrenceInSortedArray;

public class EfficientSolution {

    public static int firstOccurrence(int[] arr , int n , int x){

        int low = 0 , high = n-1;
        while(low <= high){
            int mid = (low + high) / 2;
            if(arr[mid] > x) high = mid-1;
            else if(arr[mid] < x) low = mid+1;
            else{
                if(mid == 0 || arr[mid-1] != arr[mid]) return mid;
                else high = mid-1;
            }
        }
        return -1;
    }

    public static int lastOccurrence(int[] arr , int n , int x){
        int low = 0 , high = n-1;
        while(low <= high){
            int mid = (low + high) / 2;
            if(arr[mid] > x) high = mid-1;
            else if(arr[mid] < x) low = mid+1;
            else{
                if(mid == n-1 || arr[mid+1] != arr[mid]) return mid;
                else low = mid+1;
            }
        }
        return -1;
    }

    public static int countOccurrences(int[] arr , int n , int x){
        int first = firstOccurrence(arr,n,x);
        if (first == -1) return 0;
        else return (lastOccurrence(arr,n,x)-first+1);
    }

    public static void main(String[] args) {

        int[] arr = {1,10,10,10,40};

        int occurrences = countOccurrences(arr, arr.length, 10);
        System.out.println(occurrences);
    }
}
