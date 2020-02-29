package duanyiting;

public class constant_and_variable {
    static final double PI=3.14;
    static int age=23;
    public static void main(String[] args) {
        final int number;
        number=1338;
        age=35;
        //number=1345; <-that is wrong!(Don't assignment again!)
        System.out.println("常量PI的值为："+PI);
        System.out.println("赋值后number的值为："+number);
        System.out.println("int值变量age的值为："+age);
    }
}
