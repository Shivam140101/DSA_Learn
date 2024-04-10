package Strings.GFGQue;

public class CheckIfStringsAreRotated {

    public static boolean check(String s1 , String s2){
        if(s1.length() != s2.length()) return false;
        String temp = s1 + s2;
        return temp.lastIndexOf(s2) != -1;
    }

    public static void main(String[] args) {

        String s1 = "geeksforgeeks";
        String s2 = "forgeeksgeeks";

        boolean check = check(s1, s2);
        System.out.println(check);
    }
}
