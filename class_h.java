package duanyiting;


class Message2
{
    private Channel channel;
    private String title;
    private String content;
    public Message2(Channel channel,String title,String content)
    {
        this.channel=channel;
        this.title=title;
        this.content=content;
    }
    public void send()
    {
        if (this.channel.isConnect())
        {
            System.out.println("消息标题："+this.title+"\t消息内容："+this.content);
        }
        else
        {
            System.out.println("error:没有可用的链接通道，无法发送消息");
        }
    }
}
class Channel
{
    private Message2 message;
    public Channel(String title,String content)
    {
        this.message=new Message2(this,title,content);
        this.message.send();
    }
    public boolean isConnect()
    {
        return true;
    }
}
public class class_h {
    public static void main(String[] args) {
        Channel ch=new Channel("运动会","大家一起长跑5公里吧。");
    }
}
