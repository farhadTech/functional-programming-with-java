package programming;

import java.util.List;

public class FP02Functional {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

        int sum = addListFunctional(numbers);
        System.out.println(sum);
    }

//    private static int sum(int a, int b) {
//        return a + b;
//    }

    private static int addListFunctional(List<Integer> numbers) {
        // combine them into one result -> one value
        // 0 and (a, b) -> a + b FP02Functional::sum
        return numbers.stream()
//                .reduce(0, FP02Functional::sum);
                // using lambda expression
//                .reduce(0, (a, b) -> a + b);
                // more simplify
                .reduce(0, Integer::sum);

    }

    /* reduce operation takes list of numbers and reduce to one number */
}
