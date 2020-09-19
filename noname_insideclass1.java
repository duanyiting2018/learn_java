package duanyiting;

interface IMessage11
{
    public void send(String str);
}
public class noname_insideclass1 {
    public static void main(String[] args) {
        IMessage11 msg = new IMessage11() {
            public void send(String str) {
                System.out.println(str);
            }
        };
        msg.send("duanyiting");
    }
}
