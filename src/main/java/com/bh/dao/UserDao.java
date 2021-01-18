package com.bh.dao;

import com.bh.user.User;

public interface UserDao {
    public abstract boolean isLogin(String username,String password);

    public abstract void register(User user);
    public abstract boolean verification(String username );
}
