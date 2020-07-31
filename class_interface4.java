package duanyiting;

interface IMessage4
{
    public String message();
    public default boolean connect()
    {
        System.out.println("duanyiting");
        return true;
    }
    public static IMessage4 getInstance()
    {
        return new Message15();
    }
}
class Message15 implements IMessage4
{
    public String message()
    {
        if (this.connect())
        {
            return "今天duanyiting感觉他————仙气飘飘~~~";
        }
        else
        {
            return "无信息";
        }
    }
}
public class class_interface4 {
    public static void main(String[] args) {
        IMessage4 msg=IMessage4.getInstance();
        System.out.println(msg.message());
    }
}
