package list_son;

import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {
        /*
         * List特点：
         * 		ArrayList:
         * 			底层数据结构是数组，查询快，增删慢
         * 			线程不安全，效率高
         * 		Vector:
         * 			底层数据结构是数组，查询快，增删慢
         * 			线程安全，效率低
         * 		LinkedList:
         * 			 底层数据结构是链表，查询慢，增删快
         * 			线程不安全，效率高
         */


       /*  案例：
        * 	使用List的任何子类存储字符串或者存储自定义对象并遍历。
        * ArrayList的使用。存储字符串并遍历
        */

     /*   List list = new ArrayList();
        String str = "hello";
        list.add(str);
        list.add("11");
        list.add(11);
        list.add("world");
        Iterator it  =list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
            */

       /* List list   = new LinkedList();
        String str = "holle";
        list.add(str);
        list.add("11");
        list.add(11);
        Iterator it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }*/


           /*
            * Vector的特有功能：
            * 添加功能
            * 	public void addElement(Object obj)	--add()：将指定的组件添加到此向量的末尾，将其大小增加 1。
            * */

    /*    Vector list = new Vector();

        list.add("22");
        list.addElement("11");
        list.add("33");

        Iterator it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("----------------------------------------------");
        */

        /* 获取功能
         * 		public Object elementAt(int index)	--  get() 遍历
         * 		public Enumeration elements()	--Iterator iterator()
         * 		boolean hasMoreElements()		--hasNext()
         * 		Object nextElement()		--next()
         * */

      /*  for (int x = 0; x < list.size(); x++) {
            String s = (String) list.elementAt(x);
            System.out.println(s);
        }

        System.out.println("-----------------------------------------");

        Enumeration en  = list.elements();
        while (en.hasMoreElements()){
            String s = (String) en.nextElement();
            System.out.println(s);
        }*/



        /*
         * LinkedList的特有功能：
         * 		A:添加功能
         * 			public void addFirst(Object e)
         * 			public void addLast(Object e)
         * */

        LinkedList list = new LinkedList();
         list.add("11");
         list.addFirst("22");
         list.addLast("99");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());

        }

        /*获取功能
            *public Object getFirst()
            *public Obejct getLast()
         */
        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        /*
        * 删除功能：
        * public Object removeFirst()
        * public Object removeLast()
         */
        System.out.println(list.removeFirst());
        System.out.println(list.removeLast());
        System.out.println("-----------------------------------------------");
        /*
         * 获取10个1-20之间的随机数，要求不重复
         *
         * 用数组实现，但是数组的长度是固定，所以用集合实现。
         */
        List l = new ArrayList();
       /* for (int i =0 ; i <10;i++){
            int number = (int) (Math.random()*10+1);
            if ()
            l.add(number);
        }
        */
        int i = 0 ;
        while (i<10){
            int number = (int) (Math.random()*10+1);
            if (!l.contains(number)){
                l.add(number);
                i++;
            }

        }
        System.out.println(l);


        System.out.println("--------------------------------------");



    /*
     * 键盘录入多个数据，以0结束，要求在控制台输出这多个数据中的最大值
     */
        List ll = new ArrayList();
         int max = 0;
       boolean falg = true;
       while (falg){
           Scanner scanner = new Scanner(System.in);
           System.out.println("刻录数据（以0结束）:");
           int number = scanner.nextInt();
           if (number==0){
               falg=false;
           }else {
           ll.add(number);
           }
       }
       Integer[] arr = new  Integer[ll.size()];

       ll.toArray(arr);
        for (int x= 0; x<ll.size();x++){
            if (arr[x]>max){
                max=arr[x];
            }
        }
        System.out.println(max);












        }
    }

