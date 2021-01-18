package io;

import java.io.*;

public class IoDemo {
    public static void main(String[] args) throws IOException {
        /*
         * IO流分类：
         * 		流向：
         * 			输入流	读取数据
         * 			输出流   写出数据
         * 		数据类型：
         * 			字节流
         * 				字节输入流	读取数据	InputStream
         * 				字节输出流	写出数据	OutputStream
         * 			字符流
         * 				字符输入流	读取数据	Reader
         * 				字符输出流	写出数据	Writer
         *
         * 		注意：默认情况下是按照数据类型分
         */

        /*
         *  使用：OutputStream
         * 流对象是一个抽象类，不能实例化所以，要一个具体的子类。而要找的子类名称：文件：File。
         * 然后用的是字节输出流：FileOutputStream
         * 注意：基类的子类都是以父类名作为后缀名。
         * 		XxxOutputStream
         * 		XxxInputStream
         * 		XxxReader
         * 		XxxWriter
         * FileOutputStream的构造方法：
         * 		FileOutputStream(File file)
         *		FileOutputStream(String name)
         */


               /* 字节输出流操作步骤：
 		        *   创建字节输出流对象
                * 	写数据 调用 write（）方法
                * 	释放资源 close（）
                *          * public void write(int b):写一个字节
                *          *public void write(byte[] b):写一个字节数组
                *          * public void write(byte[] b,int off,int len):写一个字节数组的一部分
                */
        //创建字节输入对象
        // FileOutputStream(File file)
        // File file = new File("fos.txt");
        // FileOutputStream fos = new FileOutputStream(file);


        //FileOutputStream(String name)
        FileOutputStream fileOutputStream = new FileOutputStream("d:\\work\\a.txt");

        //写入数据
        fileOutputStream.write("holle Io".getBytes());
        fileOutputStream.write("\n".getBytes());

        //public void write(int b):写一个字节
        fileOutputStream.write(110);
        fileOutputStream.write("\n".getBytes());
        fileOutputStream.write("qqq".getBytes());
        fileOutputStream.write("\n".getBytes());

        //public void write(byte[] b):写一个字节数组
        byte[] bytes = {97,98,99,100,101};
        fileOutputStream.write(bytes);
        fileOutputStream.write("\n".getBytes());

        //public void write(byte[] b,int off,int len):写一个字节数组的一部分
        fileOutputStream.write(bytes,3,2);

        fileOutputStream.write("你好".getBytes());

        //释放资源:关闭此文件输出流并释放与此流有关的所有系统资源
        fileOutputStream.close();
        //一定要close（）因为关闭之后流对象就变成了垃圾，就可以被垃圾回收器回收，并通知系统去释放该文件相关的资源。

        //创建一个向具有指定 name 的文件中写入数据的输出文件流。如果第二个参数为 true，则将字节写入文件末尾处，而不是写入文件开始处。
       FileOutputStream file = new FileOutputStream("d:\\work\\a.txt",true);
       file.write("kkkkk".getBytes());
       for ( int i = 0; i<10;i++){
           file.write("welcome".getBytes());
           file.write("\n".getBytes());
       }

       file.close();



        //在写入文件的过程中抛出异常
        // 在finally里面能够看到该对象则必须定义到外面，为了问不出问题，必须给初始化值
       FileOutputStream fileOutputStream1 = null;
       try {
           fileOutputStream1 = new FileOutputStream("d:\\work\\b.txt");
           fileOutputStream1.write("java".getBytes());
       }catch (FileNotFoundException  fe){
           fe.printStackTrace();
       }catch (IOException ie){
           ie.printStackTrace();
       }finally {
           if (fileOutputStream1 != null){
               try {
                   fileOutputStream1.close();
               }catch (IOException io){
                   io.printStackTrace();
               }
               }
           }



        /*
         * 字节输入流操作步骤：
         *          创建字节输入流对象
         *          调用read()方法读取数据，并把数据显示在控制台
         *          释放资源
         *
         * 读取数据的方式：
         *          int read():一次读取一个字节
         *          int read(byte[] b):一次读取一个字节数组
         */
        //创建字节输入流对象
        FileInputStream fileInputStream = new FileInputStream("d:\\work\\a.txt");

        //调用read()方法读取数据，并把数据显示在控制台
        //int read():一次读取一个字节
        /*int chars = 0;
        while ((chars = fileInputStream.read()) !=-1){
            System.out.println(chars);
        }
        fileInputStream.close()*/;

       //int read(byte[] b):一次读取一个字节数组
        byte[] bytes1 = new byte[1024];
        int num = 0;
        while ((num = fileInputStream.read(bytes1)) !=-1){
            System.out.println(new String(bytes1,0,num));
        }
        fileInputStream.close();



        /*
         * 复制文本文件。
         * 数据源：
         *      a.txt	--	读取数据	--	FileInputStream
         * 目的地：
         *      b.txt	--	写数据		--	FileOutputStream
         */
       /* // 封装数据源
        FileInputStream in = new FileInputStream("d:\\work\\a.txt");
        //封装的目的源
        FileOutputStream out = new FileOutputStream("d:\\work\\b.txt");

        int by = 0;
        while ((by=in.read())!=-1){
            out.write(by);
        }
        in.close();
        out.close();*/


        /*
         * 需求：把c盘下的a.txt的内容复制到d盘下的b.txt中
         *
         * 数据源：
         * 		c:\\a.txt	--	读取数据--	FileInputStream
         * 目的地：
         * 		d:\\b.txt	--	写出数据	--	FileOutputStream
         */


        /*FileInputStream in1 = new FileInputStream("c:\\a.txt");


        FileOutputStream out1 = new FileOutputStream("d:\\b.txt");

        int number = 0;
        while ((number=in.read())!=-1){
            out1.write(number);
        }

        in1.close();
        out1.close();*/


        /*
         * 需求：把e:\\xxx.mp4复制到当前项目目录下的copy.mp4中
         *
         * 数据源：
         * 		e:\\xxx.mp4--读取数据--FileInputStream
         * 目的地：
         * 		copy.mp4--写出数据--FileOutputStream
         */


  /*      FileInputStream in2 = new FileInputStream("c:\\xxx.map4");

        FileOutputStream out2 = new FileOutputStream("c:\\xxx1.map4");

        byte[] bys = new byte[1024];
        int number =0;
        while ((number=in.read())!=-1){
            out2.write(bys,0,len);*/


        /*
         * 缓冲区：类被称为：缓冲区类(高效类)
         * 写数据：BufferedOutputStream
         * 读数据：BufferedInputStream
         * 构造方法可以指定缓冲区的大小，因为默认缓冲区大小就足够
         * 设计缓冲区目的：字节缓冲区流仅仅提供缓冲区，为高效而设计。
         */


        //方式一
//        FileOutputStream out = new FileOutputStream("c:a.txt");
//        BufferedOutputStream buffered = new BufferedOutputStream(out);
        //方式二
      /*  BufferedOutputStream buffered = new  BufferedOutputStream(new FileOutputStream("d:\\b.txt"));
        //写入数据
        buffered.write(97);
        buffered.write("holle".getBytes());

        buffered.close();*/



        /*
         * 需求：把e:\\xxx.mp4复制到当前项目目录下的copy.mp4中
         * 字节流四种方式复制文件：
         * 基本字节流一次读写一个字节：	共耗时：   毫秒
         * 基本字节流一次读写一个字节数组： 共耗时：毫秒
         * 高效字节流一次读写一个字节： 共耗时：毫秒
         * 高效字节流一次读写一个字节数组： 共耗时：毫秒
         */

   /*     long start = System.currentTimeMillis();
        //methmod1("d:\\a.map4","c:\\a.map4");
        //methmod2("d:\\a.map4","c:\\a.map4");
        //methmod3("d:\\a.map4","c:\\a.map4");
        //methmod4("d:\\a.map4","c:\\a.map4");
        long end = System.currentTimeMillis();
        System.out.println("耗时:"+(end-start)+"毫秒");
   */
        /*
         * InputStreamReader的方法：
         * int read():一次读取一个字符
         * int read(char[] chs):一次读取一个字符数组
         */

        InputStreamReader input = new InputStreamReader( new FileInputStream("d:\\work\\a.txt"));
        //int read():一次读取一个字符
        input.read();
        //int read(char[] chs):一次读取一个字符数组
        char[] bys = new  char[1024];
        input.read(bys);

        /*
         * OutputStreamWriter的方法：
         * public void write(int c):写一个字符
         * public void write(char[] cbuf):写一个字符数组
         * public void write(char[] cbuf,int off,int len):写一个字符数组的一部分
         * public void write(String str):写一个字符串
         * public void write(String str,int off,int len):写一个字符串的一部分
         *
         * close()和flush()的区别?
         * A:close()关闭流对象，但是先刷新一次缓冲区。关闭之后，流对象不可以继续再使用了。
         * B:flush()仅仅刷新缓冲区,刷新之后，流对象还可以继续使用。
         */

        // 创建对象
       OutputStreamWriter out = new OutputStreamWriter(new FileOutputStream(
                "osw2.txt"));

        // 写数据:写一个字符
        // out.write('a');
        // out.write(97);
        // 为什么数据没有进去呢?  原因是：字符 = 2字节:文件中数据存储的基本单位是字节。
        // void flush()

        //写一个字符数组
        // char[] chs = {'a','b','c','d','e'};
        // out.write(chs);

        //写一个字符数组的一部分
        // out.write(chs,1,3);

        //写一个字符串
        // out.write("山东大学软件学院");

        // 写一个字符串的一部分
        //out.write("山东大学软件学院", 2, 3);

        // 刷新缓冲区
        //out.flush();
        // osw.write("山东大学软件学院", 2, 3);

        // 释放资源
        //ut.close();
        // java.io.IOException: Stream closed
        // osw.write("", 2, 3);




        /*
         * 字符缓冲流特殊方法：
         * BufferedWriter:
         * 		public void newLine():根据系统决定换行符
         * BufferedReader:
         * 		public String readLine()：一次读取一行数据
         * 		包含该行内容的字符串，不包含任何行终止符，如果已到达流末尾，则返回 null
         */
        read();
        write();

    }


    public static void read() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("d:\\work\\a.txt"));
        String str = null;
        while ((str =bufferedReader.readLine())!=null){
            System.out.println(str);
        }
        bufferedReader.close();

    }

    public static void write()throws IOException{
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("d:\\work\\a.txt"));
        for (int i = 0;i<10;i++){
            bufferedWriter.write("holle"+i);
            bufferedWriter.write("\n");
            bufferedWriter.newLine();
            bufferedWriter.flush();
        }
        bufferedWriter.close();
    }
    // 高效字节流一次读写一个字节数组：
/*    public static void  methmod4( String start,String end) throws IOException{
        BufferedInputStream in = new BufferedInputStream(new FileInputStream(start));

        BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(end));

        byte[] bys = new byte[1024];
        int len = 0;
        while ((len=in.read(bys)) !=-1){
            out.write(bys,0,len);
        }
        in.close();
        out.close();
    }*/

    // 高效字节流一次读写一个字节:
  /*  public static  void methmod3(String start,String end) throws IOException {
        BufferedInputStream in =new BufferedInputStream(new FileInputStream(start));
        BufferedOutputStream out = new BufferedOutputStream( new FileOutputStream(end));

        int len = 0;
        while ((len = in.read())!=-1){
            out.write(len);
        }
        in.close();
        out.close();

    }*/

    // 基本字节流一次读写一个字节数组
      /*  public  static  void methmod2(String start,String end)throws IOException{

            FileInputStream in = new FileInputStream(start);
            FileOutputStream out = new FileOutputStream(end);
            byte[] bys = new byte[1024];
            int len = 0;
            while ((len = in.read(bys))!=-1){
                out.write(bys);
            }
            in.close();
            out.close();
        }*/

    // 基本字节流一次读写一个字节
  /*  public static void method1(String start, String end)
            throws IOException {
        FileInputStream in = new FileInputStream(start);
        FileOutputStream out = new FileOutputStream(end);

        int len = 0;
        while ((len = in.read()) != -1) {
            out.write(len);
        }

        in.close();
        out.close();
    }*/


}
