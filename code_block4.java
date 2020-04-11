package duanyiting;

class Message3
{
    public static String getCountry()
    {
        return "www.github.com";
    }
}
class Person__3
{
    private static String country;
    static {//静态代码块
        country=Message3.getCountry();//调用静态方法
        System.out.println(country);
    }
}
public class code_block4 {
    public static void main(String[] args) {
        new Person__3();
    }
}
