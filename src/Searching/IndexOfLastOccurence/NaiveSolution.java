package Searching.IndexOfLastOccurence;

public class NaiveSolution {

    public static int lastOccurence(int[] arr , int n , int x){

        for (int i = n-1 ; i >= 0 ; i--){
            if (arr[i] == x) return i;
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {1,10,10,10,20,20,40};

        int lastOccurence = lastOccurence(arr, arr.length, 1);
        System.out.println(lastOccurence);
    }
}
