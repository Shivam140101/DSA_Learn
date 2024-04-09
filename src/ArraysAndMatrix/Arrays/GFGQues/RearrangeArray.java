package ArraysAndMatrix.Arrays.GFGQues;

public class RearrangeArray {

    public static void rearrange(long[] arr , int n){
        long[] arr1 = new long[n];

        for(int i=0 ; i < n ; i++){
            int j = (int) arr[i];
            arr1[i] = arr[j];
        }

        for(int i=0 ; i < n ; i++)
            arr[i] = arr1[i];
    }


    public static void main(String[] args) {

//        Given an array arr[] of size N where every element is in the range from 0 to n-1.
//        Rearrange the given array so that the transformed array arrT[i] becomes arr[arr[i]].
//
//        NOTE: arr and arrT are both same variables, representing the array before and after
//              transformation respectively.

        long[] arr = {4,0,2,1,3};

        System.out.println("Before Rearrange:- ");
        for (long i: arr)
            System.out.print(i+" ");

        rearrange(arr, arr.length);

        System.out.println("\nAfter Rearrange:- ");
        for (long i: arr)
            System.out.print(i+" ");
    }
}
