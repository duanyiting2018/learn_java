class Member1{
    public Member1(){
        System.out.println("duanyiting");
    }
    @Override
    public String toString(){
        return "【覆写】duanyiting";
    }
}
public class reflect1 {
    public static void main(String[] args) throws Exception{
        Class<?> clazz=Class.forName("Member1");
        Object obj=clazz.getConstructor().newInstance();
        System.out.println(obj);
    }
}
