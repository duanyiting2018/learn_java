package duanyiting;

public class multi_threading17 {
    public static void main(String[] args) throws Exception {
        Thread userThread=new Thread(()->
        {
            for (int x=0;x<2;x++)
            {
                try {
                    Thread.sleep(100);
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"正在运行,x="+x);
            }
        },"用户线程");
        Thread daemonThread=new Thread(()->
        {
            for (int x=0;x<Integer.MAX_VALUE;x++)
            {
                try {
                    Thread.sleep(100);
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"正在运行,x="+x);
            }
        },"守护线程");
        daemonThread.setDaemon(true);
        userThread.start();
        daemonThread.start();
    }
}
