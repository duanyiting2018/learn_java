package duanyiting;

interface IChannel3
{
    public void send();
    abstract class A_Message1
    {
        public abstract String getContent();
    }
}
class Channel11 implements IChannel3
{
    class MessageImpl2 extends A_Message1
    {
        public String getContent()
        {
            return "duanyiting";
        }
    }
    public void send()
    {
        A_Message1 msg=new MessageImpl2();
        System.out.println(msg.getContent());
    }
}
public class class2_inside5 {
    public static void main(String[] args) {
        IChannel3 channel=new Channel11();
        channel.send();
    }
}
