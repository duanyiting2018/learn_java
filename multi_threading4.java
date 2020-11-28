package duanyiting;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

class MyThread4 implements Callable<String>
{
    @Override
    public String call() throws Exception
    {
        for (int x=0;x<10;x++)
        {
            System.out.println("线程执行,x="+x);
        }
        return "duanyiitng";
    }
}
public class multi_threading4 {
    public static void main(String[] args) throws Exception {
        //将Callable实例包装在FutureTask类中,这样就可以与Runnable接口连接
        FutureTask<String> task=new FutureTask<>(new MyThread4());
        new Thread(task).start();
        System.out.println("线程返回:"+task.get());
    }
}
