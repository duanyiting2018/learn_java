package duanyiting;
import duanyiting.utils.Link;
/**
interface IPet
{
    public String getName();
    public String getColor();
}
class PetShop
{
    //利用链表可在一个宠物商店里保存多个宠物的信息
    public duanyiting.utils.Link.ILink<IPet> allPets=new LinkImpl<IPet>();
    public void add(IPet pet)
    {
        this.allPets.add(pet);
    }
    public void delete(IPet pet)
    {
        this.allPets.remove(pet);
    }
     //
     //根据关键字查询宠物信息,通过链表保存返回结果
     // @param keyword 查询关键字
     // @return 查询结果,如果没有结果则链表长度为0(size()==0)
     //
    public ILink<IPet> search(String keyword)
    {
        ILink<IPet> searchResult=new LinkImpl<IPet>();
        Object result[]=this.allPets.toArray();
        if (result!=null)
        {
            for (Object object : result)
            {
                IPet pet=(IPet) object;
                if (pet.getName().contains(keyword) || pet.getColor().contains(keyword))
                {
                    searchResult.add(pet);
                }
            }
        }
        return searchResult;
    }
}
class Cat implements IPet
{
    private String name;
    private String color;
    public Cat(String name,String color)
    {
        this.color=color;
        this.name=name;
    }
    @Override
    public String getName()
    {
        return this.name;
    }
    @Override
    public String getColor() {
        return color;
    }
    @Override
    public boolean equals(Object object)
    {
        if (object==null)
            return false;
        if (!(object instanceof Cat))
            return false;
        if (this==object)
            return true;
        Cat cat=(Cat) object;
        return this.name.equals(cat.name) &&
                this.color.equals(cat.color);
    }
    @Override
    public String toString() {
        return "【宠物猫】类型:" + this.name +
                ", 颜色:'" + this.color;
    }
}
class Dog implements IPet
{
    private String name;
    private String color;
    public Dog(String name,String color)
    {
        this.color=color;
        this.name=name;
    }
    @Override
    public String getName()
    {
        return this.name;
    }
    @Override
    public String getColor() {
        return color;
    }
    @Override
    public boolean equals(Object object)
    {
        if (object==null)
            return false;
        if (!(object instanceof Cat))
            return false;
        if (this==object)
            return true;
        Dog dog=(Dog) object;
        return this.name.equals(dog.name) &&
                this.color.equals(dog.color);
    }
    @Override
    public String toString() {
        return "【宠物狗】类型:" + this.name +
                ", 颜色:'" + this.color;
    }
}
public class insideclass_list2 {
    public static void main(String[] args) {
        PetShop shop=new PetShop();
        shop.add(new Dog("斑点狗","棕黑相间"));
        shop.add(new Dog("宠物狗","黄色"));
        shop.add(new Dog("小狗","棕黑色"));
        shop.add(new Cat("肥猫","黄色"));
        shop.add(new Cat("宠物猫","白色"));
        shop.add(new Cat("野猫","黄棕相间"));
        shop.add(new Cat("吃货猫","白色"));
        shop.delete(new Dog("斑点狗","棕黑相间"));
        Object result[]=shop.search("黄色");
        for (Object object : result)
        {
            System.out.println(object);
        }
    }
}
*/