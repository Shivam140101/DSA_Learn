package ArraysAndMatrix.Arrays.TrappingRainWater;

public class EfficientApproach {

    public static int findWater(int[] arr , int n){

        int res = 0;
        int[] lMax = new int[n];
        int[] rMax = new int[n];
        lMax[0] = arr[0];

        for (int i=1 ; i<n ; i++)
            lMax[i] = Math.max(arr[i],lMax[i-1]);
        rMax[n-1] = arr[n-1];
        for (int i=n-2 ; i>=0 ; i--)
            rMax[i] = Math.max(arr[i],rMax[i+1]);
        for (int i=1 ; i<n-1 ; i++)
            res += Math.max(0, Math.min(lMax[i], rMax[i]) - arr[i]);
        return res;
    }

    public static void main(String[] args) {

        int[] arr = {1 ,1, 5, 2, 7, 6, 1, 4, 2, 3};

        int water = findWater(arr, arr.length);
        System.out.println("Maximum water stored:- "+water);
    }
}
