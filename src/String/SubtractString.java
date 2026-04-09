package String;// Find the minimum no. of Deci-numbers to get the sum equal to n

import java.util.*;
class SubtractString{
    public int minPartitions(String n) {

        char[] arr = n.toCharArray();
        int count = 0;

        while (true) {
            boolean changed = false;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != '0') {
                    arr[i]--;      // subtract 1
                    changed = true;
                }
            }

            if (!changed)
                break;

            count++;
        }

        return count;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        String n = sc.nextLine();

        SubtractString obj = new SubtractString();
        int result = obj.minPartitions(n);
        System.out.println(result);
        sc.close();
    }
}