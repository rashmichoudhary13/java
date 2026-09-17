package Collection.iteration;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Linkedlist {

    public static void main(String[] args){
        List<Integer> list = new LinkedList<>(List.of(1,2,3,4,5,6,7));

        // Using for loop
        for(Integer num : list){
            System.out.println(num);
        }

        System.out.println("Using iterator: \n");
        Iterator<Integer> it = list.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
