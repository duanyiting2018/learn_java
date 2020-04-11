package duanyiting;

class Book
{
    private String title;
    private static int count=0;
    public Book(String title)
    {
        this.title=title;
        count++;
        System.out.println("第"+count+"本书已创建");
    }
}
public class class_m {
    public static void main(String[] args) {
        new Book("java入门初步知识");
        new Book("python从入门到精通");
        new Book("C语言——带你精通算法");
    }
}
