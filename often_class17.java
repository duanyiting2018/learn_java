package duanyiting;
import java.util.Timer;
import java.util.TimerTask;
class MyTask extends TimerTask
{
    @Override
    public void run()
    {
        System.out.println(Thread.currentThread().getName()+
                " 定时任务执行，当前时间："+System.currentTimeMillis());
    }
}
public class often_class17 {
    public static void main(String[] args) throws Exception{
        Timer timer=new Timer();
        timer.scheduleAtFixedRate(new MyTask(),100,1000);
    }
}
