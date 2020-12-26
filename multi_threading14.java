package duanyiting;
import java.lang.Runnable;
class Message19
{
    private String title;
    private String content;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void getContent(String s) {
    }
}
class Producer implements java.lang.Runnable
{
    private Message19 msg=null;
    public Producer(Message19 msg)
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
                this.msg.setTitle("段智华");
                try {
                    Thread.sleep(100);
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
                this.msg.setContent("Java讲师");
            }
            else
            {
                this.msg.setTitle("duanyiting");
                try {
                    Thread.sleep(100);
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
                this.msg.getContent("www.duanyiting.cn");
            }
        }
    }
}
class Consumer implements java.lang.Runnable
{
    private Message19 msg=null;
    public Consumer(Message19 msg)
    {
        this.msg=msg;
    }
    @Override
    public void run()
    {
        for (int x=0;x<50;x++)
        {
            try {
                Thread.sleep(100);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
            System.out.println(this.msg.getTitle()+"->"+this.msg.getContent());
        }
    }
}
public class multi_threading14 {
    public static void main(String[] args) {
        Message19 msg=new Message19();
        new Thread(new Producer(msg)).start();
        new Thread(new Consumer(msg)).start();
    }
}
