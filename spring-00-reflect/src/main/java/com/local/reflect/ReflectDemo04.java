package com.local.reflect;

import com.local.domain.Person;

import java.lang.reflect.Method;

/**
 * 使用Class对象获取成员方法
 */
public class ReflectDemo04 {
    public static void main(String[] args) throws Exception {
        //0:获取Class对象
        Class personClass = Class.forName("com.local.domain.Person");

        //1、获取指定名称的方法
        Method eat = personClass.getMethod("eat");

        Person person = new Person();
        //2、方法对象 执行方法
        eat.invoke(person);


        Method eat1 = personClass.getMethod("eat", String.class);
        eat1.invoke(person, "面条");

        //------------------------------------------------------------

        //3、获取所有public修饰的方法
        Method[] methods = personClass.getMethods();
        for (Method method : methods) {
            System.out.println(method);
            String name = method.getName();
            System.out.println(name);
        }

        //4、获取类名
        String className = personClass.getName();
        System.out.println(className);

    }
}
