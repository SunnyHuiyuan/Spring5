package com.local.demo02;

/**
 * 静态代理加深理解
 */
public class Client {
    public static void main(String[] args) {
        //真实角色对象
        UserServiceImpl userService=new UserServiceImpl();

        //代理角色对象
        UserServiceProxy proxy=new UserServiceProxy();

        //将真实角色丢给代理角色去管理
        proxy.setUserService(userService);

        proxy.add();
        proxy.delete();
        proxy.update();
    }
}
