package com.local.service;

import com.local.dao.UserDao;

public class UserServiceImpl implements UserService {

    private UserDao userDao;


    //利用 set 进行动态值的注入！
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    //业务层去调Dao 层
    public void getUser() {
        userDao.getUser();
    }
}
