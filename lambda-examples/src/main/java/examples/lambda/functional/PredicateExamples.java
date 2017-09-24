package examples.lambda.functional;

import java.util.function.Predicate;

public class PredicateExamples {

    public static void main(String[] args) {
        Predicate<String> predicate = s -> s.equals("abc");
        func(predicate);
    }

    public static void func(Predicate<String> predicate) {
        if (predicate.test("def")) {
            System.out.println("A");
        } else {
            System.out.println("B");
        }
    }

}
