
/*
        Map中的集合，元素是成对存在的。每个元素由键与值两部分组成，通过键可以找对所对应的值。
* Map的功能概况:
    删除功能:
        void clear():从此映射中移除所有映射关系。
        void  remove(Object key):如果存在一个键的映射关系，则将其从此映射中移除。
    添加功能:
        put(K key, V value) :将指定的值与此映射中的指定键关联。
        putAll(Map<? extends K,? extends V> m) :从指定映射中将所有映射关系复制到此映射中。
     判断功能:
        boolean  isEmpty() :如果此映射未包含键-值映射关系，则返回 true。
        boolean containsKey(Object key) :如果此映射包含指定键的映射关系，则返回 true。
        boolean containsValue(Object value) :如果此映射将一个或多个键映射到指定值，则返回 true
        boolean equals(Object o) :比较指定的对象与此映射是否相等。
      获取功能:
        get(Object key) :返回指定键所映射的值；如果此映射不包含该键的映射关系，则返回 null
        int hashCode() :返回此映射的哈希码值
      长度功能:
        int size() :返回此映射中的键-值映射关系数
      替换功能:
        replace()：
   注意：
    Map中的集合不能包含重复的键，值可以重复；每个键只能对应一个值。

    Map中常用的集合为HashMap集合、LinkedHashMap集合。

*
* */




package mapdemo;

import java.util.*;

public class MapDemo {
    public static void main(String[] args) {

        String str = "33";

        /*
        * 添加功能:
        put(K key, V value) :将指定的值与此映射中的指定键关联。
        putAll(Map<? extends K,? extends V> m) :从指定映射中将所有映射关系复制到此映射中。
        */
        Map<String,String> map = new HashMap();
        Map map1 = new HashMap();
        map.put("1","22");
        map.put("2","33");
        map.put("3","hoole");
        map.put("4","world");
        map.put("5","22");

        map1.put(1,"welcome");
        map.putAll(map1);


         /*获取功能:
        get(Object key) :返回指定键所映射的值；如果此映射不包含该键的映射关系，则返回 null
        int hashCode() :返回此映射的哈希码值
        */
        System.out.println(map.get(1));
        System.out.println(map.get(4));
        System.out.println(map.get(9));
        System.out.println(map.hashCode());

        System.out.println("---------------------------------");

        /*
        * 长度功能:
        int size() :返回此映射中的键-值映射关系数
        * */

        System.out.println(map.size());
        System.out.println("------------------------------------");

         /*
        * 判断功能:
        boolean  isEmpty() :如果此映射未包含键-值映射关系，则返回 true。
        boolean containsKey(Object key) :如果此映射包含指定键的映射关系，则返回 true。
        boolean containsValue(Object value) :如果此映射将一个或多个键映射到指定值，则返回 true
        boolean equals(Object o) :比较指定的对象与此映射是否相等。
        */

        System.out.println(map.isEmpty());
        System.out.println(map.containsKey("2"));
        System.out.println(map.containsValue("22"));
        System.out.println(map.get("2").equals(str));
        System.out.println("-------------------------------------------------");

        /*替换功能:
            replace():
        *
        * */
        map.replace("2","java");
        System.out.println(map);


        /*删除功能:
        void clear():从此映射中移除所有映射关系。
        void  remove(Object key):如果存在一个键的映射关系，则将其从此映射中移除。
        */

        System.out.println(map.remove(5));
        System.out.println(map);

        System.out.println("---------------------------------");

        /*
        * Iterator iterator():迭代器，集合的专用遍历方式
        * Object next():获取元素,并移动到下一个位置。(NoSuchElementException：没有这样的元素，因为你已经找到最后了)
        * boolean hasNext():如果仍有元素可以迭代，则返回 true
        * */
        Iterator it = map.values().iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("---------------------------------------");

        Iterator iterator = map.keySet().iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        /*
            Hashmap:
        *       HashMap是Map的一个重要实现类(不支持线程同步)，也是最常用的，基于哈希表实现(是以键值对的方式存储，其底层是数组+链表)
        *       HashMap中是无序排列的
        *       Key值和value值都可以为null，只允许一条记录的键为NULL，允许多条记录的值为NULL(key不可重复)
                (与Hashtable区别):它不允许记录的键或者值为空；它支持线程的同步，即任一时刻只有一个线程能写Hashtable，
                                 因此也导致了Hashtable在写入时会比较慢
            Linkedmap:
                 LinkedHashMap集合底层是哈希表+链表：查询速度快
                 LinkedHashMap集合是一个有序的集合,存储元素和取出元素的顺序是一致的
                 Key值和value值都可以为null，允许多条记录的键和值都为NULL
            Treemap:
                TreeMap中的元素默认按照keys的自然排序排列
                Key值不可以为空，value值都可以为null，允许多条记录的值为NULL
        * */
            Map map2 = new HashMap();
            Map map3 = new LinkedHashMap();
            TreeMap map4 = new TreeMap();


            map3.put(1,99);
            map3.put(9,11);
            map3.put(3,66);
            map3.put(null,null);
            map3.put(6,null);
            map3.put(null,null);
        System.out.println(map3);

        System.out.println("--------------------------------");
        map4.put(1,9);
        map4.put(3,6);
        map4.put(2,20);
        map4.put(11,null);
        map4.put(12,null);
        System.out.println(map4);

        System.out.println("------------------------------------");

        Set<String> set = map.keySet();
        for (String key:set){
            String s = map.get(key);
            System.out.println(key+","+s);

        }
    }

}
