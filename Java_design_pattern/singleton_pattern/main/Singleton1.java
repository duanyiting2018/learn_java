package singleton_pattern.main;

public class Singleton1 {
    private static Singleton1 instance;
    private Singleton1(){}
    public static synchronized Singleton1 getInstance(){
        if (null!=instance) return instance;
        instance=new Singleton1();
        return instance;
    }
}
