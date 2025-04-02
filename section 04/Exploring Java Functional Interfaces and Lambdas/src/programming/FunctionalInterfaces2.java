package programming;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.*; // Importing functional interfaces

public class FunctionalInterfaces2 {
    public static void main(String[] args) {
        // Creating a list of integers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Predicate: Represents a boolean condition (returns true if the number is even)
        Predicate<Integer> isEvenPredicate = x -> x % 2 == 0;

        // Function: Takes an integer input and returns its square
        Function<Integer, Integer> squareFunction = x -> x * x;

        // Function: Takes an integer input and converts it into a string with space
        Function<Integer, String> stringOutputFunction = x -> x + " ";

        // Consumer: Takes an integer and prints it to the console
        Consumer<Integer> sysoutConsumer = x -> System.out.println(x);

        // BinaryOperator: Takes two integers and returns their sum
        BinaryOperator<Integer> sumBinaryOperator = (x, y) -> x + y;

        // Supplier: Provides a random integer (between 0 and 999) when called
        Supplier<Integer> randomIntegerSupplier = () -> {
            Random random = new Random();
            return random.nextInt(1000); // Generates a random number between 0 and 999
        };

        // Printing a random number using Supplier
        System.out.println(randomIntegerSupplier.get());

        // UnaryOperator: Takes an integer input and multiplies it by 3
        UnaryOperator<Integer> unaryOperator = (x) -> 3 * x;
        System.out.println(unaryOperator.apply(10)); // Output: 30
    }
}

/**
 ### Functional Interfaces in Java (Detailed Explanation)

 Java provides built-in functional interfaces in the `java.util.function` package that are used for lambda expressions and functional programming. Let's break down each interface in detail.

 ---

 ## **1. Predicate<T>**
 - **Purpose:** Represents a boolean-valued function that tests a condition on an input.
 - **Method:** `boolean test(T t)`
 - **Use case:** Used for filtering collections, validations, and conditions.

 ### **Example:**
 ```java
 Predicate<Integer> isEven = x -> x % 2 == 0;
 System.out.println(isEven.test(4)); // Output: true
 System.out.println(isEven.test(7)); // Output: false
 ```
 - The `test()` method returns `true` if the condition is met, otherwise `false`.

 ---

 ## **2. Function<T, R>**
 - **Purpose:** Represents a function that accepts an input of type `T` and returns a result of type `R`.
 - **Method:** `R apply(T t)`
 - **Use case:** Transforming data, mapping one type to another.

 ### **Example:**
 ```java
 Function<Integer, Integer> square = x -> x * x;
 System.out.println(square.apply(5)); // Output: 25
 ```
 - The `apply()` method transforms `x` into `x * x` and returns the result.

 ---

 ## **3. Consumer<T>**
 - **Purpose:** Represents an operation that takes an input but does not return anything.
 - **Method:** `void accept(T t)`
 - **Use case:** Printing values, logging, modifying objects.

 ### **Example:**
 ```java
 Consumer<String> printConsumer = s -> System.out.println(s);
 printConsumer.accept("Hello, Functional Interfaces!");
 // Output: Hello, Functional Interfaces!
 ```
 - The `accept()` method processes the input but does not return a result.

 ---

 ## **4. BinaryOperator<T>**
 - **Purpose:** A specialized `Function` that takes two inputs of the same type and returns a result of the same type.
 - **Method:** `T apply(T t1, T t2)`
 - **Use case:** Performing mathematical operations, combining values.

 ### **Example:**
 ```java
 BinaryOperator<Integer> sum = (a, b) -> a + b;
 System.out.println(sum.apply(10, 20)); // Output: 30
 ```
 - Adds two numbers and returns the sum.

 ---

 ## **5. Supplier<T>**
 - **Purpose:** Represents a function that provides a value but does not take any input.
 - **Method:** `T get()`
 - **Use case:** Generating values, fetching configurations, caching.

 ### **Example:**
 ```java
 Supplier<Double> randomValue = () -> Math.random();
 System.out.println(randomValue.get()); // Output: A random number
 ```
 - The `get()` method supplies a value when called.

 ---

 ## **6. UnaryOperator<T>**
 - **Purpose:** A specialized `Function` that takes one input and returns a result of the same type.
 - **Method:** `T apply(T t)`
 - **Use case:** Transforming values of the same type.

 ### **Example:**
 ```java
 UnaryOperator<Integer> triple = x -> x * 3;
 System.out.println(triple.apply(5)); // Output: 15
 ```
 - Multiplies a number by 3.

 ---

 ### **Summary Table:**

 | Functional Interface | Method Signature | Input | Output | Purpose |
 |----------------------|-----------------|-------|--------|---------|
 | `Predicate<T>` | `boolean test(T t)` | One value | `true` / `false` | Tests a condition |
 | `Function<T, R>` | `R apply(T t)` | One value | Transformed value | Converts one type to another |
 | `Consumer<T>` | `void accept(T t)` | One value | Nothing (side effect) | Performs an action |
 | `BinaryOperator<T>` | `T apply(T t1, T t2)` | Two values | One value | Performs an operation on two inputs |
 | `Supplier<T>` | `T get()` | No input | One value | Supplies a value |
 | `UnaryOperator<T>` | `T apply(T t)` | One value | One value | Transforms a value of the same type |

 ---

 These functional interfaces are widely used in Java Streams API, Lambda Expressions, and functional programming paradigms.

 */
