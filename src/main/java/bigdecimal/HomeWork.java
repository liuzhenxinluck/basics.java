package bigdecimal;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class HomeWork {
    public static void main(String[] args) {
        String str = "山东大学软件学院";
        char[] chars = new char[8];
        str.getChars(0,str.length(),chars,0);
        System.out.println(Arrays.toString(chars));
        System.out.println(chars[2]);

        String str1 = "山东大学计算机学院";
        char[] chars1 = str1.toCharArray();
        System.out.println(Arrays.toString(chars1));


        byte[] bytes = new byte[0];
        try {
            bytes = str.getBytes("gbk");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        System.out.println(Arrays.toString(bytes));

        }


        }



