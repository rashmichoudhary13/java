package String;

class Rotation {
    public static void main(String args[]){
        String str = "abcd";
        String str2 = "cdba";

        StringBuilder s1 = new StringBuilder(str);

        if (str.length() != str2.length()) {
            System.out.println("false");
            return;
        }

        for(int i=0; i < str.length(); i++){

            char ch = s1.charAt(s1.length()-1);
            s1.deleteCharAt(s1.length()-1);
        
            s1.insert(0,ch);

            if(s1.toString().equals(str2)){
                System.out.println("true");
                return;
            }
        }

        System.out.println("false");



        //2nd Method  O(n)
        /* 
        String combined = str + str;

        if (combined.contains(str2)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        */
    }
}