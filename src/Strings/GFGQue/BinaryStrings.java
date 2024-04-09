package Strings.GFGQue;

public class BinaryStrings {

    public static int countSubStrings(String s){

        int count;
        int n = s.length();
        int ones = 0;

        for (int i = 0 ; i < n ; i++)
            if (s.charAt(i) == '1') ones++;
        count = (ones * (ones - 1))/2;
        return count;
    }

    public static void main(String[] args) {

        String s = "1111";
        int counted = countSubStrings(s);
        System.out.println(counted);
    }
}
