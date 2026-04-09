package String;

public class OnlyDigit {
    static void isDigit(String str){
        for(int i=0; i < str.length(); i++){
            char ch = str.charAt(i);
            int ascii = (int)ch; // Convert char into ascii 

            // Check if its a digit or not
            if (ascii < 48 || ascii > 57){
                System.out.println("The string does not contains only numbers");
                return;
            }
        }
        System.out.println("The string contains only numbers");
    }

    public static void main(String args[]){
        String str = "12a4bc5";
        System.out.println('9' - 0);
        isDigit(str);
    }
}