package Searching.MedianOfTwoSortedArrays;

import java.util.Arrays;

public class NaiveSolution {


    // Time Complexity = O(N * log(N))
    public static double getMedian(int[] arr1 , int[] arr2 , int n1 , int n2){

        int[] temp = new int[n1+n2];
        if (n1 >= 0) System.arraycopy(arr1, 0, temp, 0, n1);
        if (n2 >= 0) System.arraycopy(arr2, 0, temp, n1, n2);
        Arrays.sort(temp);

        if (temp.length %2 == 0)
            return (double) (temp[temp.length / 2] + temp[(temp.length / 2) - 1]) /2;
        else return  temp[(temp.length/2)];

    }

    public static void main(String[] args) {

        int[] arr1 = {10,20,30,40,50};
        int[] arr2 = {5,15,25,35,45};

        double median = getMedian(arr1, arr2, arr1.length, arr2.length);
        System.out.println(median);
    }
}
