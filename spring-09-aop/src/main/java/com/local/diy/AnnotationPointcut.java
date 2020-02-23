package com.local.diy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

//方式三：使用注解方式实现aop
//标注这个类是一个切面
@Aspect
@Component(value = "annotationPointcut")
public class AnnotationPointcut {

    //切入到切入点里面:且是前置切入
    @Before(value = "execution(* com.local.service.UserServiceImpl.*(..))")
    public void before() {
        System.out.println("方法前执行、、、");
    }

    @After(value = "execution(* com.local.service.UserServiceImpl.*(..))")
    public void after() {
        System.out.println("方法执行后、、、");
    }

    //在环绕增强中，我们可以给定一个参数，代表我们要获取处理切入的点
    @Around(value = "execution(* com.local.service.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("环绕前");

        //执行方法
        Object proceed = joinPoint.proceed();

        System.out.println("环绕后");
    }

}
