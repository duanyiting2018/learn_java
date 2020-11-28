package duanyiting;

public class multi_threading6 {
    public static void main(String[] args) {
        System.out.println("1、执行任务1。");
        new Thread(()->{
            int temp=0;
            for (int x=0;x<Integer.MAX_VALUE;x++)
            {
                temp+=x;
            }
        }).start();
        System.out.println("2、执行任务2。");
        System.out.println("N、执行任务N。");
    }
}
