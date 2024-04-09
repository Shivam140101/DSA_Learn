package Searching.SearchInInfiniteSortedArray;

public class EfficientSolution {

    // Time complexity = O(log n)

    public static int binarySearch(int[] arr, int x , int low , int high){

        if (low > high) return -1;
        int mid = (low + high) / 2;
        if (arr[mid] == x) return mid;
        else if (arr[mid] > x) return binarySearch(arr,x,low,mid-1);
        else return binarySearch(arr,x,mid+1,high);
    }

    public static int search(int[] arr , int n , int x){

        if (arr[0] == x) return 0;
        int i = 1;
        while(arr[i] < x) i *= 2;
        if (arr[i] == x) return i;
        return binarySearch(arr,x,(i/2)+1,i-1);
    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,10,20,30,40,50,70,100,200,300,500,600,700,800,900,1000,
                1100,1200,1300,1400,1500,1600,1700,1800,1900,2000,2100,2200,2300,2400,
                2500,2600,2700,2800,2900,3000};

        int search = search(arr, arr.length, 100);
        System.out.println(search);
    }
}
