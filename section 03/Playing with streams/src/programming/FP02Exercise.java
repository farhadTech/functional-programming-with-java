package programming;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FP02Exercise {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
        List<String> courses = Arrays.asList("Java", "C", "C++", "Python", "JavaScript", "Go", "TypeScript", "Rust");

        System.out.println("Sum of squares: " + sumOfSquares(numbers));
        System.out.println("Sum of cubes: " + sumOfCubes(numbers));
        System.out.println("Sum of odd numbers: " + sumOfOddNumbers(numbers));

        System.out.println("Distinct numbers:");
        printDistinctNumbers(numbers);

        System.out.println("Sorted numbers:");
        printAllSortedNumbers(numbers);

        System.out.println("sorted and distinct numbers:");
        printDistinctAndSortedNumbers(numbers);

        System.out.println("Comparators to sort streams ascending order: ");
        courses.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);

        System.out.println("Comparators to sort streams descending order: ");
        courses.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

        System.out.println("Define Custom comparator based on length of the course name: ");
//        courses.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);
        courses.stream().sorted(Comparator.comparing(str -> str.length())).forEach(System.out::println);
    }

    private static void printDistinctAndSortedNumbers(List<Integer> numbers) {
        numbers.stream().distinct().forEach(System.out::println);
    }

    private static void printAllSortedNumbers(List<Integer> numbers) {
        numbers.stream().sorted().forEach(System.out::println);
    }

    private static int sumOfSquares(List<Integer> numbers) {
        return numbers.stream().map(x -> x * x).reduce(0, Integer::sum);
    }

    private static int sumOfCubes(List<Integer> numbers) {
        return numbers.stream().map(x -> x * x * x).reduce(0, Integer::sum);
    }

    private static int sumOfOddNumbers(List<Integer> numbers) {
        return numbers.stream().filter(number -> number % 2 == 1).reduce(0, Integer::sum);
    }

    private static void printDistinctNumbers(List<Integer> numbers) {
        numbers.stream().distinct().forEach(System.out::println);
    }


}