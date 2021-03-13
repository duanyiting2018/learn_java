class Singleton1{
    private static Singleton1 instance=null;
    private Singleton1(){
        System.out.println("["+Thread.currentThread().getName()+"]"+"duanyiting");
    }
    public static Singleton1 getInstance(){
        if (instance==null)
        {
            synchronized (Singleton1.class){
                if (instance==null)
                {
                    instance=new Singleton1();
                }
            }
        }
        return instance;
    }
    public void print(){
        System.out.println("duanyiting");
    }
}
public class reflect3 {
    public static void main(String[] args) {
        for (int x=0;x<5;x++){
            new Thread(()->{
                Singleton1.getInstance().print();
            },"1-"+x).start();
        }
    }
}
