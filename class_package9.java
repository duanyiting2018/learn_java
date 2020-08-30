package duanyiting;

enum Color4
{
    RED,GREEN,BLUE;
}
public class class_package9 {
    public static void main(String[] args) {
        Color4 color=Color4.BLUE;
        switch(color)
        {
            case RED:
                System.out.println("红色");
                break;
            case BLUE:
                System.out.println("蓝色");
                break;
            case GREEN:
                System.out.println("绿色");
                break;
        }
    }
}
