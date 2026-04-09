package String;// Check if a string is a subsequence of a given string.
// subsequence --> A string that appear in order in the main string ( not necessarily consecutive )
import java.util.Scanner;

class CheckString{

    static boolean isSubsequence(String s1, String s2) {
        int j = 0;

        for (int i = 0; i < s1.length(); i++) {
            if (j < s2.length() && s1.charAt(i) == s2.charAt(j)) {
                j++;
            }
        }

        return j == s2.length();
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the main string s1: ");
        String s1 = sc.nextLine();

        System.out.print("Enter a subsequence string s2: ");
        String s2 = sc.nextLine();

        sc.close();
        boolean result = isSubsequence(s1,s2);

        if(result){
            System.out.println("s2 is Subsequence of s1");
        } else {
            System.out.println("s2 is not Subsequence of s1");
        }
    }
}

// *********** using recursion *****************
// static boolean isSubsequence(String small, String large){
//     if(small.isEmpty()){
//         return true;
//     } else if(large.isEmpty()){
//         return false;
//     }

//     if(small.charAt(0) != large.charAt(0)){
//         return isSubsequence(small, large.substring(1));
//     } else {
//         return isSubsequence(small.substring(1), large.substring(1));
//     }
// }

// *********** Using contains Function **************
// public class SubstringCheck {
//     public static void main(String[] args) {
//         String mainString = "Hello, welcome to Java!";
//         String subString = "welcome";

//         if (mainString.contains(subString)) {
//             System.out.println(subString + " is a substring of " + mainString);
//         } else {
//             System.out.println(subString + " is NOT a substring of " + mainString);
//         }
//     }
// }
