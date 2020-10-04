package duanyiting;

@FunctionalInterface
interface IFunction2<R>
{
    public R upper();
}
public class insideclass_yinyong2 {
    public static void main(String[] args) {
        IFunction2<String> fun="duanyiting"::toUpperCase;
        System.out.println(fun.upper());
    }
}
