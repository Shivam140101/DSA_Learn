package ArraysAndMatrix.Arrays.MaximumConsecutiveOnes;

public class NaiveSolution {

    public static int maxConsecutiveOnes(int[] arr , int n){

        int res = 0;
        for(int i = 0; i < arr.length; i++){
            int curr = 0;
            for(int j = 1; j < n ; j++){
                if(arr[j] ==1)
                    curr++;
                else
                    break;
            }
            res = Math.max(res,curr);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {0,1,1,1,0,0,1};

        int maxConsecutiveOnes = maxConsecutiveOnes(arr, arr.length);
        System.out.println(maxConsecutiveOnes);
    }
}
