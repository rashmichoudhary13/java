package Nqt;//Find the maximum energy of the last person to survive.
//Person B with energy x eats person C with energy y, then the new energy becomes x - y;

import java.util.*;

public class Survival{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of arrray: ");
        int n = sc.nextInt();
        long[] a = new long[n];

        long sumAbs = 0;
        long minVal = Long.MAX_VALUE;
        long maxVal = Long.MIN_VALUE;
        boolean hasPositive = false;
        boolean hasNegative = false;

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
            sumAbs += Math.abs(a[i]);
            
            if (a[i] > 0) hasPositive = true;
            if (a[i] < 0) hasNegative = true;
            
            if (a[i] < minVal) minVal = a[i];
            if (a[i] > maxVal) maxVal = a[i];
        }

        // Edge Case: Only one person
        if (n == 1) {
            System.out.println(a[0]);
            sc.close();
            return;
        }

        long result;
        // If there is at least one positive and one negative (or a zero)
        // we can achieve the full absolute sum.
        if ((hasPositive && hasNegative) || containsZero(a)) {
            result = sumAbs;
        } 
        // All numbers are positive
        else if (hasPositive && !hasNegative) {
            result = sumAbs - (2 * minVal);
        } 
        // All numbers are negative
        else {
            // maxVal here is the negative number closest to 0 (e.g., -1 is > -5)
            result = sumAbs - (2 * Math.abs(maxVal));
        }

        System.out.println(result);
        sc.close();
    }

    private static boolean containsZero(long[] arr) {
        for (long x : arr) if (x == 0) return true;
        return false;
    }
}