package throwsdemo;

import java.util.Scanner;

public class ThrowsDemo {
    public static void main(String[] args) {
        /*
        * 程序的异常：Throwable
        * 严重问题：Error不处理。这种问题一般是很严重的，比如内存的溢出
        * 问题：Exception
        *        编译器问题：不是runtimeException的问题，必须处理，如果不处理编译不过
        *         运行期问题：runtimeexception 这种问题也不处理 ，因为这是开发者的问题（可能代码不够严谨需要进行xiugaidaima）
        * 程序出现问题，没有做任何处理，最终jvm会做出默认的处理。
        * 把异常的名称，原因及出现的问题等信息输出在控制台。
        * 同时会结束程序
         */

       /* int a = 10;
        int b = 0;
        try {
            int sum = a/b;
            System.out.println(sum);

        }catch (ArithmeticException throwee){
            System.out.println("除数不可为0");
        }finally {
            System.out.println("zz");
        }*/
        //方式一
  /*  try{
        //可能会出现问题的代码
    }catch(){
        //处理异常的方式
    }finally{
        //释放资源----一定执行
    }*/

        /*//变形格式
        try {
            //可能出现的问题的代码
        }catch (){
            //处理异常的方式
        }
        注意：
        try 体内的代码越少越好
        catch内必须有内容，比如给出一个简单的提示也好

        */


        /*
        * 写一个try可以有多个catch
        * try{
        *
        * }catch(){
        *
        * }catch(){
        * }
        *......
        *注意：
        * 一旦try内出现问题，就会把问题抛出，然后和chatch里面的处理方式进行匹配
        * 一旦匹配成功，就会执行catch里面的处理，之后结束try.。catch
        * 继续执行后面的语句
        * */

       /* int[] arr = {1,2,3};
        int c = 12;
        int d = 0;
        try {
            System.out.println(c/d);
            System.out.println(arr[3]);
        }catch (ArithmeticException ae){
            System.out.println("被除数不可以为0");
        }catch (ArrayIndexOutOfBoundsException aiooe){
            System.out.println("数组下标越界了");
        }
        System.out.println("over");

        System.out.println("-------------------------------");


        try {
            System.out.println(c/d);
        }catch (ArithmeticException ae){
            System.out.println("被除数不可以为0");
        }


        try {
            System.out.println(arr[3]);
        }catch (ArrayIndexOutOfBoundsException aioobe){
            System.out.println("数组下标越界了");
        }

        System.out.println("over");

        System.out.println("------------------------------------------");

        System.out.println("今天天气好");
         try {
             Method();
         }catch (ParseException pe){
             pe.printStackTrace();
         }
        System.out.println("但是不应该有雾霾");
            Method2();*/

     /*
     * throw:如果出现异常，可以把异常抛出，抛出的应该是异常的对象
     * throw和throws的区别
     *          throws
     *                  用在方法声明的后面，跟的是异常类名
     *                  可以跟多个异常类名，用逗号隔开
     *                  表示抛出异常，有该方法的调用者处理
     *                  throws表示出现异常的一种可能性，并不一定发生异常
     *          throw
     *                  用在方法体内，跟的是异常的对象
     *                  只能抛出一个异常
     *                  表示抛出的异常，有该方法体内的语句处理
     * */

                //Method();
         /*       try {
                    Method2();
                }catch (Exception e){
                    e.printStackTrace();
                }
        System.out.println("-----------------------------------------");*/

        /*
             * finally:
                     被finally控制的语句体一定会执行
             * 注意
                   如果是执行finally之前jvm退出了，则不执行
             *
             * 格式
             * 		try{}catch(){}finally{}
             * 用于释放资源，在IO流操作和数据库操作中会见到
       */

       /* String time = "2010-10-03";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

            try {
                simpleDateFormat.parse(time);

            } catch (ParseException e) {
                e.printStackTrace();
                //System.exit(0);
                //return ;
            }finally {
                System.out.println("一定执行吗？？？？？？");
            }
        System.out.println("yes");*/

    /*
    * final finally和finalize的区别
    * final：可以修饰类、成员变量、成员方法
    *           修饰类     不能被继承
    *           修饰变量    是常量
    *           修饰方法    不能被重写
    * finally：是异常处理的一部分，用于释放资源
    *           代码肯定会执行，特殊情况：在执行finally之前java的jvm被关闭
    * finalize：是Objiect类的一个方法，用于垃圾回收
    *
    *1.try...catch...finally
    * 2.try...catch
    * 3.try...catch...catch
    * 4.try...catch...catch...finally
    * 5.try...finally  目前这种做法是为了释放资源
    * */
        //catch中有return finally和return谁先执行
        //System.out.println(getInt());

        Scanner scanner = new Scanner(System.in);
        System.out.println("输入一个学生的成绩:");
        int number = scanner.nextInt();
        Teacher teacher = new Teacher();
        try {
            teacher.check(number);
        }catch (MyException e){
            e.printStackTrace();

        }





    }


    /*public static int getInt(){
        int a = 10;
        try {

            System.out.println(a/0);
            a=20;
        }catch (ArithmeticException ae){
            a= 30;
            return a;
        }finally {
            a = 40;
            return a;
        }
    }*/

  /* private static void Method2() throws ArithmeticException {
        int a = 10;
        int b = 0 ;
        System.out.println(a/b);
    }

    private static void Method() throws ParseException {
        String time = "2021-1-14";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = simpleDateFormat.parse(time);
        System.out.println(date);

    }*/





    /*private static void Method(){
        int i = 10 ;
        int n = 0;
        if (n==0){
            throw new ArithmeticException();
        }else {
            System.out.println(i/n);
        }

    }
    private  static  void Method2() throws Exception{
        int i = 10 ;
        int n = 0;
        if (n==0){
            throw new Exception();
        }else {
            System.out.println(i/n);
        }
    }*/




}
