package programming;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FunctionalProgramming {
    public static void main(String[] args) {
        List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");

        /** Joining Strings and playing with flatmap **/

        // joining all the strings by space.
        System.out.println(courses.stream()
                .collect(Collectors.joining(" ")));

        // joining all the strings by comma.
        System.out.println(courses.stream()
                .collect(Collectors.joining(",")));

        // look up all the characters that are present in a String
        Arrays.stream("Spring".split(""))
                .forEach(x -> System.out.print(x + " "));
        System.out.println();

        System.out.println("Print Everything in characters");
        courses.stream()
                .map(course -> course.split(""))
                .flatMap(Arrays::stream)
                .collect(Collectors.toList())
                .forEach(x -> System.out.print(x + " "));

        System.out.println("Print everything in character but distinct:");
        List<String> uniqueChars = courses.stream()
                .map(course -> course.split(""))
                .flatMap(Arrays::stream)
                .distinct()
                .collect(Collectors.toList());
        System.out.println(uniqueChars);


//        flatMap: Each Element of Stream replaced with content of mapped stream Mapping function -> Arrays::stream

        // Identify the courses with same number of characters
//        Example: Creating Tuples from Two Lists
        List<String> courses1 = List.of("Spring", "API", "AWS", "PCF", "Docker");
        List<String> courses2 = List.of("Spring", "API", "AWS", "PCF", "Docker");

        List<List<String>> coursePairs = courses1.stream()
                .flatMap(course -> courses2.stream()
                        .filter(course2 -> course.length() == course2.length() && !course.equals(course2))
                        .map(course2 -> List.of(course, course2)))
                .collect(Collectors.toList());

        System.out.println(coursePairs);

    }


}


























