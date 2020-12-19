package duanyiting;

class MyThread7 implements java.lang.Runnable
{
    private int ticket=3;
    @Override
    public void run()
    {
        while (this.sale())
        {
            ;
        }
    }
    public synchronized boolean sale()
    {
        if (this.ticket>0)
        {
            try {
                Thread.sleep(100);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+
                    "买票，ticket="+this.ticket--);
            return true;
        }
        else {
            System.out.println("*****票已卖光*****");
            return false;
        }
    }
}
public class multi_threading12 {
    public static void main(String[] args) {
        MyThread6 mt=new MyThread6();
        new Thread(mt,"售票员a").start();
        new Thread(mt,"售票员b").start();
        new Thread(mt,"售票员c").start();
    }
}
