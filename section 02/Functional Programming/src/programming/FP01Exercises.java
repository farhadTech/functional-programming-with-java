package programming;

import java.util.Arrays;
import java.util.List;

public class FP01Exercises {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(8, 2, 3, 5, 7, 10, 13, 17, 20, 23, 29, 31, 32);
//        printOddNumberFromTheList(numbers);

        List<String> courses = Arrays.asList("Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernates");
//        printAllCoursesIndividually(courses);

//        printCoursesThatContainsSpring(courses);
        
//        printCoursesWhoseNameHasAtleast4Letters(courses);

        // using mapping in functional programming
//        printSquaresOfEvenNumber(numbers);

//        printCubeOfOddNumber(numbers);
        printTheNumberOfCharacterInEachCourse(courses);
    }

    private static void printTheNumberOfCharacterInEachCourse(List<String> courses) {
        courses.stream()
                .map(course -> course + " " + course.length())
                .forEach(System.out::println);
    }

    private static void printCubeOfOddNumber(List<Integer> numbers) {
        numbers.stream()
                .filter(number -> number % 2 == 1)
                .map(number -> number * number * number)
                .forEach(System.out::println);
    }

    private static void printSquaresOfEvenNumber(List<Integer> numbers) {
        numbers.stream()
                .filter(number -> number % 2 == 0)
                // mapping -x -> x * x
                .map(number -> number * number)
                .forEach(System.out::println);
    }

    private static void printCoursesWhoseNameHasAtleast4Letters(List<String> courses) {
        courses.stream()
                .filter(course -> course.length() >= 4)
                .forEach(System.out::println);
    }

    private static void printCoursesThatContainsSpring(List<String> courses) {
        courses.stream()
                .filter(course -> course.contains("Spring"))
                .forEach(System.out::println);
    }

    private static void printAllCoursesIndividually(List<String> courses) {
        courses.stream()
                .forEach(System.out::println);
    }

    private static void printOddNumberFromTheList(List<Integer> numbers) {
        numbers.stream()
                .filter(number -> number % 2 != 0)
                .forEach(System.out::println);
    }


}




