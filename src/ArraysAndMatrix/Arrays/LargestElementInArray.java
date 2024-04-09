package ArraysAndMatrix.Arrays;

public class LargestElementInArray {

    // Time Complexity = O(n^2)
    // Naive Approach
//    public static int getLargest(int[] arr , int n){
//        for(int i = 0; i < n ; i++){
//            boolean flag = true;
//            for(int j = 0; j < n ; j++){
//                if(arr[j] > arr[i]){
//                    flag = false;
//                    break;
//                }
//            }
//            if(flag)
//                return i;
//        }
//        return -1;
//    }

    // Efficient Approach
    // Time Complexity = O(n)
    public static int getLargest(int[] arr , int n){
        int res = 0;
        for(int i = 1; i < arr.length; i++)
            if (arr[i] > arr[res])
                res = i;
        return arr[res];
    }

    public static void main(String[] args) {

        int[] arr = {10,40,60,20};
        int largest = getLargest(arr, arr.length);
        System.out.println(largest);
    }
}
