package ArraysAndMatrix.Arrays;

public class ReverseArray {

    public static void reverse(int[] array, int n){

        int low = 0 , high = n-1;
        while(low < high){
            int temp = array[low];
            array[low] = array[high];
            array[high] = temp;
            low++;
            high--;
        }
    }


    public static void main(String[] args) {

        int[] array = {10,5,7,30};
        System.out.println("Before Reverse:- ");
        for (int i: array){
            System.out.print(i+" ");
        }

        reverse(array , array.length);

        System.out.println("\nAfter Reverse:- ");
        for (int i: array){
            System.out.print(i+" ");
        }
    }
}
