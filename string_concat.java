package duanyiting;

public class string_concat {
    public static void main(String[] args) {
        String strA="www.duanyiting.cn";
        String strB="www.".concat("duanyiting").concat(".cn");
        System.out.println(strB);
        System.out.println(strA==strB);
    }
}
