package duanyiting;

public class Unicode {
    public static void main(String[] args) {
        char word1='d',word2='@';
        int p1=93457,p2=39487;
        System.out.println("'d'在unicode表中的位置为："+(int)word1);
        System.out.println("'@'在unicode表中的位置为："+(int)word2);
        System.out.println("unicode表中第93457位为："+(char)p1);
        System.out.println("unicode表中第39487位为："+(char)p2);
    }
}
