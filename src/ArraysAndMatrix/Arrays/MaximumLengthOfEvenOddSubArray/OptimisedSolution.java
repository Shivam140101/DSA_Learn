package ArraysAndMatrix.Arrays.MaximumLengthOfEvenOddSubArray;

public class OptimisedSolution {


    public static int maxEvenOdd(int[] arr , int n){

        if(n==0)
            return 0;

        int maxLength = 0;
        int prevOdd = arr[0] % 2;
        int currLength = 1;

        for(int i=1 ; i < n ; i++){

            if(arr[i]%2 != prevOdd)
                currLength++;
            else
                currLength = 1;
            if (currLength > maxLength)
                maxLength = currLength;
            prevOdd = arr[i]%2;
        }
        return maxLength;
    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5, 3, 7, 2, 9, 4 };
        int maxEvenOdd = maxEvenOdd(arr, arr.length);
        System.out.println(maxEvenOdd);

    }
}
