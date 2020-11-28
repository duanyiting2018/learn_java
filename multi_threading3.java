package duanyiting;
class MyThread3 implements java.lang.Runnable
{
    private int ticket=10;
    @Override
    public void run()
    {
        for (int x=0;x<100;x++)
        {
            if (this.ticket>0)
            {
                System.out.println("买票,ticket="+this.ticket--);
            }
        }
    }
}
public class multi_threading3 {
    public static void main(String[] args) {
        MyThread3 mt=new MyThread3();
        new Thread(mt).start();
        new Thread(mt).start();
        new Thread(mt).start();
    }
}
