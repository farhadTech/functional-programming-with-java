package programming;

import java.util.List;

public class FunctionalInterfaces {
    /*
    private static boole isEven(int number) {
        return number % 2 == 0;
    }

    private static int square(int number) {
        return number * number;
    }

     */

    public static void main(String[] args) {
    List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

    numbers.stream()
            .filter(n -> n % 2 == 0)
            .map(n -> n * n)
//            .forEach(x -> System.out.println(x));
            .forEach(System.out::println);
    }
}
