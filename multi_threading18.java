package duanyiting;
import java.lang.Runnable;
class MyThread8 implements java.lang.Runnable
{
    private volatile int ticket=3;
    @Override
    public void run()
    {
        synchronized (this)
        {
            while (this.ticket>0)
            {
                try {
                    Thread.sleep(100);
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().
                        getName()+"买票处理,ticket="+this.ticket--);
            }
        }
    }
}
public class multi_threading18 {
    public static void main(String[] args) {
        MyThread8 mt=new MyThread8();
        new Thread(mt,"售票员a").start();
        new Thread(mt,"售票员b").start();
        new Thread(mt,"售票员c").start();
    }
}
