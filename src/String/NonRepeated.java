package String;

// Find first non-repeated character in string
public class NonRepeated {
    public static void main(String args[]){
        int[] freq = new int[26];
        String str = "available";
        //StringBuilder non_repeat = new StringBuilder();
        
        // Count the frequency of each character
        for(int i=0; i < str.length(); i++){
            char ch = str.charAt(i);
            freq[ch - 'a']++;
        }

        // Check which first character has a freq as 1.
        for(int i=0; i < str.length(); i++){
            char ch = str.charAt(i);
            if ( freq[ch - 'a'] == 1){
                System.out.println("First non-repeated character is: " + ch);
                return;
            }
        }
    }
}