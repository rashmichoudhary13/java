import java.util.HashMap;

class Solution {
    public static String minWindow(String s, String t) {
        HashMap<Character,Integer> map = new HashMap<>();
        int l=0;
        int count = 0;
        int n = t.length();
        String res = "";

        for(char letter: t.toCharArray()){
            map.put(letter, map.getOrDefault(letter,0) + 1);
        }

        for(int r=0; r < s.length(); r++){
            char curr = s.charAt(r);
            Integer keyValue = map.get(curr);

            if(keyValue != null && keyValue != 0){
                map.put(curr, keyValue - 1);
                count++;
            } else if( keyValue != null && keyValue == 0){
                char prev = s.charAt(l);
                map.put(prev, map.get(prev) + 1);
                l++;

                while(!map.containsKey(s.charAt(l))){
                    l++;
                }

            }

            if(count == n){
               res = s.substring(l,r+1);
             
                char prev = s.charAt(l);
                map.put(prev, map.get(prev) + 1);
                count--;
                l++;

                while(!map.containsKey(s.charAt(l))){
                    l++;
                }

            }
        }

        return res;
    }

    public static void main(String[] args){
        String s = "ADOBECODEBANC";
        String t = "ABC";

        String ans = minWindow(s,t);

        System.out.println(ans);
    }
}