package duanyiting;

enum Color6
{
    RED("红色"),GREEN("绿色"),BLUE("蓝色");//枚举对象要写在首行
    private String title;
    private Color6(String title)
    {
        this.title=title;
    }
    @Override
    public String toString()
    {
        return this.title;
    }
}
public class class_package11 {
    public static void main(String[] args) {
        for (Color6 color:Color6.values())
        {
            System.out.println(color.ordinal()+"-"+
            color.name()+"-"+color);
        }
    }
}
