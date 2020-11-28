package duanyiting;
class MyThread1 extends Thread
{
    private String title;
    public MyThread1(String title)
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
public class multi_threading1 {
    public static void main(String[] args) {
        new MyThread1("线程A").start();
        new MyThread1("线程B").start();
        new MyThread1("线程C").start();
    }
}
