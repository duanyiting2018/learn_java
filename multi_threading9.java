package duanyiting;

public class multi_threading9 {
    public static void main(String[] args)throws Exception {
        Thread mainThread=Thread.currentThread();
        Thread thread=new Thread(()->{
            for (int x=0;x<100;x++)
            {
                if(x==30)
                {
                    try{
                        mainThread.join();
                    }
                    catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                }
                try {
                    Thread.sleep(100);
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"执行，x="+x);
            }
        },"玩耍的线程");
        thread.start();
        for(int x=0;x<100;x++)
        {
            Thread.sleep(100);
            System.out.println("【霸道的main线程】number="+x);
        }
    }
}
