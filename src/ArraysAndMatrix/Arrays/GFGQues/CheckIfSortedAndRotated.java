package ArraysAndMatrix.Arrays.GFGQues;

public class CheckIfSortedAndRotated {

    public static boolean checkRotatedAndSorted(int[] arr, int num){

        int flag = (arr[0] - arr[num-1]) > 0 ? 1 : -1;
        int count = 0;

        for(int i = 0 ; i < num -1 ; i++)
            if((arr[i+1] - arr[i]) * flag < 0)
                count++;
        return (count==1);
    }

    public static void main(String[] args) {

        int[] arr = {1,2,3};
        boolean b = checkRotatedAndSorted(arr, arr.length);
        if (b)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
