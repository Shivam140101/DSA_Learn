package ArraysAndMatrix.Arrays.GFGQues;

import java.util.ArrayList;

public class StockBuySell {

    public static ArrayList<ArrayList<Integer>> stockBuySell(int[] arr , int n){
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        int buyIndex = 0;
        int sellIndex = 0;

        for(int i=0 ; i < n-1 ; i++){
            if(arr[i] < arr[i+1]){
                sellIndex++;
            }else{
                if(buyIndex != sellIndex){
                    ArrayList<Integer> al = new ArrayList<>();
                    al.add(buyIndex);
                    al.add(sellIndex);
                    res.add(al);
                }
                buyIndex = i+1;
                sellIndex = i+1;
            }
        }
        if(buyIndex != sellIndex){
            ArrayList<Integer> al = new ArrayList<>();
            al.add(buyIndex);
            al.add(sellIndex);
            res.add(al);
        }
        return res;
    }


    public static void main(String[] args) {

        int[] arr = {100,180,260,310,40,535,695};

        ArrayList<ArrayList<Integer>> buySell = stockBuySell(arr, arr.length);
        System.out.println(buySell);
    }
}
