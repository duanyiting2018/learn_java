package duanyiting;
import java.util.function.*;
public class insideclass_yinyong5 {
    public static void main(String[] args) {
        Function<String,Boolean> fun="---duanyiting"::startsWith;
        System.out.println(fun.apply("---"));
    }
}
