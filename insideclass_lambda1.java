package duanyiting;

interface IMessage12
{
    public void send(String str);
}
public class insideclass_lambda1 {
    public static void main(String[] args) {
        IMessage12 msg=(str) ->
        {
            System.out.println("发送信息:"+str);
        };
        msg.send("www.duanyiting.com");
    }
}
