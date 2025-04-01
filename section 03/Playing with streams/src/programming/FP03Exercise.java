package programming;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FP03Exercise {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
        List<String> courses = Arrays.asList("Java", "Python", "C++", "JavaScript", "C", "C#", "Go", "Rust");

        /** Collecting stream elements to list using collect. **/
        System.out.println("Return list from list: ");
        List<Integer> doubledNumbers = doubleList(numbers);
        System.out.println(doubledNumbers);

        /** Create a list with even numbers filtered from the numbers list **/
        System.out.println("Even number list");
        List<Integer> evenNumbers = EvenList(numbers);
        System.out.println(evenNumbers);

        /** Create a list with length of all course titles **/
        System.out.println("Course length list:");
        List<Integer> courseLength = courseLengthList(courses);
        System.out.println(courseLength);
    }

    private static List<Integer> courseLengthList(List<String> courses) {
        return courses.stream()
                .map(course -> course.length())
                .collect(Collectors.toList());
    }

    private static List<Integer> EvenList(List<Integer> numbers) {
        return numbers.stream()
                .filter(number -> number % 2 == 0)
                .collect(Collectors.toList());
    }

    private static List<Integer> doubleList(List<Integer> numbers) {
        return numbers.stream()
                .map(number -> number * number)
                .collect(Collectors.toList());
    }
}
