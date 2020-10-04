package duanyiting;
@FunctionalInterface
interface IFunction1 <P,R>
{
    public R range(P p);
}
public class insideclass_yinyong1 {
    public static void main(String[] args) {
        //引用String类中的一个静态方法
        IFunction1<Integer,String> fun=String::valueOf;
        String str=fun.range(10000);
        System.out.println(str.length());
    }
}
