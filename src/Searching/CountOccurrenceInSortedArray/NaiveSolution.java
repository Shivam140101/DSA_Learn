package Searching.CountOccurrenceInSortedArray;

public class NaiveSolution {

    public static int countOccurrences(int[] arr , int n , int x){
        int count = 0;
        for(int i = 0; i < n; i++) if(arr[i] == x) count++;
        return count;
    }

    public static void main(String[] args) {

        int[] arr = {1,10,10,10,20,40};
        int occurrences = countOccurrences(arr, arr.length, 10);
        System.out.println(occurrences);
    }
}
