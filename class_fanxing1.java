package duanyiting;
class Point1
{
    private Object x;
    private Object y;

    public Object getX() {
        return x;
    }

    public void setX(Object x) {
        this.x = x;
    }

    public Object getY() {
        return y;
    }

    public void setY(Object y) {
        this.y = y;
    }
}
public class class_fanxing1 {
    public static void main(String[] args) {
        Point1 point=new Point1();
        //1
        point.setX(18);
        point.setY(25);
        //2
        int x=(Integer) point.getX();
        int y=(Integer) point.getY();
        System.out.println("x:"+x+"y:"+y);
    }
}
