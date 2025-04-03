package programming;

import java.util.Arrays;
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
    }
}































