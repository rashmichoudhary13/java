package Collection;

import java.util.Collections;
import java.util.List;
import java.util.Arrays;

// sort string list in descending using custom comparator
public class Comparator {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Bear","Zebra","Lion","Ant");
        System.out.println(list);
        sortDescending(list);
        System.out.println(list);
    }

    public static void sortDescending(List<String> str){
        Collections.sort(str, new java.util.Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.equals(o2)){
                    return 0;
                } else if(o1.charAt(0) < o2.charAt(0)){
                    return 1;
                } else {
                    return -1;
                }
            }
        });
    }
}
