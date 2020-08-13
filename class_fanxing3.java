package duanyiting;

class Message16<T>
{
    private T content;

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }
}
public class class_fanxing3 {
    public static void main(String[] args) {
        Message16<String> msg=new Message16<String>();
        msg.setContent("duanyiting");
        fun(msg);
    }
    //?可以不限制类型并不可以修改temp
    public static void fun(Message16<?> temp)
    {
        System.out.println(temp.getContent());
    }
}
