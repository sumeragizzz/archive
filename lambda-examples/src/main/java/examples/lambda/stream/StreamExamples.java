package examples.lambda.stream;

import java.util.Arrays;
import java.util.List;

public class StreamExamples {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("AAA", "BBB", "CCC");

        list.stream().filter(s -> s.startsWith("A")).forEach(System.out::println);

        List<Bean> beanList = Arrays.asList(
                new Bean(1, Type.Enable, "A"), new Bean(2, Type.Disable, "B"), new Bean(3, Type.Enable, "C"));

        beanList.stream().filter(b -> b.getType().equals(Type.Enable)).map(b -> b.getValue()).forEach(v -> System.out.println(v));
    }

    public static class Bean {
        private int key;
        private Type type;
        private String value;

        public Bean(int key, Type type, String value) {
            super();
            this.key = key;
            this.type = type;
            this.value = value;
        }

        public int getKey() {
            return key;
        }

        public void setKey(int key) {
            this.key = key;
        }

        public Type getType() {
            return type;
        }

        public void setType(Type type) {
            this.type = type;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }

    public enum Type {
        Enable, Disable
    }

}
