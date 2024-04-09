package Searching.MedianOfTwoSortedArrays;

public class OptimisedApproach {


    // Time Complexity = O(log(min(N1, N2)))
    public static double getMedian(int[] arr1 , int[] arr2 , int n1 , int n2){

        int begin = 0 , end = n1;
        while (begin <= end){
            int i1 = (begin+end)/2;
            int i2 = (n1+n2+1)/2 - i1;
            int min1 = (i1 == n1) ? Integer.MAX_VALUE : arr1[i1];
            int max1 = (i1 == 0) ? Integer.MIN_VALUE : arr1[i1-1];
            int min2 = (i2 == n2) ? Integer.MAX_VALUE : arr2[i2];
            int max2 = (i2 == 0) ? Integer.MIN_VALUE : arr2[i2-1];

            if (max1 <= min2 && max2 <= min1){
                if ((n1+n2)%2==0)
                    return (((double) Math.max(max1, max2) + (double) Math.min(min1, min2)) / 2);
                else return Math.max(max1, max2);
            } else if(max1 > min2) end = i1-1;
            else begin = i1 + 1;
        }
        return 0.0;
    }

    public static void main(String[] args) {

        int[] arr1 = {10,20,30,40,50};
        int[] arr2 = {5,15,25,35,45};

        double median = getMedian(arr1, arr2, arr1.length, arr2.length);
        System.out.println(median);
    }
}
