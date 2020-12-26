package duanyiting;

class Message20
{
    private String title;
    private String content;
    private boolean flag=true;
    //flag=true:允许生产但不允许消费
    //flag=false:允许消费但不允许生产
    public synchronized void set(String title,String content)
    {
        if(this.flag==false)
        {
            try {
                super.wait();
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
        this.title=title;
        try {
            Thread.sleep(100);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        this.content=content;
        this.flag=false;
        super.notify();
    }
    public synchronized String get()
    {
        if (this.flag=true)
        {
            try {
                super.wait();
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
        try {
            Thread.sleep(10);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        try {
            return this.title+"-"+this.content;
        }
        finally {
            this.flag=true;
            super.notify();
        }
    }
}
class Producer2 implements java.lang.Runnable
{
    private Message20 msg=null;
    public Producer2(Message20 msg)
    {
        this.msg=msg;
    }
    @Override
    public void run()
    {
        for (int x=0;x<50;x++)
        {
            if(x%2==0)
            {
                this.msg.set("段智华","Java讲师");
            }
            else
            {
                this.msg.set("duanyiting","www.duanyiting.cn");
            }
        }
    }
}
class Consumer2 implements java.lang.Runnable
{
    private Message20 msg=null;
    public Consumer2(Message20 msg)
    {
        this.msg=msg;
    }
    @Override
    public void run()
    {
        for (int x=0;x<50;x++)
        {
            System.out.println(this.msg.get());
        }
    }
}
public class multi_threading15 {
    public static void main(String[] args) throws Exception{
        Message20 msg=new Message20();
        new Thread(new Producer2(msg)).start();
        new Thread(new Consumer2(msg)).start();
    }
}
