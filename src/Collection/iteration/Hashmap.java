package Collection.iteration;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Hashmap {
    public static void main(String[] args){
        Map<String,Integer> map = new HashMap<>();

        map.put("Apple", 2);
        map.put("Orange", 4);
        map.put("Kiwi", 7);
        map.put("Banana", 6);
        map.put("Pineapple", 8);

        // On map you can iterate on either key, values or both.

        // Iterate on Key
        for(String fruit: map.keySet()){
            System.out.println(fruit);
        }

        System.out.println("\nIterate on value: \n");

        for(Integer num: map.values()){
            System.out.println(num);
        }

        System.out.println("\nIterate on both: \n");

        for(Map.Entry<String,Integer> entry:map.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println("\n Using Iterator: \n");

        Iterator<Map.Entry<String, Integer>> it = map.entrySet().iterator();

        while(it.hasNext()){
            Map.Entry<String, Integer> entry = it.next();

            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println("\n Using Iterator on Key: \n");

        Iterator<String> its = map.keySet().iterator();

        while(its.hasNext()){
            System.out.println(its.next());
        }

    }
}
