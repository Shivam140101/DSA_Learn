package Searching.BinarySearch;

public class SearchingElementUnsortedArray {
    public static int search(int[] arr , int x , int n){

        for (int i = 0; i < n; i++) {
            if (arr[i] == x) return i;
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {1,5,4,3,7,8,9,2,};

        int search = search(arr, 5, arr.length);
        System.out.println(search);
    }
}
