package bigdecimal;

public class Test {
    public static void main(String[] args) {
        //装箱
        Integer i = 10;
        System.out.println(i);
        //拆箱
        int x = (int) i;
        System.out.println(x);


        //string ----基本类型
        String str = "1111";
        Integer a = Integer.parseInt(str);
        Integer b = Integer.valueOf(str);
        System.out.println(a);
        System.out.println(b);

        //基本类型----string
        int c = 20;
        String s = Integer.toString(c);
        System.out.println(s);
        String t = String.valueOf(c);
        System.out.println(t);
        String u = c + "";
        System.out.println(u);


    }
}
