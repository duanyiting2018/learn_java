package duanyiting;

class Person__2
{
    public Person__2()
    {
        System.out.println("【构造方法】");
    }
    static {
        System.out.println("【构造静态代码块】");
    }
    {
        System.out.println("【构造代码块】");
    }
}
public class code_block3 {
    public static void main(String[] args) {
        new Person__2();
        new Person__2();
    }
}
