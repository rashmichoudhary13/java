package Collection.iteration;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Hashset {
    public static void main(String[] args){
        Set<Integer> set = new HashSet<>(List.of(1,2,3,4,5));

        for(Integer num: set){
            System.out.println(num);
        }

        System.out.println("Using iterator: \n");

        Iterator<Integer> it = set.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
