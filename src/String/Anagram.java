package String;// An anagram is a word or phrase formed by rearranging the letters of another word or phrase,
// using all the original letters exactly once.

import java.util.*;

public class Anagram {
    static boolean isAnagram(String s1, String s2){
        
        // Check the length of both the string
        if (s1.length() != s2.length()){
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<>();

        // Store the frequency of each character in hashmap
        for(int i=0; i < s1.length(); i++){
            char ch = s1.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            } else {
                map.put(ch,1);
            }
        }

        // Reduce the frequency of character according to second string
        for(int i=0; i < s2.length(); i++){
            char ch = s2.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch)-1);
            } else{
                return false;
            }
        }

        // Check if the freq value is 0 or not
        for(int val: map.values()){
            if(val != 0){
                return false;
            }
        }

        return true;
    }

    public static void main(String args[]){
        String s1 = "listen";
        String s2 = "silent";

        if(isAnagram(s1,s2)){
            System.out.println("The given strings are anagram");
        } else {
            System.out.println("The given strings are not anagram");
        }
    }
}