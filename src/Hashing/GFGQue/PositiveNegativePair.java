package Hashing.GFGQue;

import java.util.ArrayList;
import java.util.HashMap;

public class PositiveNegativePair {

    public static ArrayList<Integer> pair(int[] arr , int n){

        ArrayList<Integer> res=new ArrayList<Integer>();
        HashMap<Integer,Integer> map=new HashMap<Integer, Integer>();
        for(int i=0;i<n;i++) {
            map.put(arr[i],1);
            if(!map.containsKey(-1*arr[i]) || arr[i]==0) {
                map.put(arr[i], 1);
            }
            else {
                res.add(-1*Math.abs(arr[i]));
                res.add(Math.abs(arr[i]));
            }
        }
        return res;
    }

    public static void main(String[] args) {

        int[] arr = {1,3,6,-2,-1,-3,2,7};

        ArrayList<Integer> pair = pair(arr,arr.length);
        System.out.println(pair);
    }

}
