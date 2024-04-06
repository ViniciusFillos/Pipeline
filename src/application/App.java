package application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(3, 4, 5, 6, 7, 6);

        Stream<Integer> st1 = list.stream().map(x -> x * 10);

        int sum = list.stream().reduce(0, (x, y) -> x + y);

        List<Integer> newList = list.stream().filter(x -> x % 2 == 0).map(x -> x * 10).toList();

        System.out.println(Arrays.toString(st1.toArray()));
        System.out.println("Sum: " + sum);
        System.out.println(Arrays.toString(newList.toArray()));
    }
}
