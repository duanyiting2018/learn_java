package duanyiting;

public class conver {
    public static void main(String[] args) {
        byte mybyte=127;
        int myint=150;
        float myfloat=452.12f;
        char mychar=10;
        double mydouble=45.46546;
        System.out.println("byte型与float型运算结果："+(mybyte+myfloat));
        System.out.println("byte型与int型运算结果："+mybyte*myint);
        System.out.println("byte型与char型运算结果："+mybyte/mychar);
        System.out.println("double型与char型运算结果："+(mydouble+mychar));
    }
}
