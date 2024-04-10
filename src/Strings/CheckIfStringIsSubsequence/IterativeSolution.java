package Strings.CheckIfStringIsSubsequence;

public class IterativeSolution {

    public static boolean inSubSeq(String s1 , String s2 , int n , int m){

        if(m < n) return false;

        int j = 0;
        for(int i = 0 ; i < m && j < n; i++)
            if (s2.charAt(i) == s1.charAt(j)) j++;
        return (j == n);
    }

    public static void main(String[] args) {

        String s1 = "gksrek";
        String s2 = "geeksforgeeks";

        boolean subSeq = inSubSeq(s1, s2, s1.length(), s2.length());
        System.out.println(subSeq);
    }
}
