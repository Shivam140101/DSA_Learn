package Strings;

public class FrequencyOfCharacter {
    public static void main(String[] args) {
        
        String str = "shivamahlawat";
        int[] count = new int[26];
        
        for (int i = 0; i < str.length(); i++)
            count[str.charAt(i)-'a']++;
        for (int i = 0 ; i < 26 ; i++)
            if (count[i] > 0) System.out.println((char) (i+'a') + " "+count[i]);
    }
}
