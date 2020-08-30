package duanyiting;

enum Color5
{
    RED,GREEN,BLUE;
}
public class class_package10 {
    public static void main(String[] args) {
        for (Color4 color:Color4.values())
        {
            System.out.println(color.ordinal()+"-"+color.name());
        }
    }
}
