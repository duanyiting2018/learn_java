package duanyiting;

interface IMessage5<T>
{
    public String echo(T msg);
}
class IMessage6<S> implements IMessage5<S>
{
    public String echo(S t)
    {
        return "[echo]"+t;
    }
}
public class class_fanxing6 {
    public static void main(String[] args) {
        //实例化泛型对象,同时设置泛型类型
        IMessage5<String> msg=new IMessage6<>();
        System.out.println(msg.echo("duanyting"));
    }
}
