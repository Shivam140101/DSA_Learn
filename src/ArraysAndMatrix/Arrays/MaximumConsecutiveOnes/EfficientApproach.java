package ArraysAndMatrix.Arrays.MaximumConsecutiveOnes;

public class EfficientApproach {

    public static int maxConsecutiveOnes(int[] arr , int n){

        int res =0;
        int curr = 0;

        for(int i = 0; i < n; i++){
            if (arr[i] == 0)
                curr = 0;
            else{
                curr++;
                res = Math.max(res,curr);
            }
        }
        return res;
    }

    public static void main(String[] args) {

        int[] arr = {0,1,1,1,0,1,1,1,1,1,1,0};

        int maxConsecutiveOnes = maxConsecutiveOnes(arr, arr.length);
        System.out.println(maxConsecutiveOnes);
    }
}
