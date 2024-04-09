package Hashing.GFGQue;

import java.util.HashSet;

public class IntersectionOfTwoArrays {

    public static int intersection(int[] a , int[] b) {

        HashSet<Integer> set = new HashSet<Integer>();
        for (int num :b) set.add(num);

        HashSet<Integer> intersection = new HashSet<Integer>();
        for (int num :a)
            if (set.contains(num)) intersection.add(num);
        return intersection.size();
    }

    public static void main(String[] args) {

        int[] a = {89, 24, 75, 11, 23};
        int[] b = {89, 2, 4};

        int intersection = intersection(a, b);
        System.out.println(intersection);
    }
}
