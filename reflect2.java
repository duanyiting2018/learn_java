interface IMessage1{
    public void send();
}
class CloudMessage implements IMessage1{
    @Override
    public void send(){
        System.out.println("【云消息】www.aaa.cn");
    }
}
class NetMessage implements IMessage1{
    public void send(){
        System.out.println("【网络消息】www.aaa.cn");
    }
}
class Factory1{
    private Factory1(){}
    /**
     * 获取接口实例化对象
     * @param className 实例化对象名称
     * @param clazz 返回实例化对象类型
     * @return 如果子类存在则返回指定实例化对象，否则返回null
     */
    @SuppressWarnings("unchecked")
    public static <T> T getInstance(String className,Class<T> clazz){
        T instance=null;
        try {
            instance=(T) Class.forName(className).getConstructor().newInstance();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return instance;
    }
}
public class reflect2 {
    public static void main(String[] args) throws Exception{
        IMessage1 msg=Factory1.getInstance("NetMessage",IMessage1.class);
        msg.send();
    }
}
