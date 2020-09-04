package duanyiting;

class Outer2
{
    private String msg="duanyiting";
    public void fun()
    {
        Inner in=new Inner();
        in.print();
        System.out.println(in.info);
    }
    class Inner
    {
        private String info="www.aaa.com";
        public void print()
        {
            System.out.println(Outer2.this.msg);
        }
    }
}
public class class2_inside2 {
    public static void main(String[] args) {
        Outer2 out=new Outer2();
        out.fun();
    }
}
