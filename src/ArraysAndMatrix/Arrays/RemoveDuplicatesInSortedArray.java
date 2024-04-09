package ArraysAndMatrix.Arrays;

public class RemoveDuplicatesInSortedArray {

    public static int removeDuplicates(int[] array , int n){

        int res = 1;
        for(int i = 1; i < n; i++){
            if (array[i] != array[res - 1]){
                array[res] = array[i];
                res++;
            }
        }
        return res;
    }

    public static void main(String[] args) {

        int[] array = {10,20,20,30,30,30,30};
        int n = array.length;

        n = removeDuplicates(array, n);

        System.out.println("After removing duplicates");
        for (int i=0; i<n; i++){
            System.out.print(array[i]+" ");
        }

    }
}
