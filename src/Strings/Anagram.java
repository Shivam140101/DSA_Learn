package Strings;

import java.util.HashMap;

public class Anagram {


    public static boolean isAnagram(String str1, String str2) {

        if (str1.length() != str2.length()) return false;

        HashMap<Character,Integer> map = new HashMap<>();

        for(char c : str1.toCharArray()){
            map.put(c , map.getOrDefault(c,0)+1);
        }

        for(char c : str2.toCharArray()){
            if (!map.containsKey(c))
                return false;
            map.put(c,map.get(c)-1);
            if (map.get(c) < 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

        String str1 = "bbaa";
        String str2 = "baa";

        boolean anagram = isAnagram(str1, str2);
        System.out.println(anagram);
    }
}
