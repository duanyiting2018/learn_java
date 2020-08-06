package duanyiting;

interface Ifood1
{
    public void eat();
}
class Bread implements Ifood1
{
    public void eat()
    {
        System.out.println("吃一般一般,世界第三的面包。");
    }
}
class Milk implements Ifood1
{
    public void eat()
    {
        System.out.println("喝老八秘制牛奶。");
    }
}
class Factory
{
    /**
     * 获取Ifood1接口的实例化对象,利用此方法对外隐藏子类,由于Factory类没有属性,所以定义static方法
     * @param className 要获得的子类标记
     * @return 存在指定标记返回对应子类实例,否则返回null
     */
    public static Ifood1 getInstance(String className)
    {
        if ("bread".equals(className))
        {
            return new Bread();
        }
        else if ("milk".equals(className))
        {
            return new Milk();
        }
        else
        {
            return null;
        }
    }
}
public class class_interface6 {
    public static void main(String[] args) {
        Ifood1 food=Factory.getInstance("milk");
        food.eat();
    }
}
