package duanyiting;

//定义泛型数据只能为Number或子类
class Message17<T extends Number>
{
    private T content;

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }
}
public class class_fanxing4 {
    public static void main(String[] args) {
        Message17<Integer> msg=new Message17<Integer>();
        msg.setContent(12);
        fun(msg);
    }
    //定义泛型数据只能为Number或子类
    public static void fun(Message17<? extends Number> temp)
    {
        System.out.println(temp.getContent());
    }
}
