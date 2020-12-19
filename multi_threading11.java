package duanyiting;

class MyThread6 implements java.lang.Runnable
{
    private int ticket=3;
    @Override
    public void run()
    {
        while (true)
        {
            synchronized (this)
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
                }
                else {
                    System.out.println("*****票已卖光*****");
                    break;
                }
            }
        }
    }
}
public class multi_threading11 {
    public static void main(String[] args) {
        MyThread6 mt=new MyThread6();
        new Thread(mt,"售票员a").start();
        new Thread(mt,"售票员b").start();
        new Thread(mt,"售票员c").start();
    }
}
