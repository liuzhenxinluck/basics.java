package bigdecimal;

import java.util.Calendar;
import java.util.Scanner;

public class Calendar_Demo {
    public static void main(String[] args) {
        // 其日历字段已由当前日期和时间初始化：
        Calendar rightNow = Calendar.getInstance(); // 子类对象
        // 获取年
        int year = rightNow.get(Calendar.YEAR);
        // 获取月
        int month = rightNow.get(Calendar.MONTH);
        // 获取日
        int date = rightNow.get(Calendar.DATE);
        System.out.println(year + "年" + (month + 1) + "月" + date + "日");


        /*
         * public void add(int field,int amount):
            根据给定的日历字段和对应的时间，来对当前的日历进行操作。
         * public final void set(int year,int month,int date):
            设置当前日历的年月日
         */


        // 获取当前的日历时间
        Calendar c = Calendar.getInstance();

        // 获取年
        int year1 = c.get(Calendar.YEAR);
        // 获取月
        int month1 = c.get(Calendar.MONTH);
        // 获取日
        int date1 = c.get(Calendar.DATE);
        System.out.println(year + "年" + (month + 1) + "月" + date + "日");
        // // 三年前的今天
        // c.add(Calendar.YEAR, -3);
        // // 获取年
        // year = c.get(Calendar.YEAR);
        // // 获取月
        // month = c.get(Calendar.MONTH);
        // // 获取日
        // date = c.get(Calendar.DATE);
        // System.out.println(year + "年" + (month + 1) + "月" + date + "日");
        // 5年后的10天前
        c.add(Calendar.YEAR, 5);
        c.add(Calendar.DATE, -10);
        // 获取年
        year = c.get(Calendar.YEAR);
        // 获取月
        month = c.get(Calendar.MONTH);
        // 获取日
        date = c.get(Calendar.DATE);
        System.out.println(year + "年" + (month + 1) + "月" + date + "日");
        System.out.println("--------------");
        c.set(2019, 11, 11);
        // 获取年
        year = c.get(Calendar.YEAR);
        // 获取月
        month = c.get(Calendar.MONTH);
        // 获取日
        date = c.get(Calendar.DATE);
        System.out.println(year + "年" + (month + 1) + "月" + date + "日");

        /*
         * 获取任意一年的二月有多少天
         *
         * 分析：
         * 		A:键盘录入任意的年份
         * 		B:设置日历对象的年月日
         * 			年就是A输入的数据
         * 			月是2
         * 			日是1
         * 		C:把时间往前推一天，就是2月的最后一天
         * 		D:获取这一天输出即可
         */
        //键盘录入年份
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年份：");
        int year2 = sc.nextInt();
        //创建日历对象
        Calendar calendar = Calendar.getInstance();
        //设置时间,其实是三月一日
        calendar.set(year, 2, 1);
        //往前推一天，就是二月的最后一天
        calendar.add(Calendar.DATE, -1);
        System.out.println(calendar.get(Calendar.DATE));
    }
}
