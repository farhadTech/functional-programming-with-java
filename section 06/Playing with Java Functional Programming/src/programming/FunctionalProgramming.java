package programming;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FunctionalProgramming {
    public static void main(String[] args) {
        /**
         * Creating streams using stream of method and for arrays
         * There are options in java to create streams directly
         */

        int[] numberArray = {12, 9, 13, 4, 6, 24, 12, 15};

        Stream.of(12, 9, 13, 4, 6, 24, 12, 15)
                .forEach(x -> System.out.print(x + " "));
        System.out.println();

        Stream.of(12, 9, 13, 4, 6, 24, 12, 15).reduce((a, b) -> a + b)
                .ifPresent(System.out::println);

        Arrays.stream(numberArray)
                .forEach(x -> System.out.print(x + " "));
        System.out.println();

        System.out.println(Arrays.stream(numberArray).sum());
        System.out.println(Arrays.stream(numberArray).average());
        System.out.println(Arrays.stream(numberArray).min());
        System.out.println(Arrays.stream(numberArray).max());


        /** Creating Streams for First 100 Numbers, squares of Numbers and More:
         * Sometime we would create a streams of primitive value much more dynamically.
         */

        IntStream.range(1, 10)
                .forEach(x -> System.out.print(x + " "));
        System.out.println();

        // exclude 10
        System.out.println(IntStream.range(1, 10).sum());

        // include 10
        System.out.println(IntStream.rangeClosed(1, 10).sum());


        System.out.println(IntStream.iterate(1, e -> e + 2).limit(10).peek(x -> System.out.print(x + " ")).sum());
        System.out.println(IntStream.iterate(2, e -> e + 2).limit(10).peek(x -> System.out.print(x + " ")).sum());
        System.out.println(IntStream.iterate(2, e -> e * 2).limit(10).peek(x -> System.out.print(x + " ")).sum());
        System.out.println(IntStream.iterate(2, e -> e * 2).limit(10).boxed().collect(Collectors.toList()));


    }
}































