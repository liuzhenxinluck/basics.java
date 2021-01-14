package list_map;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {

        /*
         * 需求：List集合存储字符串并遍历。
         */

       /* List list = new ArrayList();
        list.add("holle");
        list.add("world");
        list.add("java");

        Iterator it = list.iterator();
        while (it.hasNext()) {
            String s = (String) it.next();
            System.out.println(s);

        }*/




        /*
         * List集合的特点：元素有序,并且每一个元素都存在一个索引.元素可以重复。
         */
   /*     List list1 = new ArrayList();
        list1.add(1);
        list1.add(2);
        list1.add(2);
        list1.add(3);

        Iterator it1 = list1.iterator();
        while (it1.hasNext()){
            int s1 = (int) it1.next();
            System.out.println(s1);
        }
        Integer remove = (Integer) list1.remove(0);
        System.out.println("移除的元素:"+remove);
        System.out.println(list1);
        System.out.println(list1.size());*/



        /*
         * 存储自定义对象并遍历
         */

    /*    List list = new ArrayList();
        list.add(2);
        list.add(9);
        list.add(6);
        list.add(5);
        Iterator it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }*/


        /*
         * List集合特有功能:
         */

        /* 添加功能
         * 		void add(int index,Object element):在指定位置添加元素
         */
        List list = new ArrayList();
        list.add("holle");
        list.add("world");
        list.add("welcome");
        list.add(3,"you");
        System.out.println(list);
        /*list.add(11,"haha");
        System.out.println(list);*/

          /* 获取功能
           *     Object get(int index):获取指定位置的元素
           */
        System.out.println(list.get(2));


        /* 列表迭代器
         * ListIterator listIterator()：List集合特有的迭代器
         */

        Iterator it = list.iterator();
        while (it.hasNext()){
            String s = (String) it.next();
            System.out.println(s);
        }


       /* 修改功能
        * 	Object set(int index,Object element):根据索引修改元素，返回被修饰的元素
        */

        list.set(0,"jave");
        System.out.println(list);

        /* 删除功能
         * 	Object remove(int index)：根据索引删除元素,返回被删除的元素
         */

        list.remove(0);
        System.out.println(list);








    }
}
