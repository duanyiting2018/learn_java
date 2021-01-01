package duanyiting;

public class often_class3 {
    public static void main(String[] args) {
        StringBuffer buf=new StringBuffer();
        buf.append("Hello Would!").delete(6,11).insert(6,"duanyiting");
        System.out.println(buf);
    }
}
