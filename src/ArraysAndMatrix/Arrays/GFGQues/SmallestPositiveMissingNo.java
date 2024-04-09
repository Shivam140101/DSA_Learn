package ArraysAndMatrix.Arrays.GFGQues;

public class SmallestPositiveMissingNo {

    public static int missingNo(int[] arr , int n){

        for(int i=0 ; i < n ; i++){
            int correctIdx = arr[i] - 1;
            while(0 <= correctIdx && correctIdx <= n-1 && arr[i] != arr[correctIdx]){
                int temp = arr[i];
                arr[i] = arr[correctIdx];
                arr[correctIdx] = temp;

                correctIdx = arr[i] -1;
            }
        }

        for(int i = 0; i < n; i++){
            if (arr[i] != i+1)
                return i+1;
        }
        return n+1;
    }


    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,};

        int missingNo = missingNo(arr, arr.length);
        System.out.println("Smallest missing number: " + missingNo);

    }
}
