package ArraysAndMatrix.Arrays.TrappingRainWater;

public class OptimizedApproach {

    public static int getWater(int[] arr, int n){

        int left =0;
        int right = n-1;
        int leftMax = 0;
        int rightMax = 0;
        int res = 0;

        while(left <= right){
            if(rightMax <= leftMax){
               res += Math.max(0,(rightMax-arr[right]));
               rightMax = Math.max(rightMax,arr[right]);
               right -= 1;
            }else{
                res += Math.max(0,(leftMax-arr[left]));
                leftMax = Math.max(leftMax,arr[left]);
                left += 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {

        int[] arr = {1 ,1, 5, 2, 7, 6, 1, 4, 2, 3};
        int water = getWater(arr, arr.length);
        System.out.println(water);

    }
}
