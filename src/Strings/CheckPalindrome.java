package Strings;

public class CheckPalindrome {

    public static String palindrome(String str){

        int begin = 0 , end = str.length()-1;

        while(begin < end){
            if (str.charAt(begin) != str.charAt(end))
                return "No";
            begin++;
            end--;
        }
        return "Yes";
    }

    public static void main(String[] args) {

        String str = "ABCDCBA";

        String palindrome = palindrome(str);
        System.out.println(palindrome);
    }
}
