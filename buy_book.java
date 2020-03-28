package duanyiting;

public class buy_book {
    public static void main(String[] args) {
        sale(4);
        sale(-3);
    }
    public static void sale(int book)
    {
        if(book<0)//如果书的数量出现错误
        {
            return;//后续代码不执行
        }
        System.out.println("销售出"+book+"本图书");
    }
}
