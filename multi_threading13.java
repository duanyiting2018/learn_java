package duanyiting;
import java.lang.Runnable;
class MyBook
{
   public synchronized void tell(Painting paint)
   {
       System.out.println("a对b说：把你的画给我，我就给你书。");
       //paint.get();
   }
   public synchronized void get()
   {
       System.out.println("a得到了b的画。");
   }
}
class Painting
{
    public synchronized void tell(MyBook book)
    {
        System.out.println("b对a说：把你的书给我，我就给你画。");
        //book.get();
    }
    public synchronized void get()
    {
        System.out.println("b得到了a的书。");
    }
}
public class multi_threading13 implements java.lang.Runnable{
    private MyBook book=new MyBook();
    private Painting paint=new Painting();
    public multi_threading13()
    {
        new Thread(this).start();
        book.tell(paint);
    }
    @Override
    public void run()
    {
        paint.tell(book);
    }
    public static void main(String[] args) {
        new multi_threading13();
    }
}
