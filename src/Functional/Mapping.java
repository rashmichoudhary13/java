package Functional;

import java.util.List;

public class Mapping {
    public static void main(String[] args) {
        List<String> list = List.of("1","2","3","4","5");

        list.stream()
                .map(Integer::parseInt)
                .map(x -> Math.pow(x,2))
                .reduce((a,b) -> a+b)
                .ifPresent(System.out::println);
    }
}
