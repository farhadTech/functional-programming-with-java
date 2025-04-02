package programming;

import programming.Course;
import programming.CustomClass;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CustomClass {
    public static void main(String[] args) {
        List<Course> courses =
                List.of(
                        new Course("Spring", "Framework", 98, 20000),
                        new Course("Spring Boot", "Framework", 95, 18000),
                        new Course("API", "Microservices", 97, 22000),
                        new Course("Microservices", "Microservices", 96, 25000),
                        new Course("FullStack", "FullStack", 91, 14000),
                        new Course("AWS", "Cloud", 92, 21000),
                        new Course("Azure", "Cloud", 99, 21000),
                        new Course("Docker", "Cloud", 92, 20000),
                        new Course("Kubernetes", "Cloud", 91, 20000)
                );

        // allMatch, noneMatch, anyMatch
        System.out.println(courses.stream().allMatch(course -> course.getReviewScore() > 90)); // true

        Predicate<Course> reviewScoreGreaterThan95Predicate = course -> course.getReviewScore() > 95;
        Predicate<Course> reviewScoreGreaterThan90Predicate = course -> course.getReviewScore() > 90;
        Predicate<Course> reviewScoreLessThan90Predicate = course -> course.getReviewScore() < 90;

        System.out.println(courses.stream().noneMatch(reviewScoreGreaterThan95Predicate)); // false
        System.out.println(courses.stream().noneMatch(reviewScoreGreaterThan90Predicate)); // false
        System.out.println(courses.stream().noneMatch(reviewScoreLessThan90Predicate)); // true
        System.out.println(courses.stream().anyMatch(reviewScoreLessThan90Predicate)); // false
        System.out.println(courses.stream().allMatch(reviewScoreLessThan90Predicate)); // false
        System.out.println(courses.stream().allMatch(reviewScoreGreaterThan90Predicate)); // true

        // sorting courses with sorted and creating comparators
        Comparator comparingByNoOfStudents
                = Comparator.comparing(Course::getNoOfStudents);
        Comparator comparingByNoOfStudentsDecreasing
                = Comparator.comparing(Course::getNoOfStudents).reversed();

        Comparator <Course> comparingByNoOfStudentsAndNoOfReviews
                = Comparator.comparing(Course::getNoOfStudents).thenComparing(Course::getReviewScore);

        System.out.println(courses.stream()
                .sorted(comparingByNoOfStudents)
                .collect(Collectors.toList()));

        System.out.println(courses.stream()
                .sorted(comparingByNoOfStudentsDecreasing)
                .collect(Collectors.toList()));

        System.out.println(courses.stream()
                .sorted(comparingByNoOfStudentsAndNoOfReviews)
                .collect(Collectors.toList())
        );
    }
}

























