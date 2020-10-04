package duanyiting;
import java.util.function.*;
public class insideclass_yinyong6 {
    public static void main(String[] args) {
        Consumer<String> consumer=System.out::println;
        consumer.accept("www.aaa.com");
    }
}
