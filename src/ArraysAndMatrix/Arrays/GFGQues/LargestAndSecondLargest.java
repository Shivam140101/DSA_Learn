package ArraysAndMatrix.Arrays.GFGQues;

import java.util.ArrayList;

public class LargestAndSecondLargest {

    public static ArrayList<Integer> largestAndSecondLargest(int[] arr , int n){
        ArrayList<Integer> result = new ArrayList<>();
        int largest = -1;
        int secondLargest = -1;

        for(int i = 0; i < n; i++){
            int num = arr[i];
            if(num > largest){
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }
        result.add(largest);
        result.add(secondLargest);

        return result;
    }


    public static void main(String[] args) {

        int[] arr = {90,100,20,50,80,30,90};
        ArrayList<Integer> list = largestAndSecondLargest(arr, arr.length);
        System.out.println(list);
    }
}
