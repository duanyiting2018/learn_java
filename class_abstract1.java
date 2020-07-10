package duanyiting;

abstract class Message6
{
    private String type;
    public abstract String getConnectInfo();
    public void setType(String type)
    {
        this.type=type;
    }
    public String getType()
    {
        return this.type;
    }
}
class Message7 extends Message6
{
    @Override
    public String getConnectInfo()
    {
        return "duanyiting";
    }
}
public class class_abstract1 {
    public static void main(String[] args) {
        Message6 msg=new Message7();
        msg.setType("man");
        System.out.println(msg.getType());
        System.out.println(msg.getConnectInfo());
    }
}
