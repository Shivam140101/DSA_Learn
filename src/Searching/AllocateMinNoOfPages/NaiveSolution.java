package Searching.AllocateMinNoOfPages;

public class NaiveSolution {

    public static int minPages(int[] arr , int n , int k){

        if (k==1) return sum(arr,0,n-1);
        if (n==1) return arr[0];

        int res = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++)
            res = Math.min(res, Math.max(minPages(arr,i,k-1), sum(arr,i,n-1)));
        return res;
    }

    public static int sum(int[] arr , int b , int e){
        int s = 0;
        for (int i = b ; i <= e ; i++) s += arr[i];
        return s;
    }

    public static void main(String[] args) {

        int[] arr = {10,20,30,40};

        int minPages = minPages(arr, arr.length, 2);
        System.out.println(minPages);
    }
}
