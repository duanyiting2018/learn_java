package duanyiting;
@FunctionalInterface
interface Runnable
{
    public void run();
}
class MyThread2 implements Runnable
{
    private String title;
    public MyThread2(String title)
    {
        this.title=title;
    }
    @Override
    public void run()
    {
        for (int x=0;x<10;x++)
        {
            System.out.println(this.title+"运行,x="+x);
        }
    }
}
public class multi_threading2 {
    public static void main(String[] args) {
        Thread threadA=new Thread(new Thread("线程对象A"));
        Thread threadB=new Thread(new Thread("线程对象B"));
        Thread threadC=new Thread(new Thread("线程对象C"));
        threadA.start();
        threadB.start();
        threadC.start();
    }
}
