package Strings.GFGQue;

import java.util.HashMap;
import java.util.Map;

public class MaxOccurringChar {

    public static char maxCharOccur(String str){

        HashMap<Character , Integer> map = new HashMap<Character, Integer>();

        for(char c : str.toCharArray())
            map.put(c , map.getOrDefault(c,0)+1);

        char maxChar = 'a';
        int maxCount = 0;

        for (Map.Entry<Character, Integer> entry : map.entrySet()){
            char c = entry.getKey();
            int count = entry.getValue();
            if (count > maxCount || (count == maxCount && c < maxChar)){
                maxChar = c;
                maxCount = count;
            }
        }

        return maxChar;
    } 
    public static void main(String[] args) {

        String str = "testsample";
        char charOccur = maxCharOccur(str);
        System.out.println(charOccur);
    }
}
