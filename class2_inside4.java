package duanyiting;

interface IChannel2
{
    public void send(IMessage10 msg);
    interface IMessage10
    {
        public String getContent();
    }
}
class Channel10 implements IChannel2
{
    public void send(IMessage10 msg)
    {
        System.out.println("请用一个字形容duanyiting:"+
                msg.getContent());
    }
    class MessageImpl1 implements IMessage10
    {
        public String getContent()
        {
            return "帅";
        }
    }
}
public class class2_inside4 {
    public static void main(String[] args) {
        IChannel2 channel=new Channel10();
        //实例化内部接口时要先获取外部类实例化对象
        channel.send(((Channel10) channel).new MessageImpl1());
    }
}
