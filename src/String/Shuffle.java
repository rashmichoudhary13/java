package String;

public class Shuffle {

    static boolean isValidShuffle(String s1, String s2, String res) {
        int combine = s1.length() + s2.length();

        if( combine != res.length() ){
            return false;
        }

        int j =0, k=0;

        for(int i=0; i < res.length(); i++){
            if( j < s1.length() && res.charAt(i) == s1.charAt(j)){
                j++;
            } else if (k < s2.length() && res.charAt(i) == s2.charAt(k)){
                k++;
            } else {
                return false;
            }
        }

        return true;
    }

    public static void main(String args[]){
        String s1 = "abc";
        String s2 = "def";
        String res = "adbfce";

        if(isValidShuffle(s1, s2, res)){
            System.out.println("Its a valid shuffle");
        } else{
            System.out.println("Its not a valid shuffle");
        }
    }
}