package duanyiting;

interface IMessage13
{
    public void send(String str);
    public static IMessage13 getInstance()
    {
        return new IMessage13() {
            public void send(String str) {
                System.out.println(str);
            }
        };
    }
}
public class noname_insideclass2 {
    public static void main(String[] args) {
        IMessage13.getInstance().send("duanyiting");
    }
}
