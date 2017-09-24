package examples.lambda.functional;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

public class ConsumerExamples {

    public static void main(String[] args) {
        func((String s) -> System.out.println(s));

        func((int v) -> System.out.println(v));
    }

    public static void func(Consumer<String> consumer) {
        consumer.accept("Hello World!");
    }

    public static void func(IntConsumer consumer) {
        consumer.accept(100);
    }

}
