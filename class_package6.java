package duanyiting;

class Color
{
    //在类内部提供若干个实例化对象
    private static final Color RED=new Color("红色");
    private static final Color GREEN=new Color("绿色");
    private static final Color BLUE=new Color("蓝色");
    private String title;

    private Color(String title)
    {
        this.title=title;
    }
    public static Color getInstance(String color)
    {
        switch (color)
        {
            case "red":
                return RED;
            case "green":
                return GREEN;
            case "blue":
                return BLUE;
            default:
                return null;
        }
    }
    public String toString()
    {
        return this.title;
    }
}
public class class_package6 {
    public static void main(String[] args) {
        Color color=Color.getInstance("green");
        System.out.println(color);
    }
}
