package duanyiting;

class Channel3
{
    public void connect()
    {
        System.out.println("a");
    }
}
class Channel4 extends Channel3
{
    public void connect()
    {
        super.connect();
        System.out.println("b");
    }
}
public class class_extends7 {
    public static void main(String[] args) {
        Channel4 channel=new Channel4();
        channel.connect();
    }
}
