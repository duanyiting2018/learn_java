package duanyiting;

interface IMessage3
{
    public String message();
    public default boolean connect()
    {
        System.out.println("duanyiting");
        return true;
    }
}
class Message14 implements IMessage3
{
    public String message()
    {
        return "今天duanyiting感觉他————仙气飘飘~~~";
    }
}
public class class_interface3 {
    public static void main(String[] args) {
        IMessage3 msg=new Message14();
        if (msg.connect())
        {
            System.out.println(msg.message());
        }
    }
}
