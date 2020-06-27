package duanyiting;

class Message5
{
    public void print()
    {
        System.out.println("www.aaa.com");
    }
}
class myMessage2 extends Message5
{
    public void print()
    {
        System.out.println("www.bbb.com");
    }
}
class yourMessage2 extends Message5
{
    public void print()
    {
        System.out.println("www.ccc.com");
    }
}
class Channel9
{
    /**
     * 可以接受所有子类实例
     */
    public static void send(Message5 msg)
    {
        msg.print();
    }
}
public class class_extends12 {
    public static void main(String[] args) {
        Channel9.send(new myMessage2());
        Channel9.send(new yourMessage2());
    }
}
