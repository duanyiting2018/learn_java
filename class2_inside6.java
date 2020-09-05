package duanyiting;

interface IChannel4
{
    public void send();
    class ChannelImpl1 implements IChannel4
    {
        public void send()
        {
            System.out.println("duanyiting");
        }
    }
    public static IChannel4 getInstance()
    {
        return new ChannelImpl1();
    }
}
public class class2_inside6 {
    public static void main(String[] args) {
        IChannel4 channel=IChannel4.getInstance();
        channel.send();
    }
}
