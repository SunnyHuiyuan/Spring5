package com.local.log;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Component(value = "afterLog")
public class AfterLog implements AfterReturningAdvice {

    //returnValue:返回值
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("执行了" + method.getName() + ",返回的结果为：" + returnValue);

    }
}
