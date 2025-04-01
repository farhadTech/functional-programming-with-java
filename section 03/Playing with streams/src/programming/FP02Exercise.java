    package programming;

    import java.util.Arrays;
    import java.util.List;

    public class FP02Exercise {
        public static void main(String[] args) {
            List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
            List<String> courses = Arrays.asList("Java", "C", "C++", "Python", "JavaScript", "Go", "TypeScript", "Rust");

            // exercise for reduce and streams

    //        Square every number in a list and find the sum of squares.
            int result, result2, result3;
            result = numbers.stream().map(x -> x * x).reduce(0, Integer::sum);
            System.out.println(result);

    //        Cube every number in a list and find sum of cube
            result2 = numbers.stream().map(x -> x * x * x).reduce(0, Integer::sum);
            System.out.println(result2);

            // find sum of odd numbers in a list.
            result3 = numbers.stream().filter(number -> number % 2 == 1).reduce(0, Integer::sum);
            System.out.println(result3);
        }
    }
