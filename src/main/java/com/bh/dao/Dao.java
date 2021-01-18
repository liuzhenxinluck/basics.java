package com.bh.dao;

import com.bh.user.User;

import java.io.*;

public class Dao implements UserDao {
    private  static File file = new File("d://b.txt");
    static {
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    @Override
    public boolean isLogin(String username, String password) throws IOException {
        BufferedReader read = null;
        read = new BufferedReader(new FileReader(file));
        boolean falg = false;
        try {
            String len = null;
            while ((len = read.readLine()) != null){
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
                }catch (IOException io){
                    io.printStackTrace();
                }
            }
        }

        return falg;
    }

    @Override
    public void register(User user) throws IOException {

        BufferedWriter bw = null;
        try {
        bw = new BufferedWriter(new FileWriter(file,true));
        bw.write(user.getUsername()+"="+user.getPassword());
        bw.newLine();
        } catch (IOException e) {
            System.out.println("注册失败!");
        }finally {
            if (bw!=null){
                try {
                    bw.close();
                }catch (IOException io){
                    io.printStackTrace();
                }
            }
        }
    }

    @Override
    public boolean login1(String username) throws IOException {
        boolean falg = true;
        BufferedReader reader = null;
        reader = new BufferedReader(new FileReader(file));
        if (username.equals(file.getName())){
            falg =false;

        }
        return falg;
    }
}
