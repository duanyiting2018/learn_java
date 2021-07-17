package singleton_pattern.main;

public class Singleton4 {
    private static volatile Singleton4 instance;
    private Singleton4(){}
    public static Singleton4 getInstance(){
        if (null!=instance) return instance;
        synchronized (Singleton4.class){
            if (null!=instance){
                instance=new Singleton4();
            }
        }
        return instance;
    }
}
