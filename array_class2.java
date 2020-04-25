package duanyiting;

class Car2
{
    private String name;
    private double price;
    private Person_i person;
    public Car2(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Person_i getperson() {
        return this.person;
    }

    public void setPerson(Person_i person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
class Person_i
{
    private String name;
    private int age;
    private Car2 car;
    private Person_i children[];
    public Person_i(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setCar(Car2 car) {
        this.car=car;
    }
    public void setChildren(Person_i children[])
    {
        this.children=children;
    }
    public Person_i[] getChildren()
    {
        return this.children;
    }

    public Car2 getCar() {
        return this.car;
    }

    @Override
    public String toString() {
        return "Person_h{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class array_class2 {
    public static void main(String[] args) {
        //第一步：声明对象并设置彼此的关系
        Person_i person=new Person_i("林希特",33);
        Person_i childA=new Person_i("吴小明",17);
        Person_i childB=new Person_i("李小伟",18);
        childA.setCar(new Car2("奥迪Q4",1844591.31));
        childB.setCar(new Car2("法拉利",3530178.66));
        person.setChildren(new Person_i[]{childA,childB});
        Car2 car=new Car2("奔驰G50",1635243.52);
        person.setCar(car);
        car.setPerson(person);
        //第二步：根据关系获得数据
        System.out.println(person.getCar().toString());
        System.out.println(car.getperson().toString());
        for(int i=0;i<person.getChildren().length;i++)
        {
            System.out.println("\t|-"+person.getChildren()[i].toString());
            System.out.println("\t\t|-"+person.getChildren()[i].getCar().toString());
        }
    }
}
