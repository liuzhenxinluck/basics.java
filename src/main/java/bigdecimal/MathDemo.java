package bigdecimal;

import java.util.Scanner;

public class MathDemo {
    public static void main(String[] args) {
        /*
         * Math:用于数学运算的类。
         * 成员变量：
         * 		public static final double PI
         * 		public static final double E
         * 成员方法：
         * 		public static int abs(int a)：绝对值
         *		public static double ceil(double a):向上取整
         *		public static double floor(double a):向下取整
         *		public static int max(int a,int b):最大值 (min类同)
         *		public static double pow(double a,double b):a的b次幂
         *		public static double random():随机数 [0.0,1.0)
         *		public static int round(float a) 四舍五入(参数为double)
         *		public static double sqrt(double a):正平方根
         */

        System.out.println("math.PI:"+Math.PI);
        System.out.println("math.E:"+Math.E);


        System.out.println("绝对值："+ Math.abs(-99));
        System.out.println("向上取整:"+Math.ceil(3.0001));
        System.out.println("向上取整:"+Math.floor(3.9999));
        System.out.println("最大值:"+Math.max(2,9));
        System.out.println("最小值:"+Math.min(6,1));
        System.out.println("a的多少次幂:"+Math.pow(2,10));
        System.out.println("随机数:"+(int)(Math.random()*10+1));
        System.out.println("四舍五入:"+Math.round(5.6));
        System.out.println("正平方根:"+Math.sqrt(9));



        /*
         * 需求：请设计一个方法，可以实现获取任意范围内的随机数。
         *
         * 分析：
         * 		A:键盘录入两个数据。
         * 			int strat;
         * 			int end;
         * 		B:想办法获取在start到end之间的随机数
         * 			我写一个功能实现这个效果，得到一个随机数。(int)
         * 		C:输出这个随机数
         */


        Scanner num1 = new Scanner(System.in);
        System.out.println("请先输入开始的数字:");
        int start = num1.nextInt();
        Scanner num2  = new Scanner(System.in);
        System.out.println("请先输入结束的数字:");
        int end = num2.nextInt();
         boolean flat = true;
        while (flat==true){
            int num = getRandom(start,end);
            System.out.println(num);
            String yes = "yes";
            boolean no = false;
            System.out.println();
            Scanner word = new Scanner(System.in);
            System.out.println("请输入是否要结束 yes或者no:");
            String determine = word.nextLine();
            if (determine==yes){
                flat=false;
            }else {
                flat=true;
            }
            break;

        }
    }
    public static int getRandom(int start,int end){
        int number = (int) (Math.random()*(end-start)+start);
        return number;

    }




}
