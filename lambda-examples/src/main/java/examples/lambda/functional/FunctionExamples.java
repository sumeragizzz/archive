package examples.lambda.functional;

import java.math.BigDecimal;
import java.util.function.Function;
import java.util.function.Supplier;

public class FunctionExamples {

    public static void main(String[] args) {
        Function<BigDecimal, String> function = (v) -> v.toPlainString();
        BigDecimal value = BigDecimal.valueOf(1234567890123456789.0);
        func(value, function);
        System.out.println(value.toString());

        Supplier<String> supplier = () -> value.toPlainString();
        System.out.println(supplier.get());
    }

    private static void func(BigDecimal value, Function<BigDecimal, String> function) {
        System.out.println(function.apply(value));
    }

}
