package duanyiting;

public class often_class8 {
    public static void main(String[] args) throws Exception{
        Runtime runtime=Runtime.getRuntime();
        System.out.println(runtime.availableProcessors());
        runtime.gc();
        System.out.println(runtime.maxMemory());
        System.out.println(runtime.totalMemory());
        System.out.println(runtime.freeMemory());
    }
}
