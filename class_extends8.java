package duanyiting;

class Channel5
{
    public void connect()
    {
        System.out.println("【父类Channel5类】");
    }
}
class Channel6 extends Channel5
{
    @Override
    public void connect()
    {
        System.out.println("【子类Channel6类】");
    }
}
public class class_extends8 {
    public static void main(String[] args) {
        new Channel6().connect();
    }
}
