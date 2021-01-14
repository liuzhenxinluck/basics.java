package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class CollectionDeno  {
    public static void main(String[] args) {
                /* 数组和集合的区别?
 * 		                长度区别
                * 			数组的长度固定
                * 			集合长度可变
                * 	    内容不同
                * 			数组存储的是同一种类型的元素
                * 			而集合可以存储不同类型的元素
                * 		元素的数据类型问题
                * 			数组可以存储基本数据类型，也可以存储引用数据类型
                * 			集合只能存储引用类型
                *
                *
                * collection 是集合的顶层接口
                * 子接口有可重复，有唯一，有有序的，有无序的
                * */
  //不带all的：
        /*添加功能
         * 		boolean add(Object obj):添加一个元素
         * */
            //创建一个新的集合对象
        Collection collection = new ArrayList();
        collection.add("holle");
        collection.add("java");
        collection.add("world");

        /*删除功能
         * 		void clear():移除所有元素
         * 		boolean remove(Object o):移除一个元素
         * */
        collection.remove("java");
        System.out.println(collection);
        collection.clear();
        System.out.println(collection);
        /*判断功能
         * 		boolean contains(Object o)：判断集合中是否包含指定的元素
         * 		boolean isEmpty()：判断集合是否为空
         * */
        collection.add("java");
        collection.contains("java");
        collection.clear();
        System.out.println("是否为空:"+collection.isEmpty());
        /*长度功能
         * 		int size():元素的个数
         * */
        collection.add("java");
        collection.add("holle");
        collection.add("world");
        System.out.println("元素个数:"+collection.size());



        //带有all的代码

        Collection collection1 = new ArrayList();
        collection1.add("abc1");
        collection1.add("abc2");
        collection1.add("abc3");
        collection1.add("abc4");
        collection1.add("abc5");
        collection1.add("abc6");
        Collection collection2 = new ArrayList();
        collection2.add("abc1");
        collection2.add("abc2");
        collection2.add("abc3");
        collection2.add("abc4");
        collection2.add("abc5");
        collection2.add("abc6");
        collection2.add("abc7");

        //boolean addAll(Collection c):添加一个集合的元素(是一个还是所有)
        System.out.println("添加集合："+collection1.addAll(collection2));
        //boolean removeAll(object c):移除一个集合的元素(是一个还是所有)
        System.out.println("移除集合:"+collection1.removeAll(collection2));
        //boolean containsAll(Collection c):包含一个集合的元素(是一个还是所有)
        System.out.println("包含:"+collection2.containsAll(collection1));




        /*
         * 集合的遍历。是依次获取集合中的每一个元素。
         * Object[] toArray():把集合转成数组，可以实现集合的遍历
         */

        Collection c = new ArrayList();
        c.add("holle");
        c.add("world");
        c.add("java");
        Object[] objects = c.toArray();
        System.out.println(Arrays.toString(objects));
        /*for (int i = 0; i<objects.length;i++){
            String str = (String)objects[i];
            System.out.println(str+"----"+str.length());
        }*/


        /*
         * 练习：用集合存储5个学生对象，并把学生对象进行遍历。
         *
         * 分析：
         * A:创建学生类
         * B:创建集合对象
         * C:创建学生对象
         * D:把学生添加到集合
         * E:把集合转成数组
         * F:遍历数组
         */
        Collection list = new ArrayList();

        Student s1 = new Student("李梓萌", 27);
        Student s2 = new Student("李思思", 30);
        Student s3 = new Student("康辉", 33);
        Student s4 = new Student("海霞", 25);
        Student s5 = new Student("小尼", 22);
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);

        Object[] objs = list.toArray();
        //System.out.println(Arrays.toString(objs));
        for (int i =0;i<objs.length;i++){
            Student s = (Student) objs[i];
            System.out.println(s.usrename+"-----"+s.age);
        }





        /*
         * Iterator iterator():迭代器，集合的专用遍历方式
         * 		Object next():获取元素,并移动到下一个位置。
         * 		NoSuchElementException：没有这样的元素，因为你已经找到最后了。
         * 		boolean hasNext():如果仍有元素可以迭代，则返回 true。
         */
        Collection c1 = new ArrayList();

        // 创建并添加元素
        // String s = "hello";
        // c.add(s);
        c1.add("hello");
        c1.add("world");
        c1.add("java");

        // 实际返回的肯定是子类对象，是多态
        Iterator iterator = c1.iterator();

         while (iterator.hasNext()){
             String s = (String) iterator.next();
             System.out.println(s);
         }




    }


}
