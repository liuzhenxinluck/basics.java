package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {
    public static void main(String[] args) {
        /*
         * Collections:是针对集合进行操作的工具类，都是静态方法。
         *
         * Collection和Collections的区别
         * Collection:是单列集合的顶层接口，有子接口List和Set。
         * Collections:是针对集合操作的工具类，有对集合进行排序和二分查找的方法
         *
         * 方法
         * public static <T> void sort(List<T> list)：根据元素的自然顺序 对指定列表按升序进行排序。
         * public static <T> int binarySearch(List<?> list,T key):使用二分搜索法搜索指定列表，以获得指定对象。
         * public static <T> T max(Collection<?> coll):根据元素的自然顺序，返回给定 collection 的最大元素。
         * public static void reverse(List<?> list):反转指定列表中元素的顺序。
         * public static void shuffle(List<?> list):使用默认随机源对指定列表进行置换。
         */
        List<Integer> list = new ArrayList<Integer>();

        list.add(30);
        list.add(20);
        list.add(50);
        list.add(10);
        list.add(40);

        System.out.println("list:" + list);

        //排序
        Collections.sort(list);
        System.out.println(list);
        System.out.println("---------------------------------");

        //二分查找法
        Collections.binarySearch(list,list.get((int) (list.size())/2));
        System.out.println(list);
        System.out.println("----------------------------------");

        //最大值/最小值
        Integer num = 0;
        num = Collections.max(list);
        System.out.println(num);
        System.out.println("------------------------------------------");


        //反转
        Collections.reverse(list);
        System.out.println(list);
        System.out.println("-----------------------------------------------");


        //随机源置换(打乱顺序)
        Collections.shuffle(list);
        System.out.println(list);


    }
}
