package programming;

import java.util.List;

public class FP01Functional {
    public static void main(String[] args) {
        List<Integer>numbers = List.of(12, 9, 13, 4, 6, 4, 12, 15);
//        printAllNumbersInListFunctional(numbers);
//        printEvenNumbersInListTraditional(numbers);
        printEvenNumbersInListFunctional(numbers);
    }

    private static void printAllNumbersInListFunctional(List<Integer> numbers) {
        numbers.stream()
                .forEach(System.out::println);
    }

    private static void printEvenNumbersInListTraditional(List<Integer> numbers) {
        // using traditional approach
        for(Integer number : numbers) {
            if(number % 2 == 0) {
                System.out.println(number + " is even");
            } else {
                System.out.println(number + " is odd");
            }
        }
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }

    private static void printEvenNumbersInListFunctional(List<Integer> numbers) {
        numbers.stream()
                .filter(FP01Functional::isEven)
                .forEach(System.out::println);
    }
}









