package bigdecimal;

import java.math.BigDecimal;

public class BigDecimal_demo {
    public static void main(String[] args){
        /*
 * 看程序写结果：
    这是因为float类型的数据存储和整数不一样导致的。它们大部分的时候，都是带有有效数字位。
 *
 * 由于在运算的时候，float类型和double很容易丢失精度，演示案例。所以，为了能精确的表示、计算浮点数，Java提供了BigDecimal
 *
 * BigDecimal类：不可变的、任意精度的有符号十进制数,可以解决数据丢失问题。
 */

        System.out.println(0.08 + 0.02);
        System.out.println(1.0 - 0.22);
        System.out.println(1.536 * 100);
        System.out.println(1.654 / 100);
        System.out.println(1.0 - 0.21);


        /*
         * 构造方法：
         * public BigDecimal(String val)   将 BigDecimal 的字符串表示形式转换为 BigDecimal。
         * public BigDecimal add(BigDecimal augend)
         * public BigDecimal subtract(BigDecimal subtrahend)
         * public BigDecimal multiply(BigDecimal multiplicand)
         * public BigDecimal divide(BigDecimal divisor)
         * public BigDecimal divide(BigDecimal divisor,int scale,int roundingMode):商，几位小数，如何舍取
         */
        BigDecimal bigDecimal = new BigDecimal("0.99");
        BigDecimal bigDecimal1 = new  BigDecimal("0.01");
        BigDecimal bigDecimal2 = new BigDecimal("0.01");
        System.out.println(bigDecimal.add(bigDecimal1));
        System.out.println(bigDecimal.subtract(bigDecimal1));
        System.out.println(bigDecimal2.multiply(bigDecimal1));
        System.out.println(bigDecimal.divide(bigDecimal1));
        System.out.println(bigDecimal.divide(bigDecimal1,2,2));



    }

}
