package programming;

import java.util.List;

public class FP01Structured {
    public static void main(String[] args) {
        printAllNumbersInListStructured(List.of(12, 9, 13, 4, 6, 4, 12, 15));
    }

    private static void printAllNumbersInListStructured(List<Integer> numbers) {
        // using traditional for loop
        for(int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + " ");
        }
        System.out.println();
        // using enhanced for loop
        for(Integer number : numbers) {
            System.out.print(number + " ");
        }
    }
}








