package exercise3;

import java.util.stream.Stream;

public class FilteredNumbers {
    public static void main(String[] args) {

        Stream.iterate(8, i -> i + 1)
                .filter(number -> number > 100)
                .filter(number -> number % 5 == 0)
                .map(number -> number * 3)
                .limit(10)
                .forEach(System.out::println);

    }
}
