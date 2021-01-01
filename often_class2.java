package duanyiting;

public class often_class2 {
    public static void main(String[] args) {
        StringBuffer buf=new StringBuffer();
        buf.append(".cn").insert(0,"www.").insert(4,"duanyiting");
        System.out.println(buf);
    }
}
