package bigdecimal;

import java.math.BigInteger;
import java.util.Arrays;

public class BigInteger_demo {
    public static void main(String[] args) {
        /*
         * BigInteger:可超过Integer范围内的数据进行运算
         *
         * 构造方法：
         * BigInteger(String val)
         */

        Integer i = new Integer(100);
        System.out.println(i);
        System.out.println(Integer.MAX_VALUE);
        Integer ii = new Integer(2147483647);
        System.out.println(ii);
        BigInteger iii = new BigInteger("2147483648");
        System.out.println(iii);


        /*
         * public BigInteger add(BigInteger val):加
         * public BigInteger subtract(BigInteger val):减
         * public BigInteger multiply(BigInteger val):乘
         * public BigInteger divide(BigInteger val):除
         * public BigInteger[] divideAndRemainder(BigInteger val):返回商和余数的数组
         */
        int[] array = new int[10];
        BigInteger i1 = new BigInteger("100");
        BigInteger i2 = new BigInteger("200");
        System.out.println(i1.add(i2));
        System.out.println(i1.subtract(i2));
        System.out.println(i1.multiply(i2));
        System.out.println(i2.divide(i1));
        System.out.println(Arrays.toString(i1.divideAndRemainder(i1)));
    }
}
