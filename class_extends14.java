package duanyiting;
class Person__10
{
    
}
class Person__11 extends Person__10
{
    
}
public class class_extends14 {
    public static void main(String[] args) {
        System.out.println("---------不转型时的instanceof判断----------");
        Person__10 perA=new Person__10();
        System.out.println(perA instanceof Person__10);
        System.out.println(perA instanceof Person__11);
        System.out.println("---------向上转型时的instanceof判断--------");
        Person__10 perB=new Person__11();
        System.out.println(perB instanceof Person__10);
        System.out.println(perB instanceof Person__11);
    }
}
