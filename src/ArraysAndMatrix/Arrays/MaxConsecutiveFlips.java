package ArraysAndMatrix.Arrays;

public class MaxConsecutiveFlips {

    public static void maxFlips(int[] arr , int n){

        for (int i=1 ; i < n ; i++){
            if (arr[i] != arr[i-1]){
                if (arr[i] != arr[0])
                    System.out.print("From "+i+" to ");
                else
                    System.out.println(i-1);
            }
        }
        if (arr[n-1] != arr[0])
            System.out.println(n-1);
    }

    public static void main(String[] args) {

        int[] arr = {1,1,0,0,0,0,1};
        maxFlips(arr,arr.length);
    }
}
