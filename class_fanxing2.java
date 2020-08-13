package duanyiting;

class Point2<T>
{
    private T x;
    private T y;

    public T getX() {
        return x;
    }

    public void setX(T x) {
        this.x = x;
    }

    public T getY() {
        return y;
    }

    public void setY(T y) {
        this.y = y;
    }
}
public class class_fanxing2 {
    public static void main(String[] args) {
        //!!!实例化point2对象,设置标记T的数据类型,属性配置 !!!
        Point2<Integer> point=new Point2<Integer>();
        //1
        point.setX(11);
        point.setY(17);
        //2 !!!避免向下转型 !!!
        int x=point.getX();
        int y=point.getY();
        System.out.println("x:"+x+"y:"+y);
    }
}
