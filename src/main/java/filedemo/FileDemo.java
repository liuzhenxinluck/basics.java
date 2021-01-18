package filedemo;

import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) throws IOException {
        /*
         * 实现IO操作，须了解硬盘文件表现形式,Java就提供了一个类File
         * File:文件和目录(文件夹)路径名的抽象表示形式
         * 构造方法：
         * 		File(String pathname)：根据一个路径得到File对象
         * 		File(String parent, String child):根据一个目录和一个子文件/目录得到File对象
         * 		File(File parent, String child):根据一个父File对象和一个子文件/目录得到File对象
         */
        //File(String pathname)：根据一个路径得到File对象
            File file = new File("D:\\work\\a.txt");
            //ile(String parent, String child):根据一个目录和一个子文件/目录得到File对象
            File file2 = new File("d:\\work", "b.txt");
            //File(File parent, String child):根据一个父File对象和一个子文件/目录得到File对象
            File file3 = new File("d:\\work");
            File file4 = new File(file3, "c.txt");

        /*
         *创建功能：
         *public boolean createNewFile():创建文件 如果文件存在，则不创建
         *public boolean mkdir():创建文件夹 如果文件夹存在，则不创建
         *public boolean mkdirs():创建文件夹,如果父文件夹不存在，则一同创建
         *
         */
        //public boolean createNewFile():创建文件 如果文件存在，则不创建
        System.out.println(file.createNewFile());
        //public boolean mkdir():创建文件夹 如果文件夹存在，则不创建
        File file1 = new File("d:\\work\\demo");
        System.out.println(file1.mkdir());
        File file5 = new File("d:\\work\\demo\\demo\\22");
        System.out.println(file5.mkdirs());

        /*
         * 删除功能:public boolean delete()
         * 注意：
         * 		如果创建文件或者文件夹无路径，默认是项目路径
         * 		Java中的删除不经过回收站。
         * 		要删除一个文件夹，请注意该文件夹内不能包含文件或者文件夹
         */

        //System.out.println(file5.delete());

        System.out.println("-----------------------------------");
        /*
         * 重命名功能:public boolean renameTo(File dest)
         * 		如果路径名相同，就是改名。
         * 		如果路径名不同，就是改名并剪切。
         *
         * 路径以盘符开始：绝对路径	c:\\a.txt
         * 路径不以盘符开始：相对路径	a.txt
         */
       // System.out.println(file.renameTo(file3));
        System.out.println("------------------------------------");

        /*
         * 判断功能:
         * public boolean isDirectory():判断是否是目录
         * public boolean isFile():判断是否是文件
         * public boolean exists():判断是否存在
         * public boolean canRead():判断是否可读
         * public boolean canWrite():判断是否可写
         * public boolean isHidden():判断是否隐藏
         */

        //判断是否是目录
        System.out.println(file.isDirectory());
        System.out.println("----------------------");
        //判断是否是文件
        System.out.println(file.isFile());
        System.out.println("------------------------");
        //判断是否存在
        System.out.println(file.exists());
        System.out.println("---------------------------");
        //判断是否可读/写
        System.out.println(file.canRead());
        System.out.println(file.canWrite());
        System.out.println("------------------------------");
        //判断是否隐藏
        System.out.println(file.isHidden());
        System.out.println("------------------------------");


        /*
         * 获取功能：
         * public String getAbsolutePath()：获取绝对路径
         * public String getPath():获取相对路径
         * public String getName():获取名称
         * public long length():获取长度。字节数
         * public long lastModified():获取最后一次的修改时间，毫秒值
         */
            //获取绝对路径
        System.out.println(file.getAbsoluteFile());
        //获取想对路径
        System.out.println(file.getPath());
        //获取姓名
        System.out.println(file.getName());
        //获取长度
        System.out.println(file.length());
        //获取最后一次的修改时间
        String s = Long.toString(file.lastModified());
        System.out.println(s);





    }
}
