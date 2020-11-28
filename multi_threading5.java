package duanyiting;

import java.lang.Runnable;
class MyThread5 implements Runnable
{
    @Override
    public void run()
    {
        System.out.println(Thread.currentThread().getName());
    }
}
public class multi_threading5 {
    public static void main(String[] args) {
        MyThread5 mt=new MyThread5();
        new Thread(mt,"线程对象").start();
        mt.run();
    }
}
