package examples.lambda.functional;

import java.util.function.BooleanSupplier;
import java.util.function.DoubleSupplier;
import java.util.function.IntSupplier;
import java.util.function.LongSupplier;
import java.util.function.Supplier;

public class SupplierExamples {

    public static void main(String[] args) {
        func(() -> "AAA");

        Supplier<String> supplier1 = () -> "BBB";
        func(supplier1);

        Supplier<String> supplier2 = new Supplier<String>() {
            @Override
            public String get() {
                return "CCC";
            }
        };
        func(supplier2);

        func(() -> false);

        func(() -> 100);

        func(() -> (long) Integer.MAX_VALUE + 1L);

        func(() -> 3.0);
    }

    public static void func(Supplier<String> supplier) {
        System.out.println(supplier.get());
    }

    public static void func(BooleanSupplier supplier) {
        System.out.println(supplier.getAsBoolean());
    }

    public static void func(IntSupplier supplier) {
        System.out.println(supplier.getAsInt());
    }

    public static void func(LongSupplier supplier) {
        System.out.println(supplier.getAsLong());
    }

    public static void func(DoubleSupplier supplier) {
        System.out.println(supplier.getAsDouble());
    }

}
