package duanyiting;

public class often_class7 {
    public static void main(String[] args) throws Exception{
        //自动关闭机制需要在try语句中获取实例化对象，然后才会调用close()
        //不管是否产生异常都会调用close()方法
        try(IMessage14 nm=new NetMessage("www.duanyiting.com"))
        {
            nm.send();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
interface IMessage14 extends AutoCloseable
{
    public void send();
}
class NetMessage implements IMessage14
{
    private String msg;
    public NetMessage(String msg)
    {
        this.msg=msg;
    }
    public boolean open()
    {
        System.out.println("【open】获取消息发送连接资源");
        return true;
    }
    @Override
    public void send()
    {
        if(this.open())
        {
            if (this.msg.contains("duanyiting"))
            {
                throw new RuntimeException("duanyiting");
            }
            System.out.println("【***发送消息***】"+this.msg);
        }
    }
    public void close() throws Exception
    {
        System.out.println("【close】关闭消息发送通道");
    }
}
