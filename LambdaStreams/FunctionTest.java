package LambdaStreams;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionTest {

    static Predicate<Integer> isEven = number -> (number % 2 == 0);
    static Function<Integer, Integer> doubleIt = number -> (number * 2);
    static Consumer<Integer> printer = number -> System.out.println("Result: " + number);

    public static void main(String[] args) {
        int list[] = {1, 2, 3, 4, 5};

        for (int n : list) {
            if (isEven.test(n)) {
                int res = doubleIt.apply(n);
                printer.accept(res);
            }
        }
    }
}
