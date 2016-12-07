package experiment.lang.trycatch;

import java.util.Arrays;

public class MultiThrow {

    public static void main(String[] args) {
        System.out.format("%d%n", "ABC");
        try {
            try {
                throw new Exception("A");
            } finally {
                throw new Exception("B");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            Arrays.stream(e.getSuppressed()).forEach(System.out::println);
        }
    }

}
