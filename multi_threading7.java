package duanyiting;

public class multi_threading7 {
    public static void main(String[] args) throws Exception {
        java.lang.Runnable run = () -> {
            for (int x = 0; x < 10; x++) {
                System.out.println(Thread.currentThread().getName() +
                        " x=" + x);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        for (int num = 0; num < 5; num++) {

          new Thread(run,"线程对象-"+num).start();
        }
    }
}
