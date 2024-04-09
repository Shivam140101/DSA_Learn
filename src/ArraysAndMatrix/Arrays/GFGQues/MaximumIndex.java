package ArraysAndMatrix.Arrays.GFGQues;

public class MaximumIndex {

    public static int maxIndex(int[] a , int n){

        int j = n-1;
        int i = 0;
        int max = 0;
        while(i <= j){
            if(a[i] <= a[j]){
                int diff = j-i;
                max = Math.max(diff,max);
                i++;
                j=n-1;
            }else{
                j--;
            }
        }
        return max;
    }

    public static void main(String[] args) {

        int[] arr = {34, 8, 10, 3, 2, 80, 30, 33, 1};
        int maxIndex = maxIndex(arr, arr.length);
        System.out.println(maxIndex);
    }
}
