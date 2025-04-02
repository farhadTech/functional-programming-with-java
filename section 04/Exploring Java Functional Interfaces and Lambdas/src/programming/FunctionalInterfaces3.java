package programming;

import java.util.function.*;

public class FunctionalInterfaces3 {
    public static void main(String[] args) {
        // Exploring BiPredicate, BiFunction, and BiConsumer functional interfaces.

        // BiPredicate: Takes two inputs and returns a boolean result based on a condition.
        BiPredicate<Integer, String> biPredicate
                = (number, str) -> number < 10 && str.length() > 5;

        // Testing the BiPredicate with values (5, "in28minutes")
        System.out.println(biPredicate.test(5, "in28minutes")); // Output: true

        // BiFunction: Takes two inputs and returns a result of a different type.
        BiFunction<Integer, String, String> biFunction
                = (number, str) -> {
            return number + " " + str;
        };

        // Applying the BiFunction with values (15, "in28minutes")
        System.out.println(biFunction.apply(15, "in28minutes")); // Output: "15 in28minutes"

        // BiConsumer: Takes two inputs and performs an action without returning a result.
        BiConsumer<Integer, String> biConsumer
                = (s1, s2) -> {
            System.out.println(s1);
            System.out.println(s2);
        };

        // Accepting values and executing the BiConsumer
        biConsumer.accept(15, "in28minutes"); // Output: 15\n in28minutes

        // doing puzzles with functional interfaces and lambdas
        Consumer<String> consumer = (str) -> System.out.println(str);
        consumer.accept("hello, PC");


        BiConsumer<String, String> consumer2 = (str1, str2) -> {
            System.out.println(str1);
            System.out.println(str2);
        };
        consumer2.accept("hello PC", "World");

        Supplier<String> supplier = () -> { return "Ranga"; };
        System.out.println(supplier.get());

    }
}





























