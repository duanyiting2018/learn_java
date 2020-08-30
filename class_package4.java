package duanyiting;

class Singleton1
{
    //在类中进行Single类对象实例化,
    //为了防止重复所以使用final关键词
    private static final Singleton1 INSTANCE=new Singleton1();
    private Singleton1(){}//构造方法私有化,外部无法实例化
    /**
     * 获取类实例化对象方法,static方法可以
     * 不受实例化对象的限制进行调用
     * @return INSTANCE内部实例化对象,
     * 调用多少次此方法都只返回同一个实例化对象
     */
    public static Singleton1 getInstance()
    {
        return INSTANCE;
    }
    public void print()
    {
        System.out.println("duanyiting");
    }
}
public class class_package4 {
    public static void main(String[] args) {
        Singleton1 instance=null;
        instance=Singleton1.getInstance();
        instance.print();
    }
}
