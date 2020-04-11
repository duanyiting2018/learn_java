package duanyiting;

class Person__1
{
    public Person__1()
    {
        System.out.println("【构造方法】");
    }
    {
        System.out.println("【构造代码块】");
    }
}
public class code_block2 {
    public static void main(String[] args) {
        new Person__1();
        new Person__1();
    }
}
