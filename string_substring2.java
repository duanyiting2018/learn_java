package duanyiting;

public class string_substring2 {
    public static void main(String[] args) {
        String str="mldn-photo-张三.jpg";
        int beginIndex=str.indexOf("-",str.indexOf("photo"))+1;
        int endIndex=str.lastIndexOf(".");
        System.out.println(str.substring(beginIndex,endIndex));
    }
}
