package Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountryCapital {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("India","Delhi");
        map.put("South Korea","Seoul");
        map.put("America","Washington DC");
        map.put("Russia","Moscow");
        map.put("China","Beijing");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the country name: ");
        String country = sc.next();

        if(map.containsKey(country)){
            System.out.println("The capital is: " + map.get(country));
        } else {
            System.out.println("Country does not exist");
        }
    }
}
