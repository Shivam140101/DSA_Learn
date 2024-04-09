package Searching.CountOnesInBinaryArray;

public class NaiveSolution {

    public static int countOnes(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count = arr.length - i;
                break;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        int[] arr = {0,0,0,1,1,1,1,1,1};

        int countOnes = countOnes(arr);
        System.out.println(countOnes);
    }
}
