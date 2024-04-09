package Searching;

public class FindingTriplet {


    // Time Complexity = O(n^3)
//    public static boolean findTriplet(int[] arr , int n , int x){
//
//        for (int i = 0; i < n-2 ; i++)
//            for (int j = i+1 ; j < n-1 ; j++)
//                for (int k = j+1 ; k < n ; k++)
//                    if (arr[i] + arr[j] + arr[k] == x) return true;
//        return false;
//    }

    public static boolean isPair(int[] arr , int n , int x,int si){

        int i = si , j = n-1;
        while(i < j){
            if(arr[i] + arr[j] == x) return true;
            else if(arr[i] + arr[j] < x) i++;
            else j--;
        }
        return false;
    }

    public static boolean findTriplet(int[] arr , int n , int x){

        // ArraysAndMatrix.Arrays.sort(arr)  if the array is unsorted
        for(int i = 0 ; i < n-2 ; i++)
            if (isPair(arr,n,x-arr[i],i+1)) return true;
        return false;
    }

    public static void main(String[] args) {

        int[] arr = {2,3,4,8,9,20};

        boolean triplet = findTriplet(arr, arr.length, 32);
        System.out.println(triplet);
    }
}
