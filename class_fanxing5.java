package duanyiting;

class Message18<T>
{
    private T content;

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }
}
public class class_fanxing5 {
    public static void main(String[] args) {
        Message18<String> msg=new Message18<String>();
        msg.setContent("duanyiting");
        fun(msg);
    }
    //定义泛型数据只能为String或父类
    public static void fun(Message18<? super String> temp)
    {
        System.out.println(temp.getContent());
    }
}
