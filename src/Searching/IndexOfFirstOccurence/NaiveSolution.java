package Searching.IndexOfFirstOccurence;

public class NaiveSolution {

    // Time Complexity = O(n)
    public static int firstOccurence(int[] arr , int n , int x){
        for(int i=0; i<n; i++){
            if(arr[i] == x)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {1,10,10,10,20,20,20,40};
        int firstOccurence = firstOccurence(arr, arr.length, 20);
        System.out.println(firstOccurence);
    }
}
