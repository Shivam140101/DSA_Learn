package ArraysAndMatrix.Arrays;

public class MoveZeroToEnd {

    public static void moveToEnd(int[] array, int n){

        int count = 0;
        for(int i = 0; i < n ; i++){
            if(array[i] != 0){
                int temp = array[i];
                array[i] = array[count];
                array[count] = temp;

                count++;
            }
        }
    }


    public static void main(String[] args) {

        int[] array = {8,5,0,10,0,10};

        System.out.println("Before Moving zero:- ");
        for (int i: array){
            System.out.print(i+" ");
        }

        moveToEnd(array , array.length);

        System.out.println("\nAfter Moving zero:- ");
        for (int i: array){
            System.out.print(i+" ");
        }

    }
}
