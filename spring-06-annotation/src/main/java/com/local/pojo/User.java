package com.local.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//等价于：<bean id="user" class="com.local.pojo.User"/>
// @Component 组件的意思
@Component("user")
@Scope(scopeName = "singleton") //单例模式
public class User {

    //相当于 <property name="name",value="张三"/>
    @Value(value = "张三")
    public String name;

    //也可以在 set 方法上注入属性的值
    @Value(value = "张三")
    public void setName(String name) {
        this.name = name;
    }
}
