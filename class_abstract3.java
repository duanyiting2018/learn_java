package duanyiting;

abstract class Message10
{
    public abstract String getInfo();
    public static Message10 getInstance()
    {
        return new Message11();
    }
}
class Message11 extends Message10
{
    @Override
    public String getInfo()
    {
        return "duanyiting";
    }
}
public class class_abstract3 {
    public static void main(String[] args) {
        Message10 msg=Message10.getInstance();
        System.out.println(msg.getInfo());
    }
}
