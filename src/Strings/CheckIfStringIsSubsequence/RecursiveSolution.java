package Strings.CheckIfStringIsSubsequence;

public class RecursiveSolution {

    public static boolean inSubSeq(String s1 , String s2 , int n , int m){

        if(m == 0) return true;
        if(n == 0) return false;
        if(s1.charAt(n-1) == s2.charAt(m-1))
            return inSubSeq(s1, s2, n-1, m-1);
        else return inSubSeq(s1, s2, n-1,m);
    }
    public static void main(String[] args) {

        String s1 = "AXY";
        String s2 = "YADXCP";

        boolean subSeq = inSubSeq(s1, s2, s1.length(), s2.length());
        System.out.println(subSeq);
    }

}
