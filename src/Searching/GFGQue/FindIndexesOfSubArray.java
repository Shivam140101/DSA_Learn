package Searching.GFGQue;

import java.util.ArrayList;

public class FindIndexesOfSubArray {

    public static ArrayList<Integer> subArraySum(int[] arr , int n , int s){

        int left = 0, right = 0;
        int sum = 0;

        while(right < n){
            sum += arr[right];
            while(sum >= s && left <= right){
                if (sum == s){
                    ArrayList<Integer> result = new ArrayList<Integer>();
                    result.add(left+1);
                    result.add(right+1);
                    return result;
                }
                sum -= arr[left];
                left++;
            }
            right++;
        }
        ArrayList<Integer> result = new ArrayList<Integer>();
        result.add(-1);
        return result;
    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,7,5};

        ArrayList<Integer> list = subArraySum(arr, arr.length, 12);
        System.out.println(list);
    }
}
