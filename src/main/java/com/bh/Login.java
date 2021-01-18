package com.bh;

import com.bh.dao.Dao;
import com.bh.user.User;

import java.io.IOException;
import java.util.Scanner;

public class Login {
    public static void main(String[] args) throws IOException {

        Dao ud = new Dao();
        System.out.println("=====================================");
        boolean falg = true;
        while (falg){
            //主页面
            System.out.println("请选择");
            System.out.println("1.注册");
            System.out.println("2.登录");
            System.out.println("3.退出");
            Scanner sc = new Scanner(System.in);
            System.out.println("请选择相应的数字:");
            String input = sc.nextLine();
            switch (input){
                //注册
                case "1":
                    User user = new User();
                    System.out.println("注册用户名:");
                    String username = sc.nextLine();
                    if (username.contains("=")){
                        System.out.println("不可以使用特殊符号");
                    }else {
                        boolean falg2 =ud.verification(username);

                        if (falg2) {
                            user.setUsername(username);
                            System.out.println("注册密码:");
                            String password = sc.nextLine();
                            user.setPassword(password);
                        }else {
                            System.out.println("用户名已经存在");
                        }
                    }
                    break;
                    //登录
                case "2":
                    User user1 = new User();
                    System.out.println("请输入用户名:");
                    String username1 = sc.nextLine();
                    System.out.println("请输入密码:");
                    String password1 = sc.nextLine();
                    user1.setUsername(username1);
                    user1.setPassword(password1);
                    boolean falg1 = ud.isLogin(username1,password1);
                    if (falg1){
                        System.out.println("登录成功!");
                    }else {
                        System.out.println("用户名或密码错误!");
                    }
                    break;
                    //退出
                case "3":
                    falg = false;
                    break;
                default:
                    System.out.println("输入的用户名或密码错误!");
            }
        }

    }

}
