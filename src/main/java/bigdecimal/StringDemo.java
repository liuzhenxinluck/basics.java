package bigdecimal;

class StringDemo{
    public static void main(String[] args) {

        String s = "woaijavawozhenaijavawozhendeaijavawozhendehenaijavaxinbuxinwoaijavagun";
        int count = 0;
        String smalls= "java";
        int index  = s.indexOf(smalls);
        while (index!=-1){
            count++;
            s = s.substring(smalls.length()+index);
            index = s.indexOf(smalls);

        }
        System.out.println(count);











        /*
         * 字符串反转
         * 举例：键盘录入”abc”
         * 输出结果：”cba”
         */


        /*Scanner input = new Scanner(System.in);
        System.out.println("请输入刻录的字符串:");
        String str = input.nextLine();
        String s1 = "";
        char[] chs = str.toCharArray();
        for (int i=chs.length-1;i>=0;i--){
            s1+=chs[i];
        }
        System.out.println(s1);*/




        /*
         * 需求：把数组中的数据按照指定个格式拼接成一个字符串
         * 举例：
         * 		int[] arr = {1,2,3};
         * 输出结果：
         *		"[1, 2, 3]"
         */
        /*int[] arr = {1,2,3};
        String s = "";
        s+="[";
        for (int i =0; i<arr.length;i++){
            if (i==arr.length-1){
                s+=arr[i];
                s+="]";
            }else {
                s+=arr[i];
                s+=",";
            }
        }
        System.out.println(s);*/


        /*
         * String类的其他功能：
         *
         * 替换功能：
         * String replace(char old,char new)
         * String replace(String old,String new)
         *
         * 去除字符串两端空格
         * String trim()
         *
         * 按字典顺序比较两个字符串
         * int compareTo(String str)
         * int compareToIgnoreCase(String str)
         */
        //replace 替换功能
        /*String s = "holleworld";
        String s1 = s.replace("l","k");
        System.out.println(s1);
        String s2 = s.replace("hol","ak47");
        System.out.println(s2);*/

        //trim去除字符串两端的空格
        /*String s3 = " holleworld ";
        System.out.println(s3.trim());*/

        //compareTo 按字典顺序进行比较
        /*String s4 = "abc";
        String s5 = "xyz";
        String s6 = "holle";
        String s7 = "hollb";
        String s8 = "Holle";
        System.out.println(s6.compareTo(s7));
        System.out.println(s4.compareTo(s5));
        System.out.println(s6.compareToIgnoreCase(s8));*/








        /*
         * 需求：把一个字符串的首字母转成大写，其余为小写。(只考虑英文大小写字母字符)
         * 举例：
         * 		helloWORLD
         */

        /*String s = "holleWORLD";
        String s1 = s.substring(0,1);
        s1 = s1.toUpperCase(Locale.ROOT);
        String s2 = s.substring(1);
        s2 = s2.toLowerCase(Locale.ROOT);
        String str = s1.concat(s2);
        System.out.println(str);*/





        /*
         * String的转换功能：
         * byte[] getBytes():把字符串转换为字节数组。
         * char[] toCharArray():把字符串转换为字符数组。
         * static String valueOf(char[] chs):把字符数组转成字符串。
         * static String valueOf(int i):把int类型的数据转成字符串。
         * 		注意：String类的valueOf方法可以把任意类型的数据转成字符串。
         * String toLowerCase():把字符串转成小写。
         * String toUpperCase():把字符串转成大写。
         * String concat(String str):把字符串拼接。
         */
        //把字符串转换为字节数组
        /*String s = "JavaSE";
        byte[] bys = s.getBytes();
        for (int x = 0; x < bys.length; x++) {
            System.out.print(bys[x]+"\t");
        }

        System.out.println("");
        //把字符串转换为字符数组
        char[] chs = s.toCharArray();
        for (int x = 0; x < chs.length; x++) {
            System.out.print(chs[x]+"\t");
        }

        System.out.println();
        //把字符数组转换为字符串
        String s1 = String.valueOf(chs);
        System.out.println(s1);

        System.out.println();
        //把int类型的转换为字符串类型
        int i = 97;
        String s2 = String.valueOf(i);
        System.out.println(s2);

        //把字符串转换为大写
        System.out.println("toLowerCase:"+s.toLowerCase(Locale.ROOT));
        //把字符串转化为小写
        System.out.println("toUpperCase:"+ s.toUpperCase(Locale.ROOT));
        //字符串的拼接
        String s3 = "good";
        System.out.println("concat:"+s.concat(s3));
*/






        /*//public String()  初始化一个新创建的 String 对象，使其表示一个空字符序列。
        String string = new String();
        System.out.println("s1:" + string);
        System.out.println("string.length():" + string.length());
        System.out.println("----------------------------------------");


        //public String(byte[] byte) 通过使用平台的默认字符集解码指定的 byte 数组，构造一个新的 String。
        byte[] bys = {97,98,99,100,101,102};
        String s2 = new String(bys);
        System.out.println("s2:"+ s2);
        System.out.println("s2.length():" + s2.length());
        System.out.println("----------------------------------------");


        //public string(byte[] bytes,int index,int length)  通过使用平台的默认字符集解码指定的 byte 子数组，构造一个新的 String。
        String s3 = new String(bys,1,4);
        System.out.println("s3:" + s3);
        System.out.println("s3.length():" + s3.length());
        System.out.println("--------------------------------------------");


        //public String(char[] value) 分配一个新的 String，使其表示字符数组参数中当前包含的字符序列。
        char[] chs = {'a','b','c','d','e'};
        String s4 = new String(chs);
        System.out.println("s4:" + s4);
        System.out.println("s4.length()" + s4.length());
        System.out.println("-------------------------------------------");


        //public String(char[] value, int index,int count) 分配一个新的 String，它包含取自字符数组参数一个子数组的字符。
        String s5 =new String(chs,2,3);
        System.out.println("s5:" + s5);
        System.out.println("s5.length()" + s5.length());
        System.out.println("-------------------------------------------");
*/
        //public String(String original) 初始化一个新创建的 String 对象，使其表示一个与参数相同的字符序列；换句话说，新创建的字符串是该参数字符串的副本。
      /*  String s6= new String("abcde");
        System.out.println("s6:" + s6);
        System.out.println("s6.length()" + s6.length());
        System.out.println("-------------------------------------------");*/

        //
        /*String s7 =new String();
        System.out.println("s7:" + s7);
        System.out.println("s7.length():" + s7.length());
        System.out.println("-------------------------------------------");*/

        /*String s1 = new String("holle");
        String s ="holle";
        //s += "word";
        System.out.println(s);
        System.out.println(s.equals(s1));
        System.out.println(s==s1);*/

        /*char a = 'a';
        char b = 'a';
        System.out.println(a==b);*/





        /*
         * String类的判断功能：
         * boolean equals(Object obj):比较字符串的内容是否相同,区分大小写
         * boolean equalsIgnoreCase(String str):比较字符串的内容是否相同,忽略大小写
         * boolean contains(String str):判断大字符串中是否包含小字符串
         * boolean startsWith(String str):判断字符串是否以某个指定的字符串开头
         * boolean endsWith(String str):判断字符串是否以某个指定的字符串结尾
         * boolean isEmpty():判断字符串是否为空。
         *
         * 注意：
         * 		字符串内容为空和字符串对象为空。
         * 		String s = "";
         * 		String s = null;
         */

       /*

        String s1 = "holle";
        String s2 = "world";
        String s3 = "holleworld";
        String s4 = new String("holleworld");
        String s5 = new String("Holleworld");
        String s6 ="d";
        String s7 = "";
        String s8 =null;
        System.out.println(s3==s1+s2);//字符串的拼接之后比较是否相等  flast
        System.out.println(s1+s2); //字符串的拼接之后比较是否相等
        System.out.println(s3.equals(s1+s2)); //比较内容是否相等  true
        System.out.println(s3=="holleworld");
        System.out.println(s3.equals(s4));
        System.out.println(s4.equalsIgnoreCase(s5));//比较内容是否相等
        System.out.println(s4.concat(s1)); //字符串的拼接
        System.out.println(s4.contains(“world”));//判断大字符串中是否包含小字符串
        System.out.println(s1.startsWith("h"));//判断字符串是否以某个指定的字符串开头
        System.out.println(s1.endsWith("e"));/判断字符串是否以某个指定的字符串结尾
        System.out.println(s7.isEmpty());//判断字符串是否为空
        System.out.println(s8.isEmpty());
        */


        /*
         * 模拟登录,给三次机会,并提示还有几次。如果登录成功，就可以玩猜数字小游戏了。
         *
         * 分析：
         * 		A:定义用户名和密码。已存在的。
         * 		B:键盘录入用户名和密码。
         * 		C:比较用户名和密码。
         * 			如果都相同，则登录成功
         * 			如果有一个不同，则登录失败
         * 		D:给三次机会，用循环改进，最好用for循环。
         */
        /*String username ="admin";
        String password = "123456";
        for (int i =0; i<3;i++){
            Scanner input = new Scanner(System.in);
            System.out.println("请输入用户名：");
            String name = input.nextLine();
            System.out.println("请输入密码：");
            String psw = input.nextLine();
            if (name.equals(username)&&psw.equals(password)){
                System.out.println("登录成功！");
                //调用方法
                break;
            }else {
                if ((2-i)==0){
                    System.out.println("登录失败！");
                }else {
                    System.out.println("账户或密码错误。 你还有"+(2-i)+"机会");
                }
            }

        }


*/
        /*
         * String类的获取功能
         * int length():获取字符串的长度。
         * char charAt(int index):获取指定索引位置的字符
         * int indexOf(int ch):返回指定字符在此字符串中第一次出现处的索引。
         * 		为什么这里是int类型，而不是char类型?
         * 		原因是：'a'和97其实都可以代表'a'
         * int indexOf(String str):返回指定字符串在此字符串中第一次出现处的索引。
         * int indexOf(int ch,int fromIndex):返回指定字符在此字符串中从指定位置后第一次出现处的索引。
         * int indexOf(String str,int fromIndex):返回指定字符串在此字符串中从指定位置后第一次出现处的索引。
         * String substring(int start):从指定位置开始截取字符串,默认到末尾。
         * String substring(int start,int end):从指定位置开始到指定位置结束截取字符串。
         */
        /*String s1 = "hollejavahollejavahollejava";
        String s2 = "worldgoodgoodgood";
        String s3 = "holleworld";
        String s4 = new String("holleworld");
        String s5 = new String("Holleworld");
        System.out.println(s1.length());//获取字符串的长度
        System.out.println(s1.charAt(5));//获取指定索引位置的字符
        System.out.println(s1.indexOf("j"));//获取第一次出现指定字符的位置
        System.out.println(s1.indexOf("java"));//获取第一次出现指定字符串的位置
        System.out.println(s1.indexOf("j",6));//返回指定字符在此字符串中从指定位置后第一次出现处的索引。
        System.out.println(s1.indexOf("holle",6));//返回指定字符串在此字符串中从指定位置后第一次出现处的索引。
        System.out.println(s1.substring(5));//从指定位置开始截取字符串,默认到末尾。
        System.out.println(s1.substring(5,9));//从指定位置开始到指定位置结束截取字符串。
        */

 /*
 * 需求：
     统计一个字符串中大写字母字符，小写字母字符，数字字符出现的次数。(不考虑其他字符)
 * 举例：
 * 		"Hello123World"
 * 结果：
 * 		大写字符：2个
 * 		小写字符：8个
 * 		数字字符：3个
 */
        /*String s1= "Hello123World";
        int bigcount = 0;
        int smallcount = 0;
        int numcount = 0;
        for (int i =0;i<s1.length();i++){
             char ch = s1.charAt(i);
             if (ch>='0'&&ch<='9'){
                 numcount++;

             }else {
                 if (ch>='a'&&ch<='z'){
                     smallcount++;
                 }else {
                     bigcount++;
                 }
             }
        }
        System.out.println("大写字母:"+bigcount+"\n"+"小写字母:"+smallcount+"\n"+"数字:"+numcount);
    }*/






    }
}
