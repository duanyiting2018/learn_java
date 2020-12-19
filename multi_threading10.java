package duanyiting;
import java.lang.Runnable;
public class multi_threading10 {
    public static void main(String[] args)throws Exception {
        Runnable run=()->{
            for (int x=0;x<10;x++)
            {
                try {
                    Thread.sleep(100);
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"执行");
            }
        };
        Thread threadA=new Thread(run,"线程A");
        Thread threadB=new Thread(run,"线程B");
        Thread threadC=new Thread(run,"线程C");
        threadA.setPriority(Thread.MIN_PRIORITY);
        threadB.setPriority(Thread.NORM_PRIORITY);
        threadC.setPriority(Thread.MAX_PRIORITY);
        threadA.start();
        threadB.start();
        threadC.start();
    }
}
