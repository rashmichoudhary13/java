package String;

public class Vowel {
    public static void main(String args[]){
        String str = "hello world";
        int vow = 0, cons = 0;

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if( ch >= 'a' && ch <= 'z') { // To avaoid space in counting
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                    vow++;
                }else{
                    cons++;
                }
            }
        }

        System.out.printf("Total Vowel is: %d %nToatl Consonants is: %d",vow,cons);
    }
}