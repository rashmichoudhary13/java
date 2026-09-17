package Collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// Get the frequency of an element using collections method
// Swap two element given their indices
public class Frequency {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,1,4,1,5,4,2,5);
        System.out.println(Collections.frequency(list,1));
        System.out.println(Collections.frequency(list, 5));
        swap(list,1,4);
        System.out.println(list);

        // Reverse the list using collections
        Collections.reverse(list);
        System.out.println(list);
    }

    public static void swap(List<Integer> list, int i, int j){
        int temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }
}
