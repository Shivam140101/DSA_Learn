package ArraysAndMatrix.Arrays;

public class SubArrayWithGivenSum {

//    Time Complexity = O(n^2)
//    public static boolean isSubSum(int[] arr , int n , int sum){
//
//        for(int i = 0; i<n ; i++){
//            int curr = 0;
//            for (int j=i ; j<n ; j++){
//                curr += arr[j];
//                if (curr == sum){
//                    return true;
//                }
//            }
//        }
//        return false;
//    }

//  Time Complexity = O(n)
    public static boolean isSubSum(int[] arr , int n , int sum){
        int curr = 0 , s = 0 ;
        for (int e=0 ; e < n ; e++){
            curr += arr[e];
            while (sum < curr){
                curr -= arr[s];
                s++;
            }
            if (curr == sum)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {

        int[] arr = {1,4,20,3,10,5};

        boolean subSum = isSubSum(arr, arr.length, 33);
        System.out.println(subSum);
    }
}
