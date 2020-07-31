package duanyiting;

interface IMessage2
{
    public static final String INFO="duanyiting";
    public abstract String getInfo( boolean is);
}
interface IChannel1
{
    public abstract void connect();
}
class Message13 implements IMessage2,IChannel1
{

    @Override
    public String getInfo(boolean is) {
        if (is)
        {
            return "duanyiting最帅！！！";
        }
        return "@#^#@%￥……%￥^&%&^￥*@#!%*&!￥@……￥%&%……!";
    }

    @Override
    public void connect() {
    }
}
public class class_interface2 {
    public static void main(String[] args) {
        IMessage2 msg=new Message13();
        System.out.println(msg.getInfo(true));
        System.out.println(msg.getInfo(false));
    }
}
