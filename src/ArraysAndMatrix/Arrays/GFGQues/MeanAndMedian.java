package ArraysAndMatrix.Arrays.GFGQues;

import java.util.Arrays;

public class MeanAndMedian {

    public static int median(int[] A, int N){

        Arrays.sort(A);
        int mid = N/2;

        if(N%2 == 1)
            return A[mid];
        else
            return (A[mid - 1] + A[mid]) / 2;
    }

    public static int mean(int[] A, int N){
        int res = 0;
        for(int i=0 ; i < N ; i++){
            res += A[i];
        }
        return (res/N);
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 19, 28, 5};
        int mean = mean(arr, arr.length);
        System.out.println("mean: " + mean);

        int median = median(arr, arr.length);
        System.out.println("median: " + median);
    }
}
