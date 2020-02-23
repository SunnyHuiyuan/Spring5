package com.local.demo04;

import com.local.demo02.UserService;
import com.local.demo02.UserServiceImpl;

/**
 * 动态代理通用模板
 */
public class Client {
    public static void main(String[] args) {
        //获取真实角色
        UserServiceImpl userService = new UserServiceImpl();
        //代理角色，不存在,先创建代理程序对象
        ProxyInvocationHandler pih = new ProxyInvocationHandler();

        pih.setTarget(userService);//设置要代理的对象
        UserService proxy = (UserService) pih.getProxy();//动态生成代理类

        proxy.add();
    }
}
