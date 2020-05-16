package duanyiting;

public class string_isNumber {
    public static void main(String[] args) {
        System.out.println(isNumber("duanyiting") ? "由数字组成" : "不由数字组成");
        System.out.println(isNumber("123") ? "由数字组成" : "不由数字组成");
        /**
         * 判断传入字符串是否由数字组成,处理过程中会将字符串变为字符数组
         *采用循环的形式进行每一个字符的判断
         * @param str 判断的字符串内容
         * @return 如果全部由数字组成返回true, 否则返回false
         */
    }

    public static boolean isNumber(String str) {
        char[] result = str.toCharArray();
        for (int i = 0; i < result.length; i++) {
            if (result[i] < '0' || result[i] > '9') {
                return false;
            }
        }
        return true;
    }
}
