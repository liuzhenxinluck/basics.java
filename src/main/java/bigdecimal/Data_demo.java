package bigdecimal;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Data_demo {
    public static void main(String[] args) throws ParseException {


    /*
     * Date:表示特定的瞬间，精确到毫秒。
     *
     * 构造方法：
     * 		Date():根据当前的默认毫秒值创建日期对象
     * 		Date(long date)：根据给定的毫秒值创建日期对象
     */

       /* Date date = new Date();
        System.out.println(date);

        long time = 1000 * 60 * 60;
        Date d2 = new Date(time);
        System.out.println("d2:" + d2);*/

        /*
         * public long getTime():获取时间，以毫秒为单位
         * public void setTime(long time):设置时间
         *
         * 从Date得到一个毫秒值
         * 		getTime()
         * 把一个毫秒值转换为Date
         * 		构造方法
         * 		setTime(long time)
         */

        /*Date date1 = new Date();
        //获取时间
        long time1 = date1.getTime();
        System.out.println(time1);
        System.out.println("d:" + date1);
        // 设置时间
        date1.setTime(1000);
        System.out.println("d:" + date1);*/


        /*
 * Date	 --	 String(格式化)
 * 		public final String format(Date date)
 *
 * String -- Date(解析)
 * 		public Date parse(String source)
 *
 * DateForamt:可以进行日期和字符串的格式化和解析，
       但是由于是抽象类，所以使用具体子类SimpleDateFormat。
 *
 * SimpleDateFormat的构造方法：
 * 		SimpleDateFormat():默认模式
 * 		SimpleDateFormat(String pattern):给定的模式
 * 			这个模式字符串该如何写呢?
 * 			通过查看API，我们就找到了对应的模式
 * 			年 y
 * 			月 M
 * 			日 d
 * 			时 H
 * 			分 m
 * 			秒 s
 *
 * 			2019年12月12日 12:12:12
 */
        //格式化  Date	 --	 String
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String time = dateFormat.format(date);
        System.out.println(time);

        //解析  String     --  Data
        String str = "2008-08-08 10:10:10";
        SimpleDateFormat dateFormat1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date dd =dateFormat1.parse(str);
        System.out.println(dd);

        /*
         * 计算你来到这个世界多少天?
         *
         * 分析：
         * 		A:键盘录入你的出生的年月日
         * 		B:把该字符串转换为一个日期
         * 		C:通过该日期得到一个毫秒值
         * 		D:获取当前时间的毫秒值
         * 		E:用D-C得到一个毫秒值
         * 		F:把E的毫秒值转换为年
         * 			/1000/60/60/24
         */


        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的出生年月日：（yyyy-mm-dd）");
        String sDate = sc.nextLine();
        //得到你的出生日期
        Date bDate = stringToDate(sDate,"yyyy-MM-dd");
        //得到出生时间毫秒值
        long bornDate = bDate.getTime();
        //得到当前日期
        long currentDate = System.currentTimeMillis();
        //计算天数
        long day = (currentDate-bornDate)/1000/60/60/24;
        System.out.println("你来到这个世界："+day+"天");




    }



    public static String dateToString(Date d, String format) {
         SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
        return simpleDateFormat.format(d);
    }
    public static Date stringToDate(String s, String format)throws ParseException {
         SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
         return simpleDateFormat.parse(s);
    }


    }


