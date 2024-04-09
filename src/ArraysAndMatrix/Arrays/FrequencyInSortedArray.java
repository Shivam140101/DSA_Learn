package ArraysAndMatrix.Arrays;

public class FrequencyInSortedArray {

    public static void printFreq(int[] arr , int n){

        int freq = 1;
        int i=1;

        while(i < n){
            while(i < n && arr[i] == arr[i-1]){
                freq++;
                i++;
            }
            System.out.println(arr[i-1]+" occurred " + freq + " times");
            i++;
            freq = 1;
        }
        if (n == 1 || arr[n-1] != arr[n-2]){
            System.out.println(arr[n-1]+" occurred " + 1 + " times");
        }
    }


    public static void main(String[] args) {

        int[] arr = {10,10,10,25,30,30};
        int n = arr.length;

        printFreq(arr, n);
    }
}
