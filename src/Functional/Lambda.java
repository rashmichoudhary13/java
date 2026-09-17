package Functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Lambda {
    public static void main(String[] args) {
        BinaryOperator<Integer> mult = (a,b) -> a * b;
        System.out.println(mult.apply(4,5));

        String[] arr = {"Apple","Orange","mango","Lichi"};

        // This print statement is called method reference
        Arrays.stream(arr).forEach(System.out::println);

        System.out.println("List stream");
        List<String> list = List.of("Apple","mango","ghifjkdeid","knowledgeke");

        String result = list.stream()
                .filter(str -> str.length() > 9)
                .reduce("",(a,b) -> a + " " + b);

        System.out.println(result);

        System.out.println("\nOdd one out");
        List<Integer> list1 = List.of(1,2,3,4,5,6,7,8,9);

        list1.stream()
              .filter(x -> (x % 2) != 0)
              .forEach(System.out::println);
    }
}
