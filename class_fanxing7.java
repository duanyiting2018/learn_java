package duanyiting;

interface IMessage7<T>
{
    public String echo(T msg);
}
class IMessage8 implements IMessage7<String>
{
    public String echo(String t)
    {
        return "[ECHO]"+t;
    }
}
public class class_fanxing7 {
    public static void main(String[] args) {
        //实例化泛型对象,同时设置泛型类型
        IMessage7<String> msg=new IMessage8();
        System.out.println(msg.echo("www.duanyting.cn"));
    }
}
