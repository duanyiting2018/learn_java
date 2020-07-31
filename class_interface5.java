package duanyiting;

interface IUSB
{
    public boolean check();
    public void work();
}
class Computer1
{
    public void plugin(IUSB usb)
    {
        if (usb.check())
        {
            usb.work();
        }
        else
        {
            System.out.println("U盘出现问题,无法使用。");
        }
    }
}
class Keyboard implements IUSB
{
    public boolean check()
    {
        return true;
    }
    public void work()
    {
        System.out.println("工作中。。。");
    }
}
class Print implements IUSB
{
    public boolean check()
    {
        return false;
    }
    public void work()
    {
        System.out.println("工作偷懒中。。。");
    }
}
public class class_interface5 {
    public static void main(String[] args) {
        Computer1 computer=new Computer1();
        computer.plugin(new Keyboard());
        computer.plugin(new Print());
    }
}
