package Searching.GFGQue;

public class CountOnesInBinary {

    public static int countOnes(int[] arr , int n){

        int low = 0 , high = n-1;
        while(low <= high){
            int mid = (low + high) / 2;
            if(arr[mid] == 0) high = mid - 1;
            else{
                if(mid == n-1 || arr[mid+1] == 0) return mid + 1;
                else low = mid + 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {

        int[] arr = {1,1,1,1,1,0,0,0};
        int countOnes = countOnes(arr, arr.length);
        System.out.println(countOnes);
    }
}
