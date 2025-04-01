package programming;

import java.util.Arrays;
import java.util.List;

public class FP01Exercises {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37);
//        printOddNumberFromTheList(numbers);

        List<String> courses = Arrays.asList("Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernates");
//        printAllCoursesIndividually(courses);

//        printCoursesThatContainsSpring(courses);
        
        printCoursesWhoseNameHasAtleast4Letters(courses);
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




