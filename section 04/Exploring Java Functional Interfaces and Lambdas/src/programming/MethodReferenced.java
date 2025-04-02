package programming;

import java.util.List;
import java.util.function.Supplier;

public class MethodReferenced {
    public static void main(String[] args) {
        List<String> courses
                = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernates");

        courses.stream()
//                .map(str -> str.toUpperCase())
//                .forEach(str -> System.out.println(str));
                .map(String::toUpperCase)
                .forEach(MethodReferenced::print);

        Supplier<String> supplier = () -> new String("hello");
        Supplier<String> supplier2 = String::new;
        System.out.println(supplier.get());

    }

    private static void print(String s) {
        System.out.println(s);
    }
}
