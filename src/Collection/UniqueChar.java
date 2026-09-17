package Collection;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueChar {
    public static void main(String[] args) {
        Set<Character> set = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string: ");
        String str = sc.nextLine();

        for(char ele: str.toCharArray()){
            set.add(ele);
        }

        System.out.println("Size of unique ele is: " + set.size());

    }
}
