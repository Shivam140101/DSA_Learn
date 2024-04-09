package Hashing;

import java.util.HashSet;

public class IntersectionOfTwoUnsorted {

    public static void intersection(int[] a, int[] b){

        HashSet<Integer> set = new HashSet<Integer>();
        for (int num : b) set.add(num);

        for (int num : a)
            if (set.contains(num))
                System.out.print(num+" ");
    }

    public static void main(String[] args) {

        int[] a = {10,15,20,25,30,35};
        int[] b = {30,5,15,80};

        intersection(a, b);
    }
}
