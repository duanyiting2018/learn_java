package duanyiting;
@FunctionalInterface
interface IFunction3<P>
{
    public int compare(P p1,P p2);
}
public class insideclass_yinyong3 {
    public static void main(String[] args) {
        IFunction3<String> fun=String::compareTo;
        System.out.println(fun.compare("DUanYItiNG","duANyiTIng"));
    }
}
