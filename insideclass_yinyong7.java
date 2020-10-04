package duanyiting;
import java.util.function.*;
public class insideclass_yinyong7 {
    public static void main(String[] args) {
        Supplier<String> supplier="www.DUANYITING.com"::toLowerCase;
        System.out.println(supplier.get());
    }
}
