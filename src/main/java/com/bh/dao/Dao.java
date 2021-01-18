package com.bh.dao;

import com.bh.user.User;

import java.io.*;

public class Dao implements UserDao {

    //文件的创建
    private  static File file = new File("d://b.txt");
    static {
        try {
            file.createNewFile();
        }catch (FileNotFoundException fl){
            System.out.println("文件不存在!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    @Override
    public boolean isLogin(String username, String password) {
        boolean falg = false;
        BufferedReader read = null;
        try {

            read = new BufferedReader(new FileReader(file));

            String len = null;
            while ((len = read.readLine()) != null){//
                String[] str = len.split("=");
                if (str[0].equals(username) && str[1].equals(password)){
                    falg = true;
                    break;
                }
            }
        }catch (IOException e){
           e.printStackTrace();
        }finally {
            if (read!=null){
                try {
                    read.close();
                }catch (FileNotFoundException fl){
                    System.out.println("文件找不到!");

                }catch (IOException io){
                    io.printStackTrace();
                }
            }
        }
        return falg;
    }


    @Override
    public void register(User user)  {

        BufferedWriter bw = null;
        try {
        bw = new BufferedWriter(new FileWriter(file,true));
        bw.write(user.getUsername()+"="+user.getPassword());
        bw.newLine();
        bw.flush();
        } catch (IOException e) {
            System.out.println("注册失败!");
        }finally {
            if (bw!=null){
                try {
                    bw.close();
                } catch (FileNotFoundException fl){
                    System.out.println("文件不存在!");

                } catch (IOException io){
                    io.printStackTrace();
                }
            }
        }
    }


    @Override
    public boolean verification(String username)  {
        boolean falg = true;
        BufferedReader reader = null;
   try {

       reader = new BufferedReader(new FileReader(file));
       String str =null;
       while ((str = reader.readLine())!=null){
           String[] strs = str.split("=");
           if (username.equals(strs[0])){
               falg =false;
               break;
           }
       }
   }catch (FileNotFoundException fl){
       System.out.println("找不到文件!");
   }catch (IOException io){
       io.printStackTrace();
   }finally {
       if (reader!=null){
           try {
               reader.close();
           } catch (FileNotFoundException fl){
               System.out.println("文件不存在!");

           } catch (IOException io){
               io.printStackTrace();
           }
       }

   }
        return falg;
    }
}
