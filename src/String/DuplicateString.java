package String;

// Remove duplicate character
public class DuplicateString{
    public static void main(String args[]){
        boolean[] arr = new boolean[26];

        String str = "available";
        StringBuilder removed_dup = new StringBuilder();
        
        for(int i=0; i < str.length(); i++){
            char ch = str.charAt(i);
            int idx = ch - 'a';

            if(!arr[idx]){
                arr[idx] = true;
                removed_dup.append(ch);
            }
        }

        System.out.println("After removing duplicates: " + removed_dup);
    }
}