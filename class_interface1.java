package duanyiting;

interface IMessage1
{
    public static final String INFO="www.aaa.cn";
    public abstract String getInfo();
}
class Message12 implements IMessage1
{
    @Override
    public String getInfo() {
        return "duanyiting:"+IMessage1.INFO;
    }
}
public class class_interface1 {
    public static void main(String[] args) {
        IMessage1 msg=new Message12();
        System.out.println(msg.getInfo());
    }
}
