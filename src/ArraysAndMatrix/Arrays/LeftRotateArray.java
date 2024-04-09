package ArraysAndMatrix.Arrays;

public class LeftRotateArray {

    public static void leftRotate(int[] array){

        int temp = array[0];
        for (int i = 1; i < array.length; i++){
            array[i-1] = array[i];
        }
        array[array.length - 1] = temp;

        
    }


    public static void main(String[] args) {

        int[] array = {1,2,3,4,5};

        System.out.println("Before Rotating:- ");
        for (int i: array)
            System.out.print(i+" ");

        leftRotate(array);

        System.out.println("\nAfter Rotating:- ");
        for (int i: array)
            System.out.print(i+" ");
    }
}
