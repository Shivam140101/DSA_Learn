package Searching.PeakElement;

public class NaiveSolution {

    public static int getPeak(int[] arr , int n) {

        if (arr[0] > arr[1]) return arr[0];
        if (arr[n-1] > arr[n-2]) return arr[n-1];

        for (int i = 1 ; i < n-1 ; i++) {
            if (arr[i] > arr[i+1] && arr[i] > arr[i-1]) return arr[i];
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {5,10,20,15,7};
        int peak = getPeak(arr, arr.length);
        System.out.println(peak);
    }
}
