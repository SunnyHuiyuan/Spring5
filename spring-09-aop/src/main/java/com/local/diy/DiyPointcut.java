package com.local.diy;

import org.springframework.stereotype.Component;

@Component(value = "diyPointcut")
public class DiyPointcut {

    public void before(){
        System.out.println("******方法执行前******");
    }

    public void after(){
        System.out.println("******方法执行后******");
    }
}
