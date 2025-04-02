package programming;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class FunctionalInterfaces3 {
    public static void main(String[] args) {
        // exploring BiPredicate, BiFunction, BiConsumer, and Primitive Functional.

        BiPredicate<Integer, String> biPredicate
                = (number, str) -> number < 10 && str.length() > 5;

        System.out.println(biPredicate.test(5, "in28minutes"));

        
        BiFunction<Integer, String, String> biFunction
                = (number, str) -> {
            return number + " " + str;
        };
        System.out.println(biFunction.apply(15, "in28minutes"));

        BiConsumer<Integer, String> biConsumer
                = (s1, s2) -> {
            System.out.println(s1);
            System.out.println(s2);
        };
        biConsumer.accept(15, "in28minutes");
    }
}
