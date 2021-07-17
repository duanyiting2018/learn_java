package singleton_pattern.main;

import java.util.concurrent.atomic.AtomicReference;

public class Singleton5 {
    private static final AtomicReference<Singleton5> INSTANCE
            =new AtomicReference<Singleton5>();
    private static Singleton5 instance;
    private Singleton5(){}
    public static final Singleton5 getInstance(){
        for (;;){
            Singleton5 instance=INSTANCE.get();
            if (null!=instance) return instance;
            INSTANCE.compareAndSet(null,new Singleton5());
            return INSTANCE.get();
        }
    }
    public static void main(String[] args) {
        System.out.println(Singleton5.getInstance());
        System.out.println(Singleton5.getInstance());
    }
}
