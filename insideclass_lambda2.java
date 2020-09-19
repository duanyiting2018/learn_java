package duanyiting;

@FunctionalInterface
interface IMath1
{
    public int add(int x,int y);
}
public class insideclass_lambda2 {
    public static void main(String[] args) {
        IMath1 math=(t1,t2) ->t1+t2;
        System.out.println(math.add(10,15));
    }
}
