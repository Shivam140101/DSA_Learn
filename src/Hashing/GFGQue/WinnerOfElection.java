package Hashing.GFGQue;

import java.util.Arrays;
import java.util.HashMap;

public class WinnerOfElection {


    public static String[] winner(String[] arr , int n){

        HashMap<String,Integer> map = new HashMap<String,Integer>();
        int votes = 0;
        for (String s : arr) {
            map.put(s, map.getOrDefault(s, 0) + 1);
            votes = Math.max(votes, map.get(s));
        }
        String winner = "";
        for (String name : arr){
            if(map.get(name) == votes)
                if (winner.isEmpty() || name.compareTo(winner) < 0)
                    winner = name;
        }

        return new String[]{winner , votes+""};
    }

    public static void main(String[] args) {

        String[] arr = {"john","johnny","jackie","johnny","john",
                        "jackie","jamie","jamie","john","johnny","jamie",
                        "johnny","john"};

        String[] winner = winner(arr, arr.length);
        System.out.println(Arrays.toString(winner));
    }
}
