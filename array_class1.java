package duanyiting;

class Car1
{
    private String name;
    private double price;
    private Person_h person;
    public Car1(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Person_h getperson() {
        return person;
    }

    public void setPerson(Person_h person) {
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
class Person_h
{
    private String name;
    private int age;
    private Car1 car;
    public Person_h(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setCar(Car1 car) {
        this.car=car;
    }

    public Car1 getCar() {
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
public class array_class1 {
    public static void main(String[] args) {
        //第一步：声明对象并设置彼此的关系
        Person_h person=new Person_h("林希特",32);
        Car1 car=new Car1("奔驰G50",1635243.52);
        person.setCar(car);
        car.setPerson(person);
        //第二步：根据关系获得数据
        System.out.println(person.getCar().toString());
        System.out.println(car.getperson().toString());
    }
}
