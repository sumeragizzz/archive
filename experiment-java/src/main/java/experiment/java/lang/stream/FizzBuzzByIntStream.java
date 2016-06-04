package experiment.java.lang.stream;

import java.util.stream.IntStream;

public class FizzBuzzByIntStream {
    public static void main(String[] args) {
        IntStream.rangeClosed(1, Integer.parseInt(args[0])).mapToObj(i -> {
            StringBuilder builder = new StringBuilder();
            if (i % 3 == 0) {
                builder.append("Fizz");
            }
            if (i % 5 == 0) {
                builder.append("Buzz");
            }
            return (builder.length() == 0) ? Integer.toString(i) : builder.toString();
        }).forEach(System.out::println);
    }
}
