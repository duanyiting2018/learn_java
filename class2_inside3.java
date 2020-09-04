package duanyiting;

class Outer3
{
     private String msg="http://baidu.com";
     class Inner
     {
         public void print()
         {
             System.out.println(Outer3.this.msg);
         }
     }
}
public class class2_inside3 {
    public static void main(String[] args) {
        Outer3.Inner in=new Outer3().new Inner();
        in.print();
    }
}
