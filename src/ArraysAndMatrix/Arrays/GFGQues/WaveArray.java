package ArraysAndMatrix.Arrays.GFGQues;

public class WaveArray {

    public static void wave(int[] arr , int n){

        for(int i = 1; i < n ; i+= 2){
            int temp = arr[i];
            arr[i] = arr[i-1];
            arr[i-1] = temp;
        }
    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        System.out.println("Before wave:- ");
        for (int i: arr)
            System.out.print(i+" ");

        wave(arr , arr.length);

        System.out.println("\nAfter wave:- ");
        for (int i: arr)
            System.out.print(i+" ");
    }
}
