package ArraysAndMatrix.Arrays.GFGQues;

public class RearrangeArrayAlternately {

    public static void rearrange(long[] array, int n){

        int lastIndex = n-1;
        int firstIndex = 0;
        int maxi = (int) (array[n-1] + 1);

        for (int i = 0 ; i < n ; i++) {
            if(i % 2 == 0) {
                array[i] += (array[lastIndex]%maxi) * maxi;
                lastIndex--;
            }else {
                array[i] += (array[firstIndex]%maxi) * maxi;
                firstIndex++;
            }
        }
        for (int i=0 ; i < n ; i++) {
            array[i] /= maxi;
        }
    }

    public static void main(String[] args) {

        long[] arr = {1,2,3,4,5,6};

        System.out.println("Before rearrange:- ");
        for (long i: arr){
            System.out.print(i+" ");
        }

        rearrange(arr , arr.length);

        System.out.println("\nAfter rearrange:- ");
        for (long i: arr){
            System.out.print(i+" ");
        }

    }
}
