package programming;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class BehaviorParameterization {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        /*
        System.out.println("Even numbers: " );
        numbers.stream()
                .filter(n -> n % 2 == 0)
                .forEach(x -> System.out.print(x + " "));

        System.out.println("\nOdd numbers: " );
        numbers.stream()
                .filter(n -> n % 2 != 0)
                .forEach(x -> System.out.print(x + " "));
    }
         */
        filterAndPrint(numbers, x -> x % 2 == 0);
//        filterAndPrint(numbers, x -> x % 2 != 0);
//        filterAndPrint(numbers, x -> x % 3 == 0);
    }
    private static void filterAndPrint(List<Integer> numbers, Predicate<? super Integer> predicate) {
        numbers.stream()
                .filter(predicate)
                .forEach(System.out::println);
    }
}
