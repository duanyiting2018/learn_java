package duanyiting;

public class multi_threading8 {
    public static void main(String[] args) throws Exception{
        Thread thread=new Thread(()->
        {
            System.out.println("【before】准备睡觉10秒钟,不要打扰我!");
            try {
                Thread.sleep(10000);
                System.out.println("【finish】睡醒了,开始工作和学习。");
            }
            catch (InterruptedException e)
            {
                System.out.println("【exception】睡觉被打扰了,很生气!");
            }
        });
        thread.start();
        Thread.sleep(1000);
        if (!thread.isInterrupted())
        {
            System.out.println("【interrupt】敲锣打鼓地路过你睡觉的地方!");
            thread.interrupt();
        }
    }
}
