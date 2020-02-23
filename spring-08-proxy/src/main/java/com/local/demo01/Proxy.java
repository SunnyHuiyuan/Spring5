package com.local.demo01;

//代理角色
public class Proxy implements Rent{

    private Host host;

    public Proxy() {
    }

    public Proxy(Host host) {
        this.host = host;
    }

    //租房
    public void rent() {
        host.rent();
        seeHose();
    }

    //看房
    public void seeHose(){
        System.out.println("中介带你看房...");
    }
}
