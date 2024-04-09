package ArraysAndMatrix.Arrays.GFGQues;

import java.util.ArrayList;
import java.util.Collections;

public class LeadersInArray {

    public static ArrayList<Integer> leader(int[] arr , int n){

        ArrayList<Integer> array = new ArrayList<>();

        int currLeader = arr[n-1];
        array.add(currLeader);

        for (int i = n-2 ; i >= 0 ; i--){
            if (arr[i] > currLeader){
                currLeader = arr[i];
                array.add(currLeader);
            }
        }
        Collections.reverse(array);
        return array;
    }

    public static void main(String[] args) {

        int[] arr = {10,7,10,4,10,3,6,5,2};
        int n = arr.length;

        ArrayList<Integer> leader = leader(arr, n);
        System.out.println(leader);

    }
}
