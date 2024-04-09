package ArraysAndMatrix.Arrays.OperationsOnArrays;

public class Searching {

    public static int search(int[] arr, int x){

        for (int j : arr) {
            if (j == x) {
                return 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6};
        int search = search(arr, 5);
        System.out.println(search);
    }
}
