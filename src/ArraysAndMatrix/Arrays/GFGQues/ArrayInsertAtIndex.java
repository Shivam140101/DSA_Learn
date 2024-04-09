package ArraysAndMatrix.Arrays.GFGQues;

public class ArrayInsertAtIndex {

    public static void insert(int[] arr , int n , int x , int index){

        if(index==n-1){
            arr[n-1] = x;
            return;
        }
        for(int i=n-1; i>x; i--){
            arr[i] = arr[i-1];
        }
        arr[index] = x;
    }

    public static void main(String[] args) {

        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[4] = 5;

        System.out.println("Before Inserting: ");
        for (int i: arr)
            System.out.print(i+" ");

        insert(arr , arr.length , 4,3);

        System.out.println("\nAfter Inserting: ");
        for (int i: arr)
            System.out.print(i+" ");
    }
}
