package bigdecimal;

public class Character_Demo {
    public static void main(String[] args) {


        /*
         * Character 类在对象中包装一个基本类型 char 的值
         * 此外，该类提供了几种方法，以确定字符的类别（小写字母，数字，等等），并将字符从大写转换成小写，反之亦然
         *
         * 构造方法：
         * 		Character(char value)
         */
        // 创建对象
        Character ch = new Character((char) 97);
        //Character ch = new Character('a');
        System.out.println("ch:" + ch);




        // public static boolean isUpperCase(char ch):判断给定的字符是否是大写字符
        System.out.println("是否是大写:" + Character.isUpperCase('A'));
        System.out.println("是否是大写:" + Character.isUpperCase('a'));
        System.out.println("是否是大写:" + Character.isUpperCase('0'));

        // public static boolean isLowerCase(char ch):判断给定的字符是否是小写字符
        System.out.println("是否是小写:" + Character.isLowerCase('A'));
        System.out.println("是否是小写:" + Character.isLowerCase('a'));
        System.out.println("是否是小写:" + Character.isLowerCase('0'));

        // public static boolean isDigit(char ch):判断给定的字符是否是数字字符
        System.out.println("是否是字符:" + Character.isDigit('A'));
        System.out.println("是否是字符:" + Character.isDigit('a'));
        System.out.println("是否是字符:" + Character.isDigit('0'));

        // public static char toUpperCase(char ch):把给定的字符转换为大写字符
        System.out.println("是否是大写字符:" + Character.toUpperCase('A'));
        System.out.println("是否是大写字符:" + Character.toUpperCase('a'));

        // public static char toLowerCase(char ch):把给定的字符转换为小写字符
        System.out.println("给定字符转换为小写:" + Character.toLowerCase('A'));
        System.out.println("给定字符转换为小写:" + Character.toLowerCase('a'));
    }
}
