package duanyiting;

class Person__9
{
    public void run()
    {
        System.out.println("用力奔跑。。。");
    }
}
class Superman extends Person__9
{
    public void fly()
    {
        System.out.println("超音速飞行撞飞几十栋大楼。。。");
    }
    public void fire()
    {
        System.out.println("喷出三味珍火使人的屁股烧出巴西烤肉的香味。。。");
    }
}
public class class_extends13 {
    public static void main(String[] args) {
        System.out.println("----------------------正常情况下超人是普通人-------------------------");
        Person__9 person=new Superman();
        person.run();
        System.out.println("----------------------外星狗准备侵略地球-----------------------------");
        Superman superman=(Superman) person;//强制将类型转换为子类类型
        superman.fly();
        superman.fire();
    }
}
