package ArraysAndMatrix.Arrays.GFGQues;

public class MaxOccurredElement {

    public static int maxOccurred(int[] L , int[] R , int n , int max){

        int[] arr = new int[max+2];

        for (int i = 0; i < n ; i++){
            arr[L[i]]++;
            arr[R[i]+1]--;
        }

        int maxSum = arr[0];
        int maxOccurred = 0;

        for (int i=1 ; i<= max ; i++){
            arr[i] += arr[i-1];
            if (arr[i] > maxSum){
                maxSum = arr[i];
                maxOccurred = i;
            }
        }
        return maxOccurred;
    }

    public static void main(String[] args) {

        int[] L = {1,4,3,1};
        int[] R = {15,8,5,4};

        int n = L.length;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, Math.max(L[i], R[i]));
        }

        int maxOccurred = maxOccurred(L, R, n, max);
        System.out.println(maxOccurred);
    }
}
