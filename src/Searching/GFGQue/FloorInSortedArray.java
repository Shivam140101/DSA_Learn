package Searching.GFGQue;

public class FloorInSortedArray {

    public static int findFloor(int[] arr , int n , int x){
        int start = 0 , end = n-1;
        int res = -1;
        while (start <= end){
            int mid = (start + end)/2;
            if (arr[mid] == x) return mid;
            else if (arr[mid]<x) {
                res = mid;
                start = mid+1;
            }else end = mid -1;
        }
        return res;
    }

    public static void main(String[] args) {

        int[] arr = {1,2,8,10,11,12,19};
        int floor = findFloor(arr, arr.length, 5);
        System.out.println(floor);
    }
}
