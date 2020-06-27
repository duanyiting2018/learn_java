package duanyiting;

class Message4
{
    public void print()
    {
        System.out.println("www.aaa.com");
    }
}
class myMessage extends Message4
{
    public void print()
    {
        System.out.println("www.bbb.com");
    }
}
class yourMessage extends Message4
{
    public void print()
    {
        System.out.println("www.ccc.com");
    }
}
public class class_extends11 {
    public static void main(String[] args) {
        Message4 msgA=new myMessage();
        msgA.print();
        Message4 msgB= new yourMessage();
        msgB.print();
    }
}
