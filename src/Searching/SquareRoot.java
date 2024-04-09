package Searching;

public class SquareRoot {

    // Time Complexity = O(√x)
//    public static int sqRoot(int x){
//        int i=1;
//        while(i*i <= x) i++;
//        return (i-1);
//    }

    // Time Complexity = O(log(x))
    public static int sqRoot(int x){
        int low = 1 , high = x , ans = -1;
        while(low <= high){
            int mid = (low + high) / 2;
            int mSq = mid * mid;
            if (mSq == x) return mid;
            else if (mSq > x) high = mid -  1;
            else{
                low = mid + 1;
                ans = mid;
            }
        }
        return ans;
    }

    public static void main(String[] args) {

        int x = 16;
        int sqRoot = sqRoot(x);
        System.out.println(sqRoot);
    }
}
