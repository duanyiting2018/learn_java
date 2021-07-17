package builder_pattern.test;

import builder_pattern.main.Builder;
import org.junit.Test;

public class builder_test {
    @Test
    public void builder_test(){
        Builder builder=new Builder();
        System.out.println(builder.levelOne(132.52D).getDetail());
        System.out.println(builder.levelTwo(98.25D).getDetail());
        System.out.println(builder.levelThree(85.43D).getDetail());
    }
}
