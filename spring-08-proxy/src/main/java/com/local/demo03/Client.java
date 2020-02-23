package com.local.demo03;

/**
 * 动态代理
 */
public class Client {
    public static void main(String[] args) {
        //真实角色
        Host host = new Host();

        //代理角色：现在没有
        ProxyInvocationHandler pih = new ProxyInvocationHandler();

        //真实角色已经实现了抽象对象:rent接口了，代理角色还没实现
        //通过调用程序处理角色来处理我们要调用的接口对象！
        pih.setRent(host);

        //生成代理类，这里的Proxy就是动态生成的，我们并没有写
        Rent proxy = (Rent) pih.getProxy();

        proxy.rent();
    }
}
