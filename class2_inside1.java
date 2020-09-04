package duanyiting;

class Outer1
{
    private String msg="duanyiting";
    public void fun()
    {
        Inner in=new Inner();
        in.print();
    }
    class Inner
    {
        public void print()
        {
            System.out.println(Outer1.this.msg);
        }
    }
}
public class class2_inside1 {
    public static void main(String[] args) {
        Outer1 out=new Outer1();
        out.fun();
    }
}
