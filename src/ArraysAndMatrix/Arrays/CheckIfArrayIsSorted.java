package ArraysAndMatrix.Arrays;

public class CheckIfArrayIsSorted {

    public static boolean isSorted(int[] array , int n) {

        if(n == 0 || n == 1)
            return true;

        for(int i = 1; i < n ; i++)
            if(array[i] < array[i - 1])
                return false;
        return true;
    }

    public static void main(String[] args) {

        int[] array = {1,2,3,4,5};
        boolean sorted = isSorted(array, array.length);
        System.out.println(sorted);
    }
}
