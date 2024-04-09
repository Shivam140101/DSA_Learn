package ArraysAndMatrix.Arrays.GFGQues;

public class ArrayInsertAtTheEnd {

    public static void insert(int[] arr , int n , int x){

        arr[n-1] = x;
    }

    public static void main(String[] args) {
        int[] arr = new int[4];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;

        System.out.println("Before Inserting: ");
        for (int i: arr)
            System.out.print(i+" ");

        insert(arr , arr.length , 4);

        System.out.println("\nAfter Inserting: ");
        for (int i: arr)
            System.out.print(i+" ");
    }
}
