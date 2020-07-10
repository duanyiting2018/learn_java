package duanyiting;

abstract class Message8
{
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Message8(String type)
    {
        this.type=type;
    }
    public abstract String getCommitInfo();
}
class Message9 extends Message8
{
    public Message9(String type)
    {
        super(type);
    }
    @Override
    public String getCommitInfo()
    {
        return "duanyiting"+super.getType();
    }
}
public class class_abstract2 {
    public static void main(String[] args) {
        Message8 msg=new Message9("woman");
        System.out.println(msg.getCommitInfo());
    }
}
