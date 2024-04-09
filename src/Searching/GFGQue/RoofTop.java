package Searching.GFGQue;

public class RoofTop {

    public static int maxSteps(int[] arr , int n){
        int maxStep = 0;
        int currStep = 0;

        for (int i = 1 ; i < n ; i++){
            if (arr[i] > arr[i-1]){
                currStep++;
                maxStep = Math.max(maxStep , currStep);
            }else currStep = 0;
        }
        return maxStep;
    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,4};

        int maxSteps = maxSteps(arr, arr.length);
        System.out.println(maxSteps);
    }
}
