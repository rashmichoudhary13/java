package Collection.iteration;

import java.util.*;

public class Arraylist {
    public static void main(String[] args){
//        List<Integer> list = new ArrayList<>(List.of(1,2,3,4,5));
//
//        for(Integer num: list){
//            System.out.println(num);
//        }
//
//        System.out.println("Using Iterator: \n");
//
//
//        Iterator<Integer> it = list.iterator();
//
//        while(it.hasNext()){
//            System.out.println(it.next());
//        }

        Deque<Integer> queue = new ArrayDeque<>(List.of(2,3,4,5,6));

        for(Integer num: queue){
            System.out.println(num);
        }

        System.out.println("Using empty condition: \n");

        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }
}
