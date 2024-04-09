package Searching.GFGQue;

public class MedianOfTwoSortedArrays {

    public static int getMedian(int[] arr , int[] brr , int n , int m){

        int low = 0 , high = n;
        while (low <= high){
            int midA = (low + high) / 2;
            int midB = (n+m+1)/2 - midA;

            int minA = (midA == n) ? Integer.MAX_VALUE : arr[midA];
            int maxA = (midA == 0) ? Integer.MIN_VALUE : arr[midA - 1];
            int minB = (midB == m) ? Integer.MAX_VALUE : brr[midB];
            int maxB = (midB == 0) ? Integer.MIN_VALUE : brr[midB - 1];

            if (maxA <= minB && maxB <= minA) {
                if ((n + m)%2 ==0)
                    return (Math.max(maxA,maxB) + Math.max(minA,minB))/2;
                else return Math.max(maxA,maxB);
            }else if (maxA > minB) high = midA - 1;
            else low = midA + 1;
        }
        return 0;
    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        int[] brr = {3,4,5,6,7,8};

        int median = getMedian(arr, brr, arr.length, brr.length);
        System.out.println(median);
    }
}
