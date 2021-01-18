package com.bh.dao;

import com.bh.user.User;

import java.io.IOException;

public interface UserDao {
    public abstract boolean isLogin(String username,String password)throws IOException;

    public abstract void register(User user) throws IOException;
    public abstract boolean verification(String username ) throws  IOException;
}
