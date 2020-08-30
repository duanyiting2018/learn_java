package duanyiting;

class Singleton2
{
    //定义公共的instance属性,由于
    //需要实例化所以无法使用final关键字
    private static Singleton2 instance;
    private Singleton2(){}//构造方法私有化,外部无法实例化
    /**
     * 获取类实例化对象方法,static方法可以
     * 不受实例化对象的限制进行调用
     * @return 返回唯一的Singleton类的实例化对象
     */
    public static Singleton2 getInstance()
    {
        if (instance==null)
        {
            instance=new Singleton2();
        }
        return instance;
    }
    public void print()
    {
        System.out.println("duanyiting");
    }
}
public class class_package5 {
    public static void main(String[] args) {
        Singleton2 instance=null;
        instance=Singleton2.getInstance();
        instance.print();
    }
}
