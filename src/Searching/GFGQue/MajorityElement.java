package Searching.GFGQue;

public class MajorityElement {

    public static int majority(int[] arr , int n){
        int res = 0 , count = 1;
        for(int i = 1 ; i < n ; i++){
            if(arr[res] == arr[i]) count++;
            else count--;
            if (count == 0){
                res = i;
                count = 1;
            }
        }

        count = 0;
        for (int i = 0 ; i < n ; i++){
            if (arr[i] == arr[res]) count++;
        }
        if (count > n/2) return arr[res];
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {3,1,3,3,2};

        int majority = majority(arr, arr.length);
        System.out.println(majority);
    }
}
