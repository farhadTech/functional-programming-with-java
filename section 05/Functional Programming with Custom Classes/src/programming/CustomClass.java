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

        /** allMatch, noneMatch, anyMatch **/
        System.out.println(courses.stream()
                .allMatch(course -> course.getReviewScore() > 90)); // true

        Predicate<Course> reviewScoreGreaterThan95Predicate = course -> course.getReviewScore() > 95;
        Predicate<Course> reviewScoreGreaterThan90Predicate = course -> course.getReviewScore() > 90;
        Predicate<Course> reviewScoreLessThan90Predicate = course -> course.getReviewScore() < 90;


        System.out.println(
                courses.stream()
                .noneMatch(reviewScoreGreaterThan95Predicate)
        ); // false
        System.out.println(
                courses.stream()
                .noneMatch(reviewScoreGreaterThan90Predicate)); // false
        System.out.println(
                courses.stream()
                .noneMatch(reviewScoreLessThan90Predicate)
                ); // true
        System.out.println(
                courses.stream()
                .anyMatch(reviewScoreLessThan90Predicate)
        ); // false
        System.out.println(
                courses.stream()
                .allMatch(reviewScoreLessThan90Predicate)
        ); // false
        System.out.println(
                courses.stream()
                .allMatch(reviewScoreGreaterThan90Predicate)
        ); // true


        // sorting courses with sorted and creating comparators
        Comparator comparingByNoOfStudents
                = Comparator.comparing(Course::getNoOfStudents);
        Comparator comparingByNoOfStudentsDecreasing
                = Comparator.comparing(Course::getNoOfStudents).reversed();

        Comparator<Course> comparingByNoOfStudentsAndNoOfReviews
                = Comparator.comparing(Course::getNoOfStudents).thenComparing(Course::getReviewScore);


        System.out.println(
                courses.stream()
                        .sorted(comparingByNoOfStudents)
                        .collect(Collectors.toList())
        );
        //output: [FullStack:14000:91, Spring Boot:18000:95, Spring:20000:98, Docker:20000:92, Kubernetes:20000:91,
        // AWS:21000:92, Azure:21000:99, API:22000:97, Microservices:25000:96]

        System.out.println(
                courses.stream()
                        .sorted(comparingByNoOfStudentsDecreasing)
                        .collect(Collectors.toList())
        );
//        output: [Microservices:25000:96, API:22000:97, AWS:21000:92, Azure:21000:99, Spring:20000:98, Docker:20000:92,
//        Kubernetes:20000:91, Spring Boot:18000:95, FullStack:14000:91]

        System.out.println("Sorted By comparing number of students and no of reviews: ");
        System.out.println(
                courses.stream()
                        .sorted(comparingByNoOfStudentsAndNoOfReviews)
                        .collect(Collectors.toList())
        );
        // output: [FullStack:14000:91, Spring Boot:18000:95, Kubernetes:20000:91, Docker:20000:92, Spring:20000:98,
        // AWS:21000:92, Azure:21000:99, API:22000:97, Microservices:25000:96]


        /** Finding top, max and min courses with max , min, findFirst and findAny **/

        // Finding the course with the highest number of students and reviews
        System.out.println(
                courses.stream()
                        .max(comparingByNoOfStudentsAndNoOfReviews)
        );
        // output: Optional[Microservices:25000:96]
        System.out.println("Returns the first element of the list");
        System.out.println(
                courses.stream()
                        .min(comparingByNoOfStudentsAndNoOfReviews)
        );
        // output: Optional[FullStack:14000:91]

        System.out.println(
                courses.stream()
                        .filter(reviewScoreLessThan90Predicate)
                        .min(comparingByNoOfStudentsAndNoOfReviews)
        );
        // output: Optional.empty

        System.out.println(
                courses.stream()
                        .filter(reviewScoreGreaterThan90Predicate)
                        .min(comparingByNoOfStudentsAndNoOfReviews)
        );
//        output: Optional[FullStack:14000:91]

        System.out.println(
                courses.stream()
                        .filter(reviewScoreLessThan90Predicate)
                        .min(comparingByNoOfStudentsAndNoOfReviews)
                        .orElse(new Course("Spring", "Framework", 98, 20000))
        );
//        output: Spring:20000:98

        /** Optional: Typically in java programming we are used to handling lot of nulls.
         * Using nulls as a way to indicate the absence of a value in our databases. However,
         * this causes nullPointerException. Optional is a way to get around that.
         */

        System.out.println("First course found with review score > 90:");
        System.out.println(
                courses.stream()
                        .filter(reviewScoreLessThan90Predicate)
                        .findFirst()
        );

//        output: Optional.empty?
        System.out.println(
                courses.stream()
                        .filter(reviewScoreGreaterThan90Predicate)
                        .findAny()
        );
//        output: Optional[Spring:20000:98]

    }
}

























