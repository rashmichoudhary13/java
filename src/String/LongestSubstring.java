package String;// Find longest substring without repeating character

import java.util.*;

public class LongestSubstring {

    // using two pointer
    static String substring(String str){
        int maxlength = 0;
        int left = 0;
        int start = 0;
        HashSet<Character> set = new HashSet<>();

        for(int right=0; right < str.length(); right++){
            char ch = str.charAt(right);

            while(set.contains(ch)){
                set.remove(str.charAt(left));
                left++;
            }

            set.add(ch);
            
            if(right-left+1 > maxlength){
                maxlength = right-left+1;
                start = left;
            }
        }
        return str.substring(start, start+maxlength);
    }

    public static void main(String args[]){
        String str = "pwwkewxpw";
        String length = substring(str);
        System.out.println(length);
    }
}














