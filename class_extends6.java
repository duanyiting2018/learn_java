package duanyiting;

class Channel1
{
    public void connect()
    {
        System.out.println("a");
    }
}
class Channel2 extends Channel1
{
    public void connect()
    {
        System.out.println("b");
    }
}
public class class_extends6 {
    public static void main(String[] args) {
        Channel2 channel=new Channel2();
        channel.connect();
    }
}
