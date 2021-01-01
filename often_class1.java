package duanyiting;

public class often_class1 {
    public static void main(String[] args) {
        StringBuffer buf=new StringBuffer("www.");
        change(buf);
        String data=buf.toString();
        System.out.println(data);
    }
    public static void change(StringBuffer temp)
    {
        temp.append("duanyiting").append(".cn");
    }
}
