package bigdecimal;

public class StringBuffer_Demo {
    public static void main(String[] args) {
        /*
         * 线程安全
         * 安全 -- 同步 -- 数据是安全的
         * 不安全 -- 不同步 -- 效率高一些
         *
         *
         * StringBuffer:
         * 		线程安全的可变字符串。
         *
         * StringBuffer和String的区别?
         * 前者长度和内容可变，后者不可变。
         * 如果使用前者做字符串的拼接，不会浪费太多的资源。
         *
         * StringBuffer的构造方法：
         * 		public StringBuffer():无参构造方法
         *		public StringBuffer(int capacity):指定容量的字符串缓冲区对象
         *		public StringBuffer(String str):指定字符串内容的字符串缓冲区对象
         *
         * StringBuffer的方法：
         *		public int capacity()：返回当前容量。	理论值
         *		public int length():返回长度（字符数）。 实际值
         */

        //public StringBuffer()
        //public StringBuffer(int capacity)
        //public StringBuffer(String str)

        /*
 * StringBuffer添加功能：
 * public StringBuffer append(String str):
      可以把任意类型数据添加到字符串缓冲区,并返回字符串缓冲区本身
 *
 * public StringBuffer insert(int offset,String str):
      在指定位置把任意类型的数据插入到字符串缓冲区里面,并返回字符串缓冲区本身
 */
        StringBuffer stringBuffer =new StringBuffer();
        //可以把任意类型数据添加到字符串缓冲区,并返回字符串缓冲区本身
        String str = "hello";
        //stringBuffer.append(str);
        StringBuffer stringBuffer1 = stringBuffer.append("hello");
        System.out.println(stringBuffer);
        System.out.println(stringBuffer1);
        System.out.println(stringBuffer==stringBuffer1);

        //链式添加
        stringBuffer.append("1123").append("321").append("hello");
        System.out.println(stringBuffer);

        //在指定位置把任意类型的数据插入到字符串缓冲区里面,并返回字符串缓冲区本身
        stringBuffer.insert(5,"work");
        System.out.println(stringBuffer);

        /*
         * StringBuffer的删除功能
         * public StringBuffer deleteCharAt(int index):删除指定位置的字符，并返回本身
         * public StringBuffer delete(int start,int end):删除从指定位置开始指定位置结束的内容，并返回本身
         */

        stringBuffer.deleteCharAt(5);
        System.out.println(stringBuffer);
        stringBuffer.delete(5,8);
        System.out.println(stringBuffer);

        /*
         * StringBuffer的替换功能：
         * public StringBuffer replace(int start,int end,String str):从start开始到end用str替换
         */
        stringBuffer.replace(5,12,str);
        System.out.println(stringBuffer);


        /*
         * StringBuffer的反转功能：
         * public StringBuffer reverse()
         */

        StringBuffer strb= new StringBuffer();
        strb.append("yuxinjiangevoli");
        System.out.println(strb);
        strb.reverse();
        System.out.println(strb);


        /*
         * StringBuffer的截取功能:注意返回值类型不再是StringBuffer本身了
         * public String substring(int start)
         * public String substring(int start,int end)
         */

        String s = stringBuffer.substring(5);
        System.out.println(s);
        String s1 = stringBuffer.substring(6,stringBuffer.length());
        System.out.println(s1);


        /*
         * 类之间的转换：
         *    A -- B的转换
         * 把A转换为B，其实是为了使用B的功能。
         *    B -- A的转换
         * 可能要的结果是A类型，所以还得转回来。
         *
         * String与StringBuffer的相互
         */


        //string  --- stringbuffer
        //StringBuffer直接赋值不可以
        //StringBuffer stringBuffer2 = "holle";

        //方式一  通过构造方法
        StringBuffer sb = new StringBuffer(str);
        System.out.println(sb);
        //方式二  通过append
        StringBuffer sb1 = new StringBuffer();
        sb1.append("holle");
        System.out.println(sb1);


        // stringbuffer  ---  string
        StringBuffer  sb3 = new StringBuffer("java");
        //方式一   通过构造方法
        String s2 = new String(sb3);
        System.out.println(s2);

        //方式二  通过tostring
        String str1 = sb3.toString();
        System.out.println(str1);




        /*
         * 把数组拼接成一个字符串
         */


       /* int[] array = {1,2,3,4,6,6};

        //方式一 通过stringpinjie
        String str2 = arrTostring(array);
        System.out.println(str2);

        //方式三  通过stringbuffer
        String stringBuffer2 = arrTostring2(array);
        System.out.println(stringBuffer2);*/


        StringBuffer ss = new StringBuffer("java");
        StringBuffer sss = new StringBuffer("ss");
        System.out.println("ss:"+ss+"\t"+"sss:"+sss);
        ss = sss;
        sss.append(ss);

        System.out.println(ss+"\t"+sss);



        String s4 = "hello";
        String s5 = "world";
        System.out.println(s4+"---"+s5);
        change(s4,s5);
        System.out.println(s4+"---"+s5);

        StringBuffer stringBuffer2 = new StringBuffer("java");
        StringBuffer stringBuffer3 = new StringBuffer("welcome");
        System.out.println(stringBuffer2+"---"+stringBuffer3);
        change1(stringBuffer2,stringBuffer3);
        System.out.println(stringBuffer2+"---"+stringBuffer3);


    }
    public  static  void  change(String s1,String s2){
            s1 = s2;
            s2 = s1 + s2;
    }
    public  static  void  change1(StringBuffer stringBuffer1,StringBuffer stringBuffer2){
        stringBuffer1 = stringBuffer2;
        stringBuffer2.append(stringBuffer1);
        System.out.println(stringBuffer1+"    "+stringBuffer2);


    }



    //string
    /*public static String arrTostring(int[] arr) {
        String s = "";
        s += "[";
        for (int i = 0 ;i<arr.length;i++){
            if (i==arr.length-1){
                s +=arr[i];
                s += "]";
            }else {
                s += arr[i];
                s += ",";
            }

        }
        return s;

    }*/

    //stringbuffer
    /*public  static  String arrTostring2(int[] arr){
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[");
        for (int i = 0 ;i<arr.length;i++){
            if (i==arr.length-1){
                stringBuffer.append(arr[i]);
                stringBuffer.append("]");
            }else {
                stringBuffer.append(arr[i]);
                stringBuffer.append(",");
            }

        }
        return stringBuffer.toString();



    }
    */

     /* 1：String,StringBuffer,StringBuilder的区别?
            *   A:String是内容不可变的，而StringBuffer,StringBuilder都是内容可变的。
            *   B:StringBuffer是同步的，数据安全,效率低;
                StringBuilder是不同步的,数据不安全,效率高
 *
         * 2：StringBuffer和数组的区别?
            *   都可以看出是一个容器
            *   StringBuffer的数据最终是一个字符串数据。
            *   而数组可以放置多种数据，但必须是同一种数据类型的。
            *
            * 3:形式参数问题
                 * String作为参数传递
                 * StringBuffer作为参数传递
     *
             * 形式参数：
                 * 		基本类型：形式参数的改变不影响实际参数
                 * 		引用类型：形式参数的改变直接影响实际参数
                 *
         * 注意：
            * 		String作为参数传递，效果和基本类型作为参数传递是一样的。
            */




}






