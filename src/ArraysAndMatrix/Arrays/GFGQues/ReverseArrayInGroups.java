package ArraysAndMatrix.Arrays.GFGQues;

import java.util.ArrayList;

public class ReverseArrayInGroups {


    public static void reverse(ArrayList<Integer> arr , int n , int left , int right){

        while(left < right){
            int temp = arr.get(left);
            arr.set(left, arr.get(right));
            arr.set(right, temp);
            left += 1;
            right -= 1;
        }
    }

    public static void reverseInGroups(ArrayList<Integer> arr , int n , int k){

        for(int i = 0 ; i < n ; i += k){
            if (i+k < n)
                reverse(arr,n,i,i+k-1);
            else
                reverse(arr,n,i,n-1);
        }
    }

    public static void main(String[] args) {

        ArrayList<Integer> array = new ArrayList<>();
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(5);

        System.out.println("Before reverse:- ");
        array.forEach(e -> System.out.print(e+" "));

        reverseInGroups(array , array.size(),3);

        System.out.println("\nAfter Reverse:- ");
        array.forEach(e -> System.out.print(e+" "));
    }
}
