package duanyiting;

interface IMessage9
{
    public String getMessage();
}
enum Color7 implements IMessage9
{
    RED("红色"),GREEN("绿色"),BLUE("蓝色");//枚举对象要写在首行
    private String title;
    private Color7(String title)
    {
        this.title=title;
    }
    @Override
    public String toString()
    {
        return this.title;
    }

    @Override
    public String getMessage() {
        return this.title;
    }
}
public class class_package12 {
    public static void main(String[] args) {
        IMessage9 msg=Color7.RED;
        System.out.println(msg.getMessage());
    }
}
