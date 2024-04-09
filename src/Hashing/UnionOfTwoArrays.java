package Hashing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class UnionOfTwoArrays {

    public static int union(int[] a, int[] b){

        LinkedHashSet<Integer> set = new LinkedHashSet<Integer>();
        for (int num : b) set.add(num);

        for (int num : a)
            set.add(num);
        System.out.println(set);
        return set.size();
    }

    public static void main(String[] args) {

        int[] a = {15,20,5,15};
        int[] b = {15,15,15,20,10};

        int union = union(a, b);
        System.out.println(union);
    }
}
