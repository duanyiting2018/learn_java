package duanyiting;

enum Color8
{
    RED("红色")
    {
        @Override
        public String getMessage()
        {
            return "[RED]"+this;
        }
    }
    ,GREEN("绿色")
    {
        @Override
        public String getMessage()
        {
            return "[GREEN]"+this;
        }
    }
    ,BLUE("蓝色")
    {
        @Override
        public String getMessage()
        {
            return "[BLUE]"+this;
        }
    };
    private String title;
    private Color8(String title)
    {
        this.title=title;
    }
    @Override
    public String toString()
    {
        return this.title;
    }

    public abstract String getMessage();
}
public class class_package13 {
    public static void main(String[] args) {
        System.out.println(Color8.BLUE.getMessage());
    }
}
