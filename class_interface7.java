package duanyiting;

interface Ieat1
{
    public void get();
}
class EatReal implements Ieat1
{
    public void get()
    {
        System.out.println("【真实主题】得到食物,开吃！");
    }
}
class EatProxy implements Ieat1
{
    private Ieat1 eat;
    public EatProxy(Ieat1 eat)
    {
        this.eat=eat;
    }
    public void get()
    {
        this.prepare();
        this.eat.get();
        this.clear();
    }
    public void prepare()
    {
        System.out.println("【代理主题】1：购买食材");
        System.out.println("【代理主题】2：处理食材");
    }
    public void clear()
    {
        System.out.println("【代理主题】3：清理食材");
    }
}
public class class_interface7 {
    public static void main(String[] args) {
        Ieat1 eat=new EatProxy(new EatReal());
        eat.get();
    }
}
